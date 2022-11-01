package java_week9_humaira;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Program8 {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet();

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is present in the Hashset : ");
        int x = scan.nextInt();
        System.out.println();
        System.out.println("Is " + x + " present in the Hashset? \n" + numbers.contains(x));
    }
}
