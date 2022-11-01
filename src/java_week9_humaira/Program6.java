package java_week9_humaira;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/*
6. Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Program6 {
    public static void main(String[] args) {
        //declaring array list using Integer wrapper class
        ArrayList<Integer> one = new ArrayList();

        one.add(25);
        one.add(35);
        one.add(45);
        one.add(55);
        one.add(65);
        one.add(75);
        one.add(85);
        one.add(95);
        one.add(105);

        for (int two:one) {
            //scanner declaration to get input from console
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number between 0 to 9 to retrieve value at that index: ");
            int n = scan.nextInt();
            System.out.println(one.get(n));
            //scanner object closed
            scan.close();
            break;
        }

    }
}
