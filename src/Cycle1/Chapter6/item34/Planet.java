package Cycle1.Chapter6.item34;

public enum Planet {
    MERCURY(3.302e+23 , 2.439e6),
    VENUS(4.869e+24 , 6.052e6),
    EARTH(5.975e+24 , 6.378e6),
    MARS(6.419e+24 , 3.393e6),
    JUPITER(1.899e+27 , 7.149e7),
    SATURN(5.685e+26 , 6.027e7),
    URANUS(8.683e+25 , 2.556e7),
    NEPTUNE(1.024e+26 , 2.477e7);

    private final double mass;              // 질량
    private final double radius;            // 반지름
    private final double surfaceGravity;    // 표면중력

    // 중력 상수
    private static final double G = 6.67300E-11;

    Planet(double mass , double radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / (radius * radius);
    }

    public double getMass() {
        return this.mass;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getSurfaceGravity() {
        return this.surfaceGravity;
    }

    public double surfaceWeight(double mass) {
        return mass * this.surfaceGravity;
    }
}
