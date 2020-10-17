public class Test {
    public static void main(String[] args) {
        instanceTest("A");
        instanceTest(50);
    }

    static void instanceTest(Object o) {
        if (o instanceof String) {
            System.out.println("String True");
        }

        if (o instanceof Integer) {
            System.out.println("Integer True");
        }
    }
}
