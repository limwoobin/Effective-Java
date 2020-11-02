package Chapter9.item58;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Ex2 {
    enum Face {
        ONE , TWO , THREE , FOUR , FIVE , SIX;
    }

    static Collection<Face> faces = Arrays.asList(Face.values());

    public static void main(String[] args) {
        for (Iterator<Face> i = faces.iterator(); i.hasNext();) {
            Face face = i.next();
            for (Iterator<Face> j = faces.iterator(); j.hasNext();) {
                System.out.println(face + " : " + j.next());
            }
        }
    }
}
