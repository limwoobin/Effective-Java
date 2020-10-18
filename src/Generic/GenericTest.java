package Generic;

public class GenericTest {
    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<>(new Integer[]{1 , 3 , 5 , 7 , 9});
        System.out.println(generic.getData(0));
        System.out.println(generic.getData(1));
        System.out.println(generic.getData(3));

        System.out.println("--------------------------");

        for (Integer i : generic.getArray()) {
            System.out.println(i);
        }

        System.out.println("--------------------------");

        Generic<String> genericString = new Generic<>(new String[]{"A" , "B" , "C" , "D" , "E"});
        System.out.println(genericString.getData(0));
        System.out.println(genericString.getData(1));
        System.out.println(genericString.getData(2));

        System.out.println("--------------------------");

        for (String s : genericString.getArray()) {
            System.out.println(s);
        }
    }
}


class Generic<T> {
    final T[] tArray;

    public Generic(T[] tArray) {
        this.tArray = tArray;
    }

    public T getData(int index) {
        return tArray[index];
    }

    public T[] getArray() {
        return tArray;
    }
}
