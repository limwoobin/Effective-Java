package Cycle1.Chapter9.item60;

import java.math.BigDecimal;

public class Ex {
    public static void main(String[] args) {
        // 오류 발생! 금융 계산에 부동 소수 타입을 사용.
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.10; funds >= price; price += 0.10) {
            funds -= price;
            itemsBought++;
        }

        System.out.println(itemsBought + "개");
        System.out.println(funds + "달러");

        // BigDecimal 을 사용한 해법 -> 속도가 느리고 쓰기 불편.
        final BigDecimal TEN_CENTS = new BigDecimal(".10");
        int itemsBought2 = 0;
        BigDecimal funds2 = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS; funds2.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
            funds2 = funds2.subtract(price);
            itemsBought2++;
        }

        System.out.println("--------------------------------");
        System.out.println(itemsBought2 + "개");
        System.out.println(funds2 + "달러");

        // 정수타입을 사용한 해법
        int itemsBought3 = 0;
        int funds3 = 100;
        for (int price = 10; funds3 >= price; price += 10) {
            funds3 -= price;
            itemsBought3++;
        }
        System.out.println("--------------------------------");
        System.out.println(itemsBought3 + "개");
        System.out.println(funds3 + "달러");
    }
}

