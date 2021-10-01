package Day1;

public class Day1P5 {
     public static void main(String[] args) {
          double x, n, sum = 0.0;
          x = Double.parseDouble(args[0]);
          n = Double.parseDouble(args[1]);
          for (int i = 0; i < n; sum += Math.pow(x, i++)) {
               System.out.println("Result is : " + sum);
          }
     }
}
