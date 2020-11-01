package Chapter8.ex2;

import java.util.Arrays;
import java.util.List;

class Wine {
    String name() {
        return "포도주";
    }
}

class SparklingWine extends Wine {
    @Override
    String name() {
        return "간치아 모스카또";
    }
}

class Champagne extends SparklingWine {
    @Override
    String name() {
        return "샴페인";
    }
}

public class Overriding {
    public static void main(String[] args) {
        List<Wine> wineList = Arrays.asList(new Wine() , new SparklingWine() , new Champagne());
        for (Wine wine : wineList) {
            System.out.println(wine.name());
        }
    }
}
