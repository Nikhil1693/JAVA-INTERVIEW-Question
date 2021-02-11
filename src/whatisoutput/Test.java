package whatisoutput;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int sum = test.sumUp(List.of(1, 2, 3, 4, 5));
        System.out.println(sum);
    }
    int sumUp(List<Integer> numbers) {
        int sum = 0;
        myLabel:
        do {
            for (int number : numbers) {
                if (number == 3) break myLabel;
                sum += number;
            }
        } while (sum < 15);
        return sum;
    }
}
