package Day3;

class Test1 {
    Test1 obj1;
    Test2 obj2;
    int value;

    Test1(int value) {
        this.value = value;
    }

    Test1(Test1 obj) {
        this.obj1 = obj;
    }

    Test1(Test2 obj) {
        this.obj2 = obj;
    }

    int obj2_value() {
        if (obj2 != null) {
            return obj2.value;
        }
        return 0;
    }

    int obj1_value() {
        if (obj1 != null) {
            return obj1.value;
        }
        return 0;
    }
}

class Test2 {
    int value;

    Test2(int value) {
        this.value = value;
    }
}

public class Day3P6 {
    public static void main(String[] args) {
        Test1 t = new Test1(6);
        Test2 obj2 = new Test2(8);

        t.obj1 = new Test1(9);
        t.obj2 = obj2;

        System.out.println("Test class obj1 value : " + t.obj1_value());
        System.out.println("Test class obj2 value : " + t.obj2_value());
        System.out.println("Test class instance variable value : " + t.value);
    }
}
