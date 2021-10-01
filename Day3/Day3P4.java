package Day3;

public class Day3P4 {
    static class First {
        int x;

        First(int x) {
            this.x = x;
        }

        void show() {
            System.out.println("value of x :" + x);
        }
    }

    public static void main(String[] args) {
        First f = new First(5);
        f.show();
    }
}
