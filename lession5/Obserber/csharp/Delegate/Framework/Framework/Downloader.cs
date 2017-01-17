using Protocol;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace Framework
{
    public class Downloader
    {
        private string _url;
        private string _file;
        public event ProgressHandler ProgressUpdated;
        public Downloader(string url, string file)
        {
            this._url = url;
            this._file = file;
        }


        private void Notify(State state)
        {
            if (ProgressUpdated != null)
            {
                ProgressUpdated(state);
            }
        }

        public void AsyncDownload()
        {
            new Task(() =>
            {
                var request = WebRequest.Create(this._url) as HttpWebRequest;
                using (var response = request.GetResponse())
                {
                    using (var input = response.GetResponseStream())
                    {
                        using (var output = new FileStream(this._file, FileMode.OpenOrCreate, FileAccess.ReadWrite))
                        {
                            int read = 0;
                            byte[] buffer = new byte[4096];
                            var total = response.ContentLength;
                            int totalRead = 0;
                            var state = new State();
                            state.Total = (int)total;
                            while ((read = input.Read(buffer, 0, buffer.Length)) > 0)
                            {
                                output.Write(buffer, 0, read);
                                totalRead += read;
                                state.Read = totalRead;
                                Notify(state);
                            }
                            state.Completed = true;
                            Notify(state);
                        }
                    }
                }
            }).Start();
        }
    }
}
