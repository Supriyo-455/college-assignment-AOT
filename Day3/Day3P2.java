package Day3;

class Cylinder {
    private double r, h;
    private static final double PI = 3.14159;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double surfaceArea() {
        return (2 * PI * r * h) + (2 * PI * r * r);
    }

    double volume() {
        return (PI * r * r * h);
    }
}

public class Day3P2 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(10, 50);
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());
    }
}
