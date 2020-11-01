package Chapter6.item37;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public class Run {
    public static void main(String[] args) {
        Map<DayOfWeek , String> enumMap = new EnumMap<DayOfWeek, String>(DayOfWeek.class);
        enumMap.put(DayOfWeek.FRI , "Friday");

        for (DayOfWeek dayOfWeek : enumMap.keySet()) {
            System.out.println(dayOfWeek);
        }

        for (String value : enumMap.values()) {
            System.out.println(value);
        }

        EnumSet<DayOfWeek> enumSet = EnumSet.noneOf(DayOfWeek.class);
        System.out.println(enumSet.size());

        EnumSet<DayOfWeek> enumSet2 = EnumSet.allOf(DayOfWeek.class);
        System.out.println(enumSet2.size());

        EnumSet<DayOfWeek> enumSet3 = EnumSet.of(DayOfWeek.MON , DayOfWeek.FRI);
        System.out.println(enumSet3.size());
    }
}
