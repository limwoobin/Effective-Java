package Cycle2.Chapter8.Item52;

import java.util.Arrays;
import java.util.List;

// 재정의된 호출 매커니즘
class Wine {
    String name() {
        return "포도주";
    }
}

class SparklingWine extends Wine {
    @Override
    String name() {
        return "발포성 포도주";
    }
}

class Champagne extends Wine {
    @Override
    String name() {
        return "샴페인";
    }
}

public class Overriding {
    public static void main(String[] args) {
        List<Wine> wineList = Arrays.asList(
                new Wine(),
                new SparklingWine(),
                new Champagne()
        );

        for (Wine wine : wineList) {
            System.out.println(wine.name());
        }
    }
}
