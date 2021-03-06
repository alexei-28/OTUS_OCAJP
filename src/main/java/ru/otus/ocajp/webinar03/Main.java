package ru.otus.ocajp.webinar03;

/*-
   Дифференциация между ссылочными и примитивными переменными.
   Presentation: https://cdn.otus.ru/media/private/66/76/04___OCA_Java_Data_Types-1801-6676d4.pdf?hash=t6YSW0Luznf50WCrD1aHog&expires=1605657292
 */
public class Main {

    public static void main(String... args) {
        System.out.println("Webinar#03.\nJDK: " + System.getProperty("java.version"));

        //float f1 = 9.02; // compile error, because 9.02 is DOUBLE (by default)

        float f2 = 9.02F;
        System.out.println("f2 = " + f2);

        float f3 = 9e+2F; // -> 9 * 10^2 = 900.0
        System.out.println("f3 = " + f3);

        float f4 = Float.NaN;
        System.out.println("f4 = " + f4);

        double d = 5 / 6; // not correct result = 0.0
        System.out.println("d = " + d);

        double d2 = 5 / 6.0;
        System.out.println("d2 = " + d2); // correct result AS DOUBLE = 0.8333333333333334

        double d3 = 5 / 6.0F;
        System.out.println("d3 = " + d3); // result AS FLOAT = 0.8333333134651184

        double d4 = 0x12345678; // int = 305419896
        System.out.println("d4 = " + d4); // 3.05419896E8

        double d5 = 1234;
        System.out.println("d5 = " + d5); // 1234.0

        int i = Integer.MAX_VALUE; // MAX VALUE = 2147483647
        System.out.println("max = " + i);
        i++; // MINIMAL VALUE = -2147483648
        System.out.println("after_increment i = " + i);

        int[] a = null; // array is a Object
        System.out.println("a = " + a);

        int o = 0x10; // HEX format of 16
        System.out.println("o = " +  o);

    }
}
