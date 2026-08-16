import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the name");
        String name = sc.next();
        System.out.println("enter the number in int");
        int num = sc.nextInt();
        System.out.println("enter the number in float");
        float numb = sc.nextFloat();
        System.out.println(name + num + numb);

    }
}
