import java.util.*;

public class Q23 {
    public static void main(String[] args) {
        char[] name = new char[5];
        name[0] = 'A';
        name[1] = 'B';
        name[2] = 'C';
        name[3] = 'D';
        name[4] = 'E';
        // System.out.println(name[0]);
        // System.out.println(name[1]);
        // System.out.println(name[2]);
        // System.out.println(name[3]);
        // System.out.println(name[4]);
        // System.out.println((int) name[0]);
        // System.out.println((int) name[1]);
        // System.out.println(name.length);
        // printing array by for llop
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        // printing array by while loop
        int j = 0;
        while (j < name.length) {
            System.out.println(name[j]);
            j++;
        }
        // printing array by do while loop
        int i = 0;
        do {
            System.out.println(name[i]);
            i++;
        } while (i < name.length);
    }
}
