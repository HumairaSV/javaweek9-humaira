package java_week9_humaira;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/*
5. Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Program5 {
    public static void main(String[] args) {
        //declaring array list where wrapper class Object is used to enable input of String and numbers
        ArrayList <Object> one = new ArrayList<>();

        one.add(1);
        one.add("Java");
        one.add("Theory");
        one.add("and");
        one.add("Program");
        one.add(100);

        Iterator<Object>two = one.iterator();
        while (two.hasNext()){
            System.out.println(two.next());
        }


    }
}
