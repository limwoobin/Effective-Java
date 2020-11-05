

public class Test {
    private static int val;
    private int val2;

    static class StaticInner {
        private static int s1 = val;
    }

    class Inner {
        private int a1 = val;
        private int a2 = val2;
    }

    public void local(int param) {
        int d = 20;

        class LocalInner {
            int localVar;

            void localMethod() {
                System.out.println(localVar);
                System.out.println(param);
                System.out.println(val);
                System.out.println(val2);
                System.out.println(d);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.localMethod();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.local(100);
    }
}



