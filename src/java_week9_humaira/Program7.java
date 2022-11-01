package java_week9_humaira;

import java.util.ArrayList;

/*
7. Write a Java program to test an array list is empty or not.
Define array list with underground tube names

 */
public class Program7 {

    public static void main(String[] args) {
        ArrayList<String> tubeNames = new ArrayList();

        tubeNames.add("Jubilee line");
        tubeNames.add("Metropolitan line");
        tubeNames.add("Northern line");
        tubeNames.add("Piccadilly line");
        tubeNames.add("Victoria line");
        tubeNames.add("Waterloo line");
        tubeNames.add("City line");

        if(tubeNames.isEmpty()) {
            System.out.println("Array list is empty");
        }else {
            System.out.println("Array list is not empty");
        }
        }
    }


