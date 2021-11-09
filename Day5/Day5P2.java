package Day5;

public class Day5P2 {
    public static void main(String[] args) {
        Shape1 circle = new Shape1();
        Shape1 rectangle = new Shape1();
        Shape1 triangle = new Shape1();

        System.out.println("Area of circle: " + circle.getArea(5));
        System.out.println("Area of rectangle: " + rectangle.getArea(2, 4));
        System.out.println("Area of triangle: " + triangle.getArea(3, 4, 5));
    }
}

class Shape1 {
    static final double PI = 3.14159;

    double getArea(int r) {
        return PI * r * r;
    }

    double getArea(int a, int b) {
        return a * b;
    }

    double getArea(int a, int b, int c) {
        double S = (a + b + c) / 2;
        double exp = S * (S - a) * (S - b) * (S - c);
        return Math.pow(exp, 0.5);
    }
}
