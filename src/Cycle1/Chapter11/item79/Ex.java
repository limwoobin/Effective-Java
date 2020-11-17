package Cycle1.Chapter11.item79;

import java.util.HashSet;

public class Ex {
    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> set, Integer element) {
                System.out.println(element);
                if (element == 23) {
                    set.removeObserver(this);
                }
            }
        });

        for (int i=0; i<100; i++) {
            set.add(i);
        }
    }
}
