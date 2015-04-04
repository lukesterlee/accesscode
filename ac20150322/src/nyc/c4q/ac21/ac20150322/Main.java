package nyc.c4q.ac21.ac20150322;

import java.net.URL;
import java.util.Scanner;

/**
 * Created by Luke Lee on 4/1/15.
 */
public class Main {

    public static URL makeHttpUrl(String host, int port, String path) {

        String address = "http://" + host;

        if (port != 80)
            address += ":" + port;

        address += path;

        return HTTP.stringToURL(address);
    }

    public static URL makeHttpUrl(String host, String path) {
        return makeHttpUrl(host, 80, path);
    }

    public static void printUrl(URL url) {
        System.out.println(url.getHost() + url.getPath());
        System.out.println();

        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
    }

    public static void main(String[] args) {
        URL url = makeHttpUrl("github.com", "/accesscode-2-1/unit-0");
        System.out.println(url);
        System.out.println();

        printUrl(url);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter URL address : ");
        String userUrl = input.next();


    }
}
