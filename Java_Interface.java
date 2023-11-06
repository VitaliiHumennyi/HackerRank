import java.util.*;
public class Java_Interface {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(my_calculator.divisor_sum(n));
    }
}
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
interface AdvancedArithmetic {
    int divisor_sum(int n);
}
