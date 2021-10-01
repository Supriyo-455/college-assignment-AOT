package Day1;

public class Day1P10 {
    public static void main(String[] args) {
        float avg = 0.0f, sum = 0.0f;
        float ar[] = { 11, 65, 894, 2, 47, 32.5f, 69, 50.01f };
        for (float f : ar) {
            sum += f;
            avg = sum / ar.length;
        }
        System.out.println("Sum :" + sum + " Average: " + avg);
    }
}
