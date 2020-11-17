package Cycle2.Item2;

public class Test {
    public static void main(String[] args) {
        NutritionFacts3 nutritionFacts3 = new NutritionFacts3.Builder(240 , 8)
                .calories(30)
                .fat(100)
                .sodium(2)
                .carbohydrate(300)
                .build();

        System.out.println(nutritionFacts3.toString());
    }
}
