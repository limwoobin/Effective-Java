package Generic.RecursiveTypeBound;

public class Ex2 {
    public static <T> int countGreaterThan(T[] anArray , T elem) {
        int count = 0;
        for (T e : anArray) {
//            if (e > elem) count++; --> compile error
        }
        // -> short, int, double 등과 같은 primitive 타입에만 > 와 같은 비교연산자를 사용할 수 있다.
        return count;
    }

    public static <T extends Comparable<T>> int countGreaterThan2(T[] anArray , T elem) {
        int count = 0;
        for (T e : anArray) {
            if (e.compareTo(elem) > 0) count++;
        }

        return count;
    }
}
