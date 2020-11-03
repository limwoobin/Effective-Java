package Generic.UnboundedWildcardType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        // before
        List<String> list = new ArrayList<>();
        printList(list);

        // after
        ArrayList var1 = new ArrayList();
        printList2(var1);
    }

    // before
    private static void printList(List<?> list) {
        for (Object elme : list) {
            System.out.println(elme + " ");
        }
    }

    // after
    private static void printList2(List<?> var0) {
        Iterator var1 = var0.iterator();
        while (var1.hasNext()) {
            Object var2 = var1.next();
            System.out.println(var2 + " ");
        }
    }
}
