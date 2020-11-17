package Cycle2.Chapter3.Item10;

import java.util.Objects;

public class CaseInsesitiveString {
    private final String s;

    public CaseInsesitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    // 대칭성 위배
    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsesitiveString) {
            return s.equalsIgnoreCase(((CaseInsesitiveString) o).s);
        }
        if (o instanceof String) {  // 한 방향으로만 작동한다
            return s.equalsIgnoreCase((String) o);
        }

        return false;
    }
}
