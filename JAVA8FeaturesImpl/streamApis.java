import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Intermediate Operations
        // result is collected in squaredNumbers
        //operator that applies functn to each n every element
        // collects the results of the map operation into a new list
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
               .collect(Collectors.toList());

// filter checks each element in the stream 
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Terminal Operations

// 0 starting point for the calculation. calculating sum of all the no.s
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        long count = numbers.stream().count();

        Optional<Integer> max = numbers.stream()
        // :mtd ref
                .max(Integer::compare);

        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);


        System.out.println("Original list: " + numbers);
        System.out.println("Squared numbers: " + squaredNumbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Sum of all numbers: " + sum);
        System.out.println("Number of elements: " + count);
        System.out.println("Maximum number: " + max.orElse(0));
        System.out.println("Minimum number: " + min.orElse(0));
    }
}



//    Optional<Integer> firstEven = numbers.stream()
//            .filter(n -> n % 2 == 0)
//            .findFirst();
//        System.out.println("First even number: " + firstEven.orElse(0));
