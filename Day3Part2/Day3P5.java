package Day3Part2;

public class Day3P5 {
    public static void main(String[] args) {
        PCScreen1 pcsc = new PCScreen1();
        // pcsc.show();
        MobileScreen1 mbsc = new MobileScreen1();
        // mbsc.show();
        SmartWatchScreen1 smwsc = new SmartWatchScreen1();
        // smwsc.show();

        // Dynamic method dispatching
        Screen1 ref = mbsc;
        // Screen as mobile screen
        ref.show();

        // Screen as pc screen
        ref = pcsc;
        ref.show();

        // Screen as smart watch screen
        ref = smwsc;
        ref.show();
    }
}

class Screen1 {
    void show() {
        System.out.println("Just a normal lcd screen");
    }
}

class PCScreen1 extends Screen1 {
    @Override
    void show() {
        System.out.println("LCD screen of a pc");
    }
}

class MobileScreen1 extends Screen1 {
    @Override
    void show() {
        System.out.println("LED screen of mobile");
    }
}

class SmartWatchScreen1 extends Screen1 {
    @Override
    void show() {
        System.out.println("LED screen of smart watch");
    }
}