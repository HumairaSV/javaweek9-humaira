package java_week9_humaira;

import java.util.ArrayList;

/*
4. Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
 */
public class Program4 {

    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Indigo");
        colours.add("Violet");

        for (String a:colours) {
            System.out.println(a);
        }
    }
}
