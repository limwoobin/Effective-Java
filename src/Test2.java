

public class Test2 {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();
        System.out.println(c instanceof Parent);
        System.out.println(p instanceof Child);

        System.out.println(c instanceof Child);
        System.out.println(p instanceof Parent);
    }
}


class Child extends Parent {

}

class Parent {

}