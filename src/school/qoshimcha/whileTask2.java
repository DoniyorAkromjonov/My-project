package school.qoshimcha;

import java.util.Scanner;

public class whileTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = 0;
        int p = 1;
        while (a<b){
            if (a % 3 == 0){
                p*=a;
            }else if(a%5 == 0) {
                s+=p;
            }else {
                a=a;
                b=b;
                p=p;
                s=s;
            }
            a++;

        }
        System.out.println(s);
        System.out.println(p);
    }
}
