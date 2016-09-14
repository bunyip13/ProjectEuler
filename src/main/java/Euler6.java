import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
The sum of the squares of the first ten natural numbers is,
1*1 + 2*2 + ... + 10*10 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
public class Euler6 {


    public static void main(String... args) {
        System.out.println(Euler6.sumOfSq(10));
        System.out.println(Euler6.sqOfSum(10));
//        System.out.println(Euler6.difference(100));

        double diff = Euler6.difference(100);

        System.out.printf("diff: %.0f\n", diff);
    }

    private static double sumOfSq(int len) {
        double sum = 0;
        for (int i = 1; i <= len; i++) {
            sum += Math.pow(i,2);
        }
        return sum;
    }

    private static double sqOfSum(int len) {
        List<Integer> x = new ArrayList<>();
        for (int i = 1; i <= len; i++) {
            x.add(i);
        }
        int sum = x.stream()
                       .mapToInt(Number::intValue)
                       .sum();
        return Math.pow(sum,2);
    }

    private static double difference(int len) {
        double sqOfSum = Euler6.sqOfSum(len);
        double sumOfSq = Euler6.sumOfSq(len);
        return sqOfSum - sumOfSq;
    }

    // eulers say:
    public static void findSumSquareDifferenceOf(final int numbers) {
        final int sumOfSquares = IntStream.rangeClosed(1, numbers).map(a -> (int) Math.pow(a, 2)).sum();
        System.out.printf("sumOfSquares: %s%n", sumOfSquares);

        final int squareOfSums = (int) Math.pow(IntStream.rangeClosed(1, numbers).sum(), 2);
        System.out.printf("squareOfSums: %s%n", squareOfSums);

        final int difference = squareOfSums - sumOfSquares;
        System.out.printf("difference: %s%n", difference);
    }
}
