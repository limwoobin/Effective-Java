

public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        try {
            int a2 = a;
            a2 = 3;
            a = a2;
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(a);
        }

        System.out.println("a: " + a);
    }
}
