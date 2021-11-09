package Day5;

public class Day5P1 {
    public static void main(String[] args) {
        Shape circle = new Shape(5);
        Shape rectangle = new Shape(2, 4);
        Shape triangle = new Shape(3, 4, 5);

        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Area of triangle: " + triangle.getArea());
    }
}

class Shape {
    int a;
    int b;
    int c;
    int r;
    double value;
    final static double PI = 3.14159;

    Shape(int r) {
        this.r = r;
        this.value = PI * r * r;
    }

    Shape(int a, int b) {
        this.a = a;
        this.b = b;
        this.value = a * b;
    }

    Shape(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double S = (this.a + this.b + this.c) / 2;
        double exp = S * (S - this.a) * (S - this.b) * (S - this.c);
        this.value = Math.pow(exp, 0.5);
    }

    double getArea() {
        return this.value;
    }
}
