package Day3Part2;

public class Day3P6 extends ExampleClass {
    public static void main(String[] args) {
        new Day3P6().printSomething();
    }
}

abstract class ExampleClass {
    void printSomething() {
        System.out.println("This is a concrete method!");
    }
}