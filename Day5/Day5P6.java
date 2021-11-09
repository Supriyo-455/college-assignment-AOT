package Day5;

public class Day5P6 {
    static int count = 0;

    void increase() {
        count++;
    }

    public static void main(String[] args) {
        Day5P6 test = new Day5P6();
        test.increase();
        Day5P6 test2 = new Day5P6();
        test2.increase();
        Day5P6 test3 = new Day5P6();
        test3.increase();

        System.out.println(test.count);
        System.out.println(test2.count);
        System.out.println(test3.count);
    }
}
