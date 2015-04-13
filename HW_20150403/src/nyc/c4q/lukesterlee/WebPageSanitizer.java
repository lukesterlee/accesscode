package nyc.c4q.lukesterlee;

import java.net.URL;
import java.util.Scanner;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/31/15.
 */
public class WebPageSanitizer {

    // Take the entire text body of an URL and delete all script tags and return it.
    public static String sanitize(String html) {

        int startIndex;
        int endIndex;

        while(true) {
            startIndex = html.indexOf("<script");
            endIndex = html.indexOf("</script>") + 9; // +9 in order to cut right before </script>
            if (startIndex != -1) {
                String delete = html.substring(startIndex, endIndex);
                html = html.replace(delete, "");
            }
            else
                break;
        }
        return html;
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
