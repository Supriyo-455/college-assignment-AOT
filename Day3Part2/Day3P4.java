package Day3Part2;

public class Day3P4 {
    public static void main(String[] args) {
        Screen sc = new Screen();
        sc.show();
        PCScreen pcsc = new PCScreen();
        pcsc.show();
        MobileScreen mbsc = new MobileScreen();
        mbsc.show();
        SmartWatchScreen smwsc = new SmartWatchScreen();
        smwsc.show();
    }
}

class Screen {
    void show() {
        System.out.println("Just a normal lcd screen");
    }
}

class PCScreen extends Screen {
    @Override
    void show() {
        System.out.println("LCD screen of a pc");
    }
}

class MobileScreen extends Screen {
    @Override
    void show() {
        System.out.println("LED screen of mobile");
    }
}

class SmartWatchScreen extends Screen {
    @Override
    void show() {
        System.out.println("LED screen of smart watch");
    }
}