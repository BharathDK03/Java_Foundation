import java.util.*;

public class Q08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter your choice 10");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println(Math.sqrt(a));
        } else if (choice == 2) {
            System.out.println(Math.max(a, b));
        } else if (choice == 3) {
            System.out.println(Math.min(a, b));
        } else if (choice == 4) {
            System.out.println(Math.abs(a));
        } else if (choice == 5) {
            System.out.println(Math.random());
        }
    }
}