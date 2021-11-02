package Day3Part2;

public class Day3P7 {
    public static void main(String[] args) {
        Implementation imp = new Implementation();
        imp.count();
        imp.greet();
        imp.hello();
    }
}

abstract class SomeClass {
    abstract void greet();

    abstract void count();

    abstract void hello();
}

class Implementation extends SomeClass {
    @Override
    void greet() {
        System.out.println("Hey hello!");
    }

    @Override
    void count() {
        System.out.println("Counting");
    }

    @Override
    void hello() {
        System.out.println("Hello!");
    }
}
