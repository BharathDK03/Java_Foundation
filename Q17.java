import java.util.Scanner;
import java.util.*;

public class Q17 {
    public static void main(String[] args) {

        // for loop

        for (int j = 0; j < 3; j++) {
            System.out.println("hello");
        }
        // print only odd numbers 1-15
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        // print only even numbers 1-15
        for (int n = 1; n <= 15; n++) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
        int num = 8;
        int count = 0;
        for (int l = 1; l <= num; l++) {
            if (num % l == 0) {
                count++;
                System.out.println(count);
            }
        }
        // prime number

        Scanner s = new Scanner(System.in);
        System.out.println("enter the number ");
        int num1 = s.nextInt();
        int count1 = 0;

        for (int i = 1; i <= num1; i++) {

            if (num1 % i == 0) {
                count1++;
            }
        }

        if (count1 == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }

}
