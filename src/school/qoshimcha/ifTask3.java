package school.qoshimcha;

import java.util.Scanner;

public class ifTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>0) {
            a+=1;
        } else if (a==0) {
            a+=10;
        }else {
            a-= 2;
        }
        if (b>0) {
            b+=1;
        } else if (b==0) {
            b+=10;
        }else {
            b-=2;
        }
        if (c>0) {
            c+=1;
        } else if (c==0) {
            c+=10;
        }else {
            c-=2;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
