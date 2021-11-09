package Day5;

public class Day5P3 {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild(1, 2, 3, 4);
        System.out.println();
        gc.show();
    }
}

class GrandParent {
    int var1;

    GrandParent(int var) {
        this.var1 = var;
        System.out.println("Constructor of GrandParent");
    }

    void show() {
        System.out.println("In grand parent!");
    }
}

class Parent extends GrandParent {
    int var2;

    Parent(int var, int var2) {
        super(var);
        this.var2 = var2;
        System.out.println("Constructor of Parent!");
    }

    @Override
    void show() {
        System.out.println("In parent!");
    }
}

class child extends Parent {
    int var3;

    child(int var, int var2, int var3) {
        super(var, var2);
        this.var3 = var3;
        System.out.println("Constructor of child");
    }

    @Override
    void show() {
        System.out.println("In child");
    }
}

class GrandChild extends child {
    int var4;

    GrandChild(int var, int var2, int var3, int var4) {
        super(var, var2, var3);
        System.out.println("Constructor of grandChild!");
    }

    @Override
    void show() {
        System.out.println("In grandChild!");
    }

}