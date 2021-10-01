package Day3;

import java.util.Scanner;

class Cone {

    private double h, r;
    private static final double PI = 3.14159;

    Cone(double r, double h) {
        this.h = h;
        this.r = r;
    }

    double surfaceArea() {
        double l = h * h + r * r;
        double sqrtPart = Math.pow(l, 0.5);
        return PI * r * (r + sqrtPart);
    }

    double volume() {
        return PI * r * r * r * (h / 3);
    }
}

public class Day3P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r and h : ");
        int r = sc.nextInt();
        int h = sc.nextInt();

        Cone c = new Cone(r, h);
        System.out.println("Surface area: " + c.surfaceArea());
        System.out.println("Volume : " + c.volume());
        sc.close();
    }
}
