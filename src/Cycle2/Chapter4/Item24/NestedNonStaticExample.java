package Cycle2.Chapter4.Item24;

public class NestedNonStaticExample {
    private final String name;

    public NestedNonStaticExample(String name) {
        this.name = name;
    }

    public String getName() {
        NonStaticClass nonStaticClass = new NonStaticClass("nonStatic : ");
        return nonStaticClass.getNameWithOuter();
    }

    private class NonStaticClass {
        private final String nonStaticName;

        public NonStaticClass(String nonStaticName) {
            this.nonStaticName = nonStaticName;
        }

        public String getNameWithOuter() {
            return nonStaticName + NestedNonStaticExample.this.getName();
        }
    }
}
