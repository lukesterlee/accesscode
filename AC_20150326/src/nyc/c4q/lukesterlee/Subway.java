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
        g.fillRect(20, y, count, 20);
        g.drawString(letter,0,y*2);



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
        DrawingPanel panel = new DrawingPanel(500, 250);
        // This gets a Graphics2D object that we can use to draw on the panel.
        Graphics2D g = panel.getGraphics();

        // Step 1:
        // Modify this String to indicate the full path to the subway
        // data on your computer. Run your program. If it does not throw an
        // error, you are referencing the file correctly.
        File f = new File("/Users/Willee/Desktop/accesscode/AC_20150326/src/subway-data.txt");


        // Step 2.
        // Get the lines as a nested ArrayList of Strings from the File
        // instance. Make sure everything is working correctly by
        // printing the data.

        ArrayList<ArrayList<String>> lines = f.getLines();

        for (int i = 0; i < lines.size(); i++) {
            //System.out.println(lines.get(i).get(2));
        }

        // Step 3.
        // Implement countEntrances().

        // Step 3b.
        // Ensure countEntrances is correct by printing out the counts for a
        // few subway lines!
        int numOfF = countEntrances(lines,"F");
        System.out.println(numOfF);

        int numOfG = countEntrances(lines,"G");
        System.out.println(numOfG);

        int numOfM = countEntrances(lines,"M");
        System.out.println(numOfM);

        int numOfQ = countEntrances(lines,"Q");
        System.out.println(numOfQ);

        int numOfD = countEntrances(lines,"D");
        System.out.println(numOfD);

        int numOfR = countEntrances(lines,"R");
        System.out.println(numOfR);

        int numOf1 = countEntrances(lines,"1");
        System.out.println(numOf1);

        int numOf2 = countEntrances(lines,"2");
        System.out.println(numOf2);

        int numOf3 = countEntrances(lines,"3");
        System.out.println(numOf3);

        int numOf4 = countEntrances(lines,"4");
        System.out.println(numOf4);

        int numOf5 = countEntrances(lines,"5");
        System.out.println(numOf5);

        int numOf6 = countEntrances(lines,"6");
        System.out.println(numOf6);

        int numOfA = countEntrances(lines,"A");
        System.out.println(numOfA);

        int numOfC = countEntrances(lines,"C");
        System.out.println(numOfC);

        int numOfJ = countEntrances(lines,"J");
        System.out.println(numOfJ);

        int numOfZ = countEntrances(lines,"Z");
        System.out.println(numOfZ);

        // Step 4.
        // Implement drawBar().

        drawBar(g,Color.orange,0,numOfF,"F");
        drawBar(g,Color.green,20,numOfG,"G");
        drawBar(g,Color.orange,40,numOfM,"M");
        drawBar(g,Color.orange,60,numOfR,"R");
        drawBar(g,Color.green,80,numOf1,"1");
        drawBar(g,Color.green,100,numOf2,"2");
        drawBar(g,Color.green,120,numOf3,"3");
        drawBar(g,Color.green,140,numOf4,"4");
        drawBar(g,Color.green,160,numOf5,"5");
        drawBar(g,Color.green,180,numOf6,"6");

    }

}