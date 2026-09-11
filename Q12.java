public class Q12 {
    public static void main(String[] args) {
        double salary = 35345;
        double increment = 7.5;
        double finalsalary = salary * increment;
        System.out.println(finalsalary);

        int wholesalary = (int) finalsalary;
        System.out.println(wholesalary);

        double purchase = 499.8;
        double gst = 18.5;

        double finalbill = purchase * gst;
        System.out.println(finalbill);

        int bill = (int) finalbill;
        System.out.println(bill);

        double d = 129.9;
        byte by = (byte) d;
        System.out.println(by);
    }
}