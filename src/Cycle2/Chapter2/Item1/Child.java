package Cycle2.Chapter2.Item1;

public class Child {
    private String name;
    private Sex sex;

    public Child(String name , Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public static Child son(String name) {
        return new Child(name , Sex.MALE);
    }

    public static Child daughter(String name) {
        return new Child(name , Sex.FEMALE);
    }

    private enum Sex {
        MALE , FEMALE
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}


