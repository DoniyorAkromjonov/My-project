package school.qoshimcha;

import java.util.Scanner;

public class whileTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = 0;
        int p = 1;
        while (a < b) {
            if (a % 2 == 0) {
                p *= a;
            } else {
                s += p;
            }
            a++;

        }
        System.out.println(s);
        System.out.println(p);
    }
}
