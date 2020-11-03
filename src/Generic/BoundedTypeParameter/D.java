package Generic.BoundedTypeParameter;

class A {}

interface B {}

interface C {}

public class D<T extends A & B & C> {
// Class 는 한개만 허용 , interface는 여러개 허용
}
