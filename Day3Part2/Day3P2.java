package Day3Part2;

import java.util.Scanner;

public class Day3P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();

        Area area = new Area(a);
        Volume volume = new Volume(a);

        System.out.println("Area: " + area.value);
        System.out.println("Volume: " + volume.value);

        sc.close();
    }
}

class Area {
    double value;

    Area(int a) {
        this.value = Math.pow(a, 2);
    }
}

class Volume extends Area {
    double value;

    Volume(int a) {
        super(a);
        this.value = super.value * a;
    }
}