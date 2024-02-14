package school.qoshimcha;

import java.util.Scanner;

public class ifTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>0) {
            a+=1;
        }
        if (b>0) {
            b+=1;
        }
        if (c>0) {
            c+=1;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
