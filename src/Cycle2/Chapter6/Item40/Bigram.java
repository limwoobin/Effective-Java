package Cycle2.Chapter6.Item40;

import java.util.HashSet;
import java.util.Set;

// 영어 알파벳2개로 구성된 문자열을 표현하는 클래스 - 버그를 찾아보자 (equals 의 재정의)
public class Bigram {
    private final char first;
    private final char second;

    public Bigram(char first , char second) {
        this.first = first;
        this.second = second;
    }

//    public boolean equals(Bigram b) {  잘못된 재정의
//        return b.first == first && b.second == second;
//    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bigram)) {
            return false;
        }
        Bigram b = (Bigram) o;
        return b.first == first && b.second == second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<>();
        for (int i=0; i<10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                s.add(new Bigram(ch , ch));
            }
        }

        System.out.println(s.size());
    }
}
