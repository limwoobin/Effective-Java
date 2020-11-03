package Generic.SubTyping;

public class Ex {
    private static void someMethod(Number n) {

    }

    private static void boxTest(Box<Number> n) {

    }

    public static void main(String[] args) {
        someMethod(new Integer(10));    // ok
        someMethod(new Double(10.1));   // ok

        Box<Number> box = new Box<>();
        box.add(new Integer(10));       // ok
        box.add(new Double(10.5));      // ok

//        boxTest(new Box<Double>());           // compile error
//        boxTest(new Box<Integer>());          // compile error
    }
}

class Box<T> {
    public <T extends Number> void add(T t) {

    }
}
