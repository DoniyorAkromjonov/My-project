package school.qoshimcha;

import java.util.Scanner;

public class ifTask9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b) {
            b= (a-b)+1+b;
            System.out.println(a);
            System.out.println(b);
        }

    }
}
