package Cycle2.Item1;

public class Test {
    public static void main(String[] args) {
        Child mySon = Child.son("mySon");
        Child myDaughter = Child.daughter("myDaughter");

        System.out.println(mySon.toString());
        System.out.println(myDaughter.toString());
    }
}
