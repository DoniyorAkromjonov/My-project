package lesson3;

public class MathOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        int sum = x + y;
        System.out.println(sum);

        int diff = x-y;
        System.out.println(diff);

        int mul = x*y;
        System.out.println(mul);

        double divide = (double) x/y;
        System.out.println(divide);

        int ext = y*y;
        System.out.println(ext);

        System.out.println(x += 10);
        System.out.println(x-= 10);
        System.out.println(x *= 10);
        System.out.println(x /= 10);


//        modulo - остаток от деления
        int modulo = 5%2;
        System.out.println("остаток от деления:" + modulo);

//        скобки
        int z = (2+2)*2;
        System.out.println(z);


        double w = 2.2;
        int q = 55;
        System.out.println((w*w)/q);



    }
}
