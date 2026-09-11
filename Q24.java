
public class Q24 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        printall(arr);
        add(arr);
        avg(arr);
        largest(arr);
        even(arr);
        odd(arr);
        positive(arr);
        negative(arr);
        total(arr);
    }

    public static void printall(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void add(int[] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];

        }
        System.out.println(sum);

    }

    public static void avg(int[] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        int avge = sum / arr.length;
        System.out.println(avge);

    }

    public static void largest(int[] arr) {
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }

        }
        System.out.println(max);

    }

    public static void even(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }

        }
        System.out.println(count);

    }

    public static void odd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static void positive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static void negative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static void total(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println(count);
    }

}
