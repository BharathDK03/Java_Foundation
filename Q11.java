public class Q11 {
    public static void main(String[] args) {

        char C = 'a';

        String res = (C >= 'A' && C <= 'Z') || (C >= 'a' && C <= 'z') ? "upper" : "lower";
        System.out.println(res);

    }
}