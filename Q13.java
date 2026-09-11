import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        // the number ends with zero
        int n = 105;

        if (n % 10 == 0) {
            System.out.println("ends with zero");
        } else {
            System.out.println("not ends with zero");
        }
        // the number is special 2 digit number or not
        int num = 19;
        int tens = num / 10;
        int ones = num % 10;
        System.out.println(tens);
        System.out.println(ones);
        if (num == (tens + ones) + (tens * ones)) {
            System.out.println("the number is special 2 digit number");
        } else {
            System.out.println("the number is not special 2 digit number ");
        }
        // check the given input is character or digti

        Scanner sc = new Scanner(System.in);
        System.out.println("enetr a character:");
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("the character is digit");

        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("the character is upper case");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("the character is lower case");
        } else {
            System.out.println("this is a special character");
        }
        // check a given year is leapyear or not

        System.out.println("enter the year:");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("the year is leap year");

        } else {
            System.out.println("the year is not leap year");
        }

    }

}
