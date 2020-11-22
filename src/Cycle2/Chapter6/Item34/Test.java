package Cycle2.Chapter6.Item34;


public class Test {

    public static void main(String[] args) {
        double x = 2.0;
        double y = 15.0;
        for (Operation3 op : Operation3.values()) {
            System.out.printf("%f %s %f = %f%n" , x , op , y , op.apply(x , y));
        }
    }
}
