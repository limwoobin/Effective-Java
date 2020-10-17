package Item10;

public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = s;
    }

    // 대칭성 위배!
    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }

        if (o instanceof String) { // 한 방향으로만 작동한다
            return s.equalsIgnoreCase((String) o);
        }

        return false;
    }
    // -> String equals 와 CaseInsensitiveString equals 가 다른 값을 리턴b
}
