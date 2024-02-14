package school.qoshimcha;

import java.util.Scanner;

public class ifTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        int count1 = 0;

        if(a>0){
            count++;
        }else {
            count1++;
        }
        if(b>0){
            count++;
        }else {
            count1++;
        }
        if(c>0){
            count++;
        }else {
            count1++;
        }

        System.out.println("plus sonlar "+count);
        System.out.println("minus sonlar " + count1);

    }

}
