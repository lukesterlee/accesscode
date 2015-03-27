package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/26/15.
 */
import java.awt.*;
import java.util.ArrayList;

public class Subway {

    public static void drawBar(Graphics2D g, Color color, int y, int count, String letter) {
        // Step 4.
        // Implement this method. It takes the Graphics2D instance and some
        // data we need to create a single bar on the bar chart.
        //throw new UnsupportedOperationException("Not implemented yet");

        g.setColor(color);
        g.fillRect(20, y, count, 10);
        g.drawString(letter,5,y+10);
        g.drawString(count+"",count+25,y+10);



    }

    public static int countEntrances(ArrayList<ArrayList<String>> lines, String subwayLine) {
        // Step 3.
        // Implement this method. It takes an ArrayList of an ArrayList of
        // Strings and the subway line we're interested in and returns the
        // number of entrances for that line.
        int count = 0;
        String line = "";

        for (int i = 0; i < lines.size(); i++) {
            line = lines.get(i).get(2);
            if (line.contains(subwayLine)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // This creates a 500x250 pixel drawing.
        DrawingPanel panel = new DrawingPanel(500, 260);
        // This gets a Graphics2D object that we can use to draw on the panel.
        Graphics2D g = panel.getGraphics();

        // Step 1:
        // Modify this String to indicate the full path to the subway
        // data on your computer. Run your program. If it does not throw an
        // error, you are referencing the file correctly.
        File f = new File("C:\\Users\\Luke\\Desktop\\accesscode\\AC_20150326\\src\\subway-data.txt");


        // Step 2.
        // Get the lines as a nested ArrayList of Strings from the File
        // instance. Make sure everything is working correctly by
        // printing the data.

        ArrayList<ArrayList<String>> lines = f.getLines();

        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i).get(2));
        }

        // Step 3.
        // Implement countEntrances().

        // Step 3b.
        // Ensure countEntrances is correct by printing out the counts for a
        // few subway lines!
        int numOf1 = countEntrances(lines,"1");
        int numOf2 = countEntrances(lines,"2");
        int numOf3 = countEntrances(lines,"3");

        int numOf4 = countEntrances(lines,"4");
        int numOf5 = countEntrances(lines,"5");
        int numOf6 = countEntrances(lines,"6");

        int numOf7 = countEntrances(lines,"7");

        int numOfA = countEntrances(lines,"A");
        int numOfC = countEntrances(lines,"C");
        int numOfE = countEntrances(lines,"E");

        int numOfB = countEntrances(lines,"B");
        int numOfD = countEntrances(lines,"D");
        int numOfF = countEntrances(lines,"F");
        int numOfM = countEntrances(lines,"M");

        int numOfG = countEntrances(lines,"G");

        int numOfJ = countEntrances(lines,"J");
        int numOfZ = countEntrances(lines,"Z");

        int numOfL = countEntrances(lines,"L");
        int numOfS = countEntrances(lines,"S");

        int numOfN = countEntrances(lines,"N");
        int numOfQ = countEntrances(lines,"Q");
        int numOfR = countEntrances(lines,"R");

        // Step 4.
        // Implement drawBar().

        drawBar(g,new Color(255,51,51),0,numOf1,"1");
        drawBar(g,new Color(255,51,51),12,numOf2,"2");
        drawBar(g,new Color(255,51,51),24,numOf3,"3");

        drawBar(g,new Color(0,153,51),36,numOf4,"4");
        drawBar(g,new Color(0,153,51),48,numOf5,"5");
        drawBar(g,new Color(0,153,51),60,numOf6,"6");

        drawBar(g,new Color(204,0,204),72,numOf7,"7");

        drawBar(g,new Color(0,102,153),84,numOfA,"A");
        drawBar(g,new Color(0,102,153),96,numOfC,"C");
        drawBar(g,new Color(0,102,153),108,numOfE,"E");

        drawBar(g,new Color(255,153,51),120,numOfB,"B");
        drawBar(g,new Color(255,153,51),132,numOfD,"D");
        drawBar(g,new Color(255,153,51),144,numOfF,"F");
        drawBar(g,new Color(255,153,51),156,numOfM,"M");

        drawBar(g,new Color(153,204,0),168,numOfG,"G");

        drawBar(g,new Color(153,102,0),180,numOfJ,"J");
        drawBar(g,new Color(153,102,0),192,numOfZ,"Z");

        drawBar(g,new Color(167,169,172),204,numOfL,"L");
        drawBar(g,new Color(128,129,131),216,numOfS,"S");

        drawBar(g,new Color(252,204,10),228,numOfN,"N");
        drawBar(g,new Color(252,204,10),240,numOfQ,"Q");
        drawBar(g,new Color(252,204,10),252,numOfR,"R");


    }

}