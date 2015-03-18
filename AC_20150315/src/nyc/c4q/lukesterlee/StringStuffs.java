package nyc.c4q.lukesterlee;

public class StringStuffs {

    public static void printReverse(String text) {

        for (int i=text.length() - 1;i >= 0; i--) {
            System.out.print(text.charAt(i));
        }

    }

    public static String swapTwoChars(String text) {
        String result = "";

        for (int i=0; i<text.length()-2; i+=2) {
            result += text.charAt(i+1);
            result += text.charAt(i);
        }

        return result;
    }

    public static String repeat(char input, int length) {
        String result = "";

        for (int i=1; i <= length; i++) {
            result += input;
        }
        return result;
    }

    public static void printInBox(String text) {

        print("+" + repeat('-', text.length() + 2) + "+\n\n");
        print("| " + text + " |\n\n");
        print("+" + repeat('-', text.length() + 2) + "+\n\n");



    }

    public static String repeatTimes(String text, int length) {
        String result = "";
        for (int i=0; i<length; i++) {
            result += text.charAt(i%text.length());
        }
        return result;
    }

    public static void print(String message) {
        System.out.print(message);
    }

    public static String substring(String text, int start, int end) {
        String result = "";
        for (int i = start; i<end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static String swapHalves(String text) {
        int midpoint = text.length()/2;
        return text.substring(midpoint,text.length()) + text.substring(0,midpoint);
    }

    public static void printTriangle(String text) {
        for(int i=0; i<=text.length(); i++) {
            print(text.substring(0,i) + "\n");
        }
    }

    public static void main(String[] args) {
	// write your code here

        //printReverse("Hello, my name is Luke Lee");
        //String text = swapTwoChars("Hello, this is Luke Lee and I'm hungry.");
        //System.out.println("\n" + text);
        //printInBox("Hello Vanice, your name is the city Vanice.");
        print(swapHalves("Hello"));
        printTriangle("Hello");
    }
}
