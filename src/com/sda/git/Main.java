package com.sda.git;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Arraylist -
        //Linkiedlist -

        CustomLinkiedlist<String> cutomList = new CustomLinkiedlist<>();
        cutomList.add("1");
        cutomList.add("2");
        cutomList.add("3");
        cutomList.addTail("1");
        cutomList.addTail("2");
        cutomList.addTail("3");
        cutomList.prinlist();




        /**List<String> list = new LinkedList<>();

        list.add("Jan");
        list.add("Piotr");
        list.add("Jakub");

        for ( String l: list)
            System.out.println();*/

        

    }
}
