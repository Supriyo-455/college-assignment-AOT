package Day5;

public class Day5P4 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getVar());
    }
}

class A {
    int var;

    A(int var) {
        this.var = var; // use of "this"
    }

    int operation() {
        this.var = this.var * 4;
        return this.var;
    }
}

class B extends A {
    B(int var) {
        super(var); // Use of "super()"
    }

    B() {
        this(5); // use of "this()"
    }

    int getVar() {
        return super.operation(); // use of "super"
    }
}