package nyc.c4q.lukesterlee;

import java.net.URL;
import java.util.Scanner;

/**
 * Created by Luke Lee on 3/31/15.
 */
public class WebPageSanitizer {

    public static String sanitize(String html) {

        int startIndex;
        int endIndex;

        while(true) {
            startIndex = html.indexOf("<script");
            endIndex = html.indexOf("</script>") + 9;
            if (startIndex != -1) {
                String delete = html.substring(startIndex, endIndex);
                html = html.replace(delete, "");
            }
            else
                break;
        }


        return html;

        //String regex = "<script>//+</script>";
        //return html.replaceAll(regex, "");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an URL : ");

        String userUrl = input.nextLine();

        URL url = HTTP.stringToURL(userUrl);

        String html = HTTP.get(url);

        System.out.println(sanitize(html));
        //System.out.println(html);


    }
}
