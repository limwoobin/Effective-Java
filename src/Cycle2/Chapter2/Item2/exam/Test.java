package Cycle2.Chapter2.Item2.exam;

public class Test {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM).addTopping(Pizza.Topping.SAUSAGE).sauceInside().build();

        System.out.println(pizza.toString());
        System.out.println(calzone.toString());
    }
}
