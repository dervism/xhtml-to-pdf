package net.dervism;

import org.junit.Test;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: dervism
 * Date: 11.12.13
 * Time: 10:56
 */
public class FlyingSaucerDemoTest {

    @Test
    public void testToPdf() throws Exception {
        FlyingSaucerDemo demo = new FlyingSaucerDemo();

        // insert some text into the template
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("#toptext", "This running header is hidden in first page");
        params.put("#subtitle", "Demonstration of Flying Saucer Framework");
        params.put("#test_header", "This is a H2 header");
        params.put("#test_subheader", "This is a H4 header");
        params.put("#test_paragraph", "This is the first page");

        // create the pdf
        byte[] bytes = demo.toPdf("/template.html", params);

        // automatically load the file
        boolean view = true;
        if (view && Desktop.isDesktopSupported()) {
            try {
                String projectFolder = System.getProperty("user.dir");
                File file = new File(projectFolder + File.separator + "pdfdemo.pdf");
                FileOutputStream out = new FileOutputStream(file);
                out.write(bytes);
                Desktop.getDesktop().open(file);
            } catch (IOException ex) {

            }
        }
    }
}
