import java.util.*;

public class FizzBuzzJazz {

    private final int n;
    private final Map<Integer, String> divisors;

    public FizzBuzzJazz(int n) {
        this.n = n;
        divisors= new TreeMap<>(Map.of(3, "Fizz", 5, "Buzz", 7, "Jazz"));
        printResult();
    }

    private List<String> fizzBuzz() {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; ++i) {
            StringBuilder print = new StringBuilder();

            for (Integer key : divisors.keySet()) {
                if (i % key == 0) {
                    print.append(divisors.get(key));
                }
            }

            if (print.isEmpty()) {
                print.append(i);
            }

            result.add(print.toString());
        }

        return result;
    }

    private void printResult() {
        List<String> results = fizzBuzz();

        for (String s : results) {
            System.out.print(s + " ");
        }
    }

}
