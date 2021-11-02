package Day3Part2;

public class Day3P1 {
    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        obj.func(10);
        obj.func(10, 20);
        System.out.println(obj.func(10, 20, 30));

        // As you can see we can overload methods
        // as long as they have different signatures
        // returns type doesn't matter for overloading
    }
}

class DemoClass {
    void func(int var1) {
        System.out.println(var1 * 10);
    }

    void func(int var1, int var2) {
        System.out.println(var1 * var2);
    }

    int func(int var, int var2, int var3) {
        return var * var2 * var3;
    }
}