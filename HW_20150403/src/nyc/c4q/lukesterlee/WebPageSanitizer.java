package nyc.c4q.lukesterlee;

import java.util.Scanner;

/**
 * Created by Luke Lee on 3/31/15.
 */
public class WebPageSanitizer {

    public static String sanitize(String html) {

        int startIndex = 0;
        int endIndex = 0;

        while (startIndex != -1) {
            startIndex = html.indexOf("<script>");
            endIndex = html.indexOf("</script") + 9;

            String delete = html.substring(startIndex, endIndex);

            html = html.replace(delete, "");

        }
        return html;

        //String regex = "<script>//+</script>";
        //return html.replaceAll(regex, "");
    }

    public static void main(String[] args) {

    }
}
