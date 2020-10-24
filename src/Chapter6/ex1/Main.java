package Chapter6.ex1;

public class Main {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 7.0;

        for (Operation2 op : Operation2.values()) {
            System.out.println(op);
        }

        for (Operation3 op : Operation3.values()) {
            System.out.printf("%f %s %f = %f%n" , x , op , y , op.apply(x,y));
        }

        System.out.println(PayrollDay2.MONDAY.pay(5 , 5));
    }
}
