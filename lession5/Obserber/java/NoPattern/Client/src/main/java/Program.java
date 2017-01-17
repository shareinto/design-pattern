import java.io.IOException;

/**
 * Created by Administrator on 2017/1/17.
 */
public class Program {
    public static void main(String[] args) throws IOException {
        Downloader downloader = new Downloader("http://cdncs.101.com/v0.1/static/job_executor/GoogleSignIn-4.0.1.tar.gz?attachment=true&serviceName=job_executor","D:\\vs.exe");
        downloader.setProgress(new DownloadProgress());
        downloader.asyncDownload();
        System.in.read();
    }
}
