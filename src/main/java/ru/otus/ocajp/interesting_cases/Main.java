package ru.otus.ocajp.interesting_cases;

public class Main {
    public static void main(String arg[]) {
        System.out.println("Interesting cases.\nJDK: " + System.getProperty("java.version"));

        int j = 0;
        // Перезапись переменной j (j = 0)
        j = j++; // warning: The value changed at "j++" and never used
        System.out.println("j = " + j); // 0

        int j2 = 0;
        // Перезапись переменной j не происходит
        j2++;
        System.out.println("j2 = " + j2); // 1

        int j3 = 0;
        int k = j3++;
        System.out.println("k = " + k + ", j3 = " + j3); // 0 1

        int pig = 4;
        // Increments pig by 1, but it returns the original value of 4 since it is using the post-increment operator.
        // The pig variable is then assigned this value, and the increment operation is discarded.
        pig = pig++;
        System.out.println("pig = " + pig); // 4
    }
}