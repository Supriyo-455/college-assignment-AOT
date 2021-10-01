package Day3;

class ClassTest {
    int x;

    ClassTest(int x) {
        this.x = x;
    }

    void show() {
        System.out.println("value of x :" + x);
    }
}

public class Day3P5 {
    public static void main(String[] args) {
        ClassTest c = new ClassTest(4);
        c.show();
    }
}
