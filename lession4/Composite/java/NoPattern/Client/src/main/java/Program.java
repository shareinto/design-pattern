import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by Administrator on 2017/1/9.
 */
public class Program {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        OutputStream outputStream = new FileOutputStream("d:\\index.html", false);
        Global.out = new PrintStream(outputStream, true, "utf-8");

        Textbox textbox1 = new Textbox("username");
        Textbox textbox2 = new Textbox("password");
        Br br1 = new Br();
        Br br2 = new Br();
        Button button = new Button("login");
        Div div = new Div();
        div.add(textbox1);
        div.add(br1);
        div.add(textbox2);
        div.add(br2);
        div.add(button);
        Body body = new Body();
        body.add(div);
        Pager pager = new Pager();
        pager.add(body);
        pager.add(new Header());
        PageRender.render(pager);


    }
}
