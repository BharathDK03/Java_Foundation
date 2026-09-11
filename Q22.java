import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        System.out.println(largest(10, 20, 30));
        System.out.println(pn(-8));

    }

    public static int largest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }

    }

    public static boolean pn(int a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }

    }
}
