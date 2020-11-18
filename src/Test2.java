

public class Test2 {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();
        System.out.println(c instanceof Parent);
        System.out.println(p instanceof Child);

        System.out.println(c instanceof Child);
        System.out.println(p instanceof Parent);

        Parent parent = new Child();
        parent.parentPrint();

        Ftest ftest = new Ftest();
        ftest.fPrint();
    }
}


class Child extends Parent {
    void childPrint() {
        System.out.println("child~");
    }
}

class Parent {
    void parentPrint() {
        System.out.println("parent~");
    }
}

final class Ftest {
    final void fPrint() {
        System.out.println("fPrint~");
    }
}