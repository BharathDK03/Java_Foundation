import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        Q19.eo(20);
        Scanner pr = new Scanner(System.in);
        int prime = pr.nextInt();
        prime(prime);

    }

    public static void prime(int prime) {

        int count = 0;
        for (int i = 1; i <= prime; i++) {
            if (prime % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }

}
