package ru.otus.ocajp.webinar05;

// Определение областей действия переменных

// The "javac" command compiles into bytecode, which must be run in a Java virtual machine (JVM),
// and is not native machine code, so III is false as well.
public class Main {
    int x = 5;

    public static final void main(String... args) {
        System.out.println("Webinar#05.\nJDK: " + System.getProperty("java.version"));
        //x++; // compile error: on-static variable x cannot be referenced from a static context
    }

    // Локальные переменные нельзя затенять.
    private void myMethod(int w) {
        //int w = 10; // compile error: variable w is already defined in method myMethod(int)
        System.out.println(15); // ok
    }
}
