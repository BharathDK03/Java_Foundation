public class Q16 {
    public static void main(String[] args) {
        // print square of all the digits from 1-10
        int i = 1;
        do {
            System.out.println(i * i);
            i++;
        } while (i <= 20);
        // neon number
        int n = 9;
        int sum = 0;

        int nu = n * n;
        while (nu != 0) {
            int digit = nu % 10;
            sum = sum + digit;
            nu = nu / 10;
        }

        if (sum == n) {
            System.out.println("Neon number");
        } else {
            System.out.println("Not neon number");
        }
        // for loop

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }

}
