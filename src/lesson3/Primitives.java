package lesson3;

public class Primitives {
    public static void main(String[] args) {
        //Логические значения

        //Истина -> True
        boolean trueAnswer = true;

        //Ложь -> False
        boolean falseAnswer = false;

        //Целые числа
        //Byte - байт
        byte maxBite = 127;
        byte minBite = -128;

        //Short - короткое число - состоит из двух БАЙТ, или из 16 битов
        short maxShort = 32767;
        short minShort = -32768;

        //Integer - целое число, состоит из 4 байт, из 32 битов
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;

        //Long - целое число которое состоит из 8 байт или из 64 битов
        long minLong = 9_223_372_036_854_775_807L;
        long maxLong = -9_223_372_036_854_775_808L;

        //Double - дробные числа
        double doubleNumber = 1.12345678901234567890;
        System.out.println(doubleNumber);
        //Float - дробные числа
        float floatNumber = 1.12345678901234567890F;
        System.out.println(floatNumber);

//    char = символ
        char letter = 'A' + 1;
        System.out.println(letter);

        char newLine = '\n';
        System.out.print("A");
        System.out.print(newLine);
        System.out.print("B");
        char tab = '\t';
        char escape = '\\';
        System.out.println(escape);


    }
}
