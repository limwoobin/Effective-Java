package Cycle2.Chapter7.Item46;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.function.BinaryOperator.maxBy;
import static java.util.stream.Collectors.*;

public class StreamToMap {
    public static void main(String[] args) {
        Artist a = new Artist("a");
        Artist b = new Artist("b");
        Artist c = new Artist("c");

        List<Album> albums = Arrays.asList(
            new Album(a, 21),
            new Album(a, 11),
            new Album(a, 30),
            new Album(a, 9),
            new Album(a, 49),
            new Album(b, 37),
            new Album(b, 12),
            new Album(c, 45),
            new Album(c, 65),
            new Album(c, 28)
        );

        // toMap
        Map<Artist, Album> topHits = albums.stream().collect(
                        toMap(Album::artist,
                        album -> album,
        maxBy(comparing(Album::sales))));

        System.out.println(topHits);

        // toMap2
        Map<Artist, Album> topHits2 = albums.stream().collect(
                toMap(Album::artist,
                        album -> album,
                        (x1 , x2) -> {
                            return x1;
                        }));

        System.out.println(topHits2);

        // toSet
        Map<Artist , Set<Album>> artistSet = albums.stream().collect(
                groupingBy(Album::artist,toCollection(HashSet::new)));
        System.out.println(artistSet.toString());

    }
}
