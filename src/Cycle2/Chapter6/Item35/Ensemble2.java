package Cycle2.Chapter6.Item35;

// ordinal 메서드 대신 인스턴스 필드 사용
public enum Ensemble2 {
    SOLO(1) , DUET(2) , TRIO(3) , QUARTET(4) , QUINTET(5),
    SEXTET(6) , SEPTET(7) , OCTET(8) , DOUBLE_QUARTET(9) ,
    NONET(10) , DECTET(11) , TRIPLE_QUARTET(12);

    private final int numberOfMusicians;

    Ensemble2(int numberOfMusicians) {
        this.numberOfMusicians = numberOfMusicians;
    }

    public int numberOfMusicians() {
        return numberOfMusicians;
    }
}
