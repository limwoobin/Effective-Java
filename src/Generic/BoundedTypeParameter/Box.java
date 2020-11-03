package Generic.BoundedTypeParameter;

public class Box<T extends Number> {
    public void set(T value) {

    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
//        box.set("HI"); --> compile error
    }
}
