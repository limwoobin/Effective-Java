package Cycle2.Chapter9.Item60;

import java.math.BigDecimal;

public class Test {
    // 오류 발생! 금융 계산에 부동소수 타입을 사용했다. (double , float...)
    static void test1() {
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.10; funds >= price; price += 0.10) {
            funds -= price;
            itemsBought++;
        }

        System.out.println(itemsBought + "개");
        System.out.println("잔액: " + funds);
    }

    // BigDecimal 을 이용한 해법 - 속도가 느리고 쓰기 불편하다.
    static void test2() {
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
            funds = funds.subtract(price);
            itemsBought++;
        }

        System.out.println(itemsBought + "개");
        System.out.println("잔액: " + funds);
    }

    // 정수 타입을 사용한 해법
    static void test3() {
        int itemsBought = 0;
        int funds = 100;
        for (int price=10; funds >= price; price += 10) {
            funds -= price;
            itemsBought++;
        }

        System.out.println(itemsBought + "개");
        System.out.println("잔액: " + funds);
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
}
