package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/28/15.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {

    private File file;
    private ArrayList<String> dictionary;

    public Dictionary(String fileName) {

        this.file = new File(fileName);
        dictionary = new ArrayList<String>();

        try {
            Scanner input = new Scanner(this.file);
            while (input.hasNext()) {
                dictionary.add(input.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getDictionary() {
        return this.dictionary;
    }

    public void setDictionary(ArrayList<String> dictionary) {
        this.dictionary = dictionary;
    }

    public ArrayList<String> search(String searchWord) {

        ArrayList<String> result = new ArrayList<String>();
        for(String word : dictionary) {
            if (word.contains(searchWord))
                result.add(word);
        }

        if (result.isEmpty()) {
            System.out.println("No result found.");
        }
        return result;
    }

    public ArrayList<String> prefixSearch(String searchWord) {

        ArrayList<String> result = new ArrayList<String>();

        for(String word : dictionary) {
            if (word.startsWith(searchWord))
                result.add(word);
        }

        if (result.isEmpty()) {
            System.out.println("No result found.");
        }
        return result;

    }

    public ArrayList<String> suffixSearch(String searchWord) {
        ArrayList<String> result = new ArrayList<String>();

        for(String word : dictionary) {
            if (word.endsWith(searchWord))
                result.add(word);
        }

        if (result.isEmpty()) {
            System.out.println("No result found.");
        }
        return result;
    }

    public static void main(String[] args) {

        Dictionary dic = new Dictionary("words");

        System.out.println(dic.getDictionary().size());

        for (String result : dic.search("sex")) {
            System.out.println(result);
        }
        //System.out.println(dic.search("sex").get(0));
        System.out.println(dic.search("sex").size());

    }
}
