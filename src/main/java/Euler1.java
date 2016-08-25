import java.util.stream.*;

public class Euler1 {
    public static void main(String... args) {

        System.out.println("old version: " + sum3and5(1000));

        int result = IntStream.range(1, 1000)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .sum();
        System.out.println("Java 8 stream and lambda " + result);

    }

    private static int sum3and5(int arraySize) {
        int result = 0;
        for (int i = 1; i < arraySize; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }


}