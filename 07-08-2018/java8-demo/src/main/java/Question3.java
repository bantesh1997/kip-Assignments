import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question3{
    private Map<String, Long> wordCount(String input){
        return Arrays.stream(input.trim().split(" "))
                .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        Question3 sentenceWordCount = new Question3();
        String input = "My name is Bantesh Sharma Bantesh Sharma is my name.";
        Map<String, Long> countResult = sentenceWordCount.wordCount(input);
        List result = countResult.keySet().stream()
                .map(key -> Arrays.asList(key, countResult.get(key)))
                .collect(Collectors.toList());
     //   System.out.println("List")
        result.forEach(i->System.out.print("List"+i+","));
    }
}