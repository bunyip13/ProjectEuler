public class Euler1 {
    public static void main(String... args) {

        System.out.println(sum3and5(1000));
        sum3and5(1000);

    }

    private static int sum3and5(int arraySize) {
        int result = 0;
        for (int i = 1; i < arraySize; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        System.out.println(result);
        return result;
    }
}