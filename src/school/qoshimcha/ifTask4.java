package school.qoshimcha;

import java.util.Scanner;

public class ifTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;

        if(a>0){
            count++;
        }
        if(b>0){
            count++;
        }
        if(c>0){
            count++;
        }
        System.out.println(count);

    }

}
