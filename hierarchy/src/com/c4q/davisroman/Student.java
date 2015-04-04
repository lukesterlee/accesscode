package com.c4q.davisroman;

/**
 * Created by davis on 4/4/15.
 */
public class Student {
    private String name;
    private int numOfPencilsInPocket;
    private lunchbox lunchbox;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getNumOfPencilsInPocket(){
        return numOfPencilsInPocket;
    }

    public lunchbox getLunchbox() {
        return lunchbox;
    }

    public void setNumOfPencilsInPocket(int numOfPencilsInPocket){
        this.numOfPencilsInPocket = numOfPencilsInPocket;
    }
    public void setLunchBox(lunchbox item){

        lunchbox = item;

        //FIXME
    }
}
