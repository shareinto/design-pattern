import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/1/9.
 */
public class Program {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        List list = new ArrayList();
        list.add(1);
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list.remove(iterator.next());
        }
//        for (Object obj : list) {
//            list.remove(obj);
//        }
        OutputStream outputStream = new FileOutputStream("d:\\index.html", false);
        Global.out = new PrintStream(outputStream, true, "utf-8");
        Textbox textbox1 = new Textbox("username");
        Textbox textbox2 = new Textbox("password");
        Label label1 = new Label("username: ");
        Label label2 = new Label("password: ");
        Br br1 = new Br();
        Br br2 = new Br();
        Button button = new Button("login");
        Div div = new Div();
        div.add(label1);
        div.add(textbox1);
        div.add(br1);
        div.add(label2);
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
