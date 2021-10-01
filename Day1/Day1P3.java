package Day1;

public class Day1P3 {
    static class Rectangle {
        double height, base;

        Rectangle(double height, double base) {
            this.height = height;
            this.base = base;
        }

        double area() {
            return 0.5 * this.base * this.height;
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        System.out.println("The area of the triangle is : " + r.area());
    }
}
