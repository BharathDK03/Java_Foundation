import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        // while loop to print all the alphabet
        char i = 'A';
        while (i < 'Z') {
            System.out.println(i);
            i++;
        }
        // while loop to print numbers from 1 to 10
        int j = 1;
        int n = 10;
        while (j <= n) {
            System.out.println(j);
            j++;
        }
        // reverse an integer digit
        int num = 2005;
        while (num != 0) {
            System.out.print(num % 10);
            num = num / 10;
        }
        //
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.err.println(rev);
        // plaindroem

        int numb = 121;
        int temp = numb;
        int reve = 0;
        while (numb != 0) {
            reve = reve * 10 + numb % 10;// rev * 10 is used to shift the existing digits of rev one position to the
                                         // left, so that we can add the new digit at the end.Think of it like this:numb
                                         // % 10 This gets the last digit of numb.
            numb = numb / 10;// numb = numb / 10; removes the last digit of an integer.
            System.out.println(reve);
        }
        if (temp == reve) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

        // sum of all digits
        int nm = 111;
        int sum = 0;
        while ((nm != 0)) {
            sum = sum + nm % 10;
            nm = nm / 10;

        }
        System.out.println(sum);

        // spy number
        int na = 123;

        int summ = 0;
        int product = 1;

        while (na != 0) {
            int digit = na % 10;

            summ = summ + digit;
            product = product * digit;

            na = na / 10;
        }

        if (summ == product) {
            System.out.println("Spy number");
        } else {
            System.out.println("Not spy number");
        }
    }

}
