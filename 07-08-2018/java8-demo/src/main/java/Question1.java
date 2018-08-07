import static java.util.stream.Collectors.toList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Question1 {
    public static void main(String[] args) {
        List<Integer> numbersList =
                new Random().ints(1,1000).limit(100).boxed().collect(Collectors.toList());

        System.out.println(numbersList.stream()
                .filter(Question1::isPrime)
                .collect(toList()));
    }

    public static boolean isPrime(int inputNumber) {
        for (int i = 2; i <= inputNumber / 2; i++) {
            if (inputNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}