package java_week9_humaira;

import java.util.Scanner;

/*
3. Write a Java program to reverse an array of integer values.
 */
public class Program3 {


    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.reverseArray();
    }

    //method to reverse the array
    public void reverseArray() {
        int a[] = {1, 3, 5, 9, 11, 13, 257,32,154};
        System.out.println("Original array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse is: ");
        for (int i = a.length - 1; i > 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}

