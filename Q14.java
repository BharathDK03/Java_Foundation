
import java.util.*;

public class Q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month:");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("january it has 31 days");
                break;
            case 2:
                System.out.println("Febraury it has 28 days");
                break;
            case 3:
                System.out.println("march it has 31 days");
                break;
            case 4:
                System.out.println("April it has 30 days");
                break;
            case 5:
                System.out.println("may it has 31 days");
                break;
            case 6:
                System.out.println("june it has 30 days");
                break;
            case 7:
                System.out.println("july it has 31 days");
                break;
            case 8:
                System.out.println("August it has 31 days");
                break;
            case 9:
                System.out.println("September it has 30 days");
                break;
            case 10:
                System.out.println("October it has 31 days");
                break;
            case 11:
                System.out.println("November it has 30 days");
                break;
            case 12:
                System.out.println("December it has 31 days");
                break;

            default:
                System.out.println("enter the wrong input");

        }
        // number of days in the week

        System.out.println("enter the number of day");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;

            default:
                System.out.println("invalid input");
                break;
        }
    }

}
