import com.sun.org.apache.xml.internal.serializer.OutputPropertyUtils;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2017/1/17.
 */
public class Downloader {
    private final String url;
    private final String file;
    private DownloadProgress progress;
    private final State state = new State();

    public void setProgress(DownloadProgress progress) {
        this.progress = progress;
    }

    public State getState() {
        return this.state;
    }


    public Downloader(String url, String file) {
        this.url = url;
        this.file = file;
    }

    public void asyncDownload() {
        new Thread(new Runnable() {
            public void run() {
                try {
                    URL url = new URL(Downloader.this.url);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    //设置超时间为3秒
                    int total = conn.getContentLength();
                    InputStream inputStream = conn.getInputStream();
                    int read = 0;
                    int totalRead = 0;
                    byte[] buffer = new byte[4096];
                    OutputStream outputStream = new FileOutputStream(file);
                    while ((read = inputStream.read(buffer, 0, buffer.length)) > 0) {
                        outputStream.write(buffer, 0, read);
                        totalRead += read;
                        if (progress != null) {
                            progress.update(totalRead, total);
                        }
                    }
                    outputStream.flush();
                    outputStream.close();
                    if (progress != null) {
                        progress.complete();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }

    public class State {
        private int total;
        private int read;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getRead() {
            return read;
        }

        public void setRead(int read) {
            this.read = read;
        }
    }
}
