package school.qoshimcha;

import java.util.Scanner;

public class ifTask8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a<b){
            System.out.println(b);
            System.out.println(a);
        }else {
            System.out.println(a);
            System.out.println(b);
        }
    }
}
