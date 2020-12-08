import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Collectors;

 
public class Main implements CustomCalculator {
 
    public static void main(String[] args) {
        CustomCalculator demo = new Main();
         
        int sumOfEvens = demo.addEvenNumbers(1,2,3,4,5,6,7,8,9);
        System.out.println("Result: " + sumOfEvens);
         
        int sumOfOdds = demo.addOddNumbers(1,2,3,4,5,6,7,8,9);
        System.out.println("Result: " + sumOfOdds);
    } 
} 


public interface CustomCalculator {
    default int addEvenNumbers(int... nums) {
        return add(n -> n % 2 == 0, nums);
    }
 
    default int addOddNumbers(int... nums) {
        return add(n -> n % 2 != 0, nums);
    }
 
    private int add(IntPredicate predicate, int... nums) { 
        printInput(nums);
        return IntStream.of(nums)
                .filter(predicate)
                .sum();
    }

    private static void printInput(int... nums) {
        var string = IntStream.of(nums).mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println("Input: " + string);
    }
}
 
