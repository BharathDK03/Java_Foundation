import java.util.*;

public class Q18 {
    public static void main(String[] args) {
        System.out.println("main start");
        add(10, 10);
        sub(4, 2);
        mul(2, 2);
        div(100, 10);
        rem(8, 2);
        System.out.println("main end");
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void sub(int c, int d) {
        System.out.println(c - d);
    }

    public static void mul(int e, int f) {
        System.out.println(e * f);
    }

    public static void div(int g, int h) {
        System.out.println(g / h);
    }

    public static void rem(int i, int j) {
        System.out.println(i % j);
    }

}
