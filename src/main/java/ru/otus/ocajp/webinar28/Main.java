package ru.otus.ocajp.webinar28;

/*-
    Разработка кода, демонстрирующего полиморфизм;
    включая переопределение и противопоставление объектного типа ссылочному.

     - Переменные НЕ переопределяются (overriding).
     - Методы не final, не static и не private могут переопределяться (overriding).
       Такие методы называются виртуальными.
 */
public class Main {
    // compile error. Final variable must be init
    //private final Object testObj;

    // static final variables must be set when they are declared or in a static initialization block.
    // compile error
    // private final static String testFinalStatic;

    private static String testStatic;

    public static final void main(String args[]) {
        System.out.println("Webinar#28.\nJDK: " + System.getProperty("java.version"));
        // Полиморфизм:
        C o1 = new C();
        B o2 = o1; // Reftype (слева),  Actype(actual type/object reference) (справа)

        // Методы ВСЕГДА берутся из reftype.
        // Потом они подменяются на actype если методы переопределены.
        // На этапе компиляции смотрим на reftype (то что слева).

        // Какой метод будет использоваться зависит от actype(C)
        System.out.println("o1.someMethod (depend on actype) = " + o1.someMethod()); // 30

        System.out.println("o2.someMethod (depend on actype) = " + o2.someMethod()); // 30

        // Какая именно переменная будет использоваться зависит от reftype(B)
        System.out.println("o2.someVariable (depend on reftype) = " + o2.someVariable); // 20

        // The reftype(B) of the variable determines which hidden(static) method will be called at runtime
        // Compile replace "o2.someStaticMethod()" by "B.someStaticMethod()"
        System.out.println("o2.someStaticMethod() (depend on reftype) = " + o2.someStaticMethod()); // B.someStaticMethod

        //test(2);
        System.out.println("testStatic = " + testStatic); // testStatic = null
    }

    /*-
     Compile error: missing return statement
     У нас развилка: если, то..., иначе...
     Во втором иначе мы снова делаем развилку: если, то... А "иначе" второго нет.
     Компилятор не знает, что у нас там с условиями. Перекрываются они, не перекрываются...

     private static boolean test(int price) {
        if (price < 10) {
            return true;
        } else if (price >= 10){
            return false;
        }
    }
     */
}
