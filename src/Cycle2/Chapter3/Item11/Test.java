package Cycle2.Chapter3.Item11;

public class Test {
    public static void main(String[] args) {
        Hash hash = new Hash(5 , 3 , 2);
        Hash hash2 = new Hash(5 , 3 , 2);

        Hash hash3 = new Hash(2 , 3 , 5);
        Hash hash4 = new Hash(3 , 5 , 2);

        System.out.println("hash: " + hash.hashCode());
        System.out.println("hash2: " + hash2.hashCode());
        System.out.println("hash3: " + hash3.hashCode());
        System.out.println("hash4: " + hash4.hashCode());
    }
}
