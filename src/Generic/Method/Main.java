package Generic.Method;


public class Main {
    public static void main(String[] args) {
        Pair<Integer , String> p1 = new Pair<>(1 , "apple");
        Pair<Integer , String> p2 = new Pair<>(2 , "pear");
        boolean result = Util.compare(p1 , p2);
        boolean result2 = Util.<Integer , String>compare(p1 , p2);

        System.out.println(result);
        System.out.println(result2);
    }
}
