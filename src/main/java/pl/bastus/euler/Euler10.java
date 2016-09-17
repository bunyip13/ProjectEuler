/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */
public class Euler10 {

    public static void main(String... args) {
        System.out.println(Euler10.fillWithPrimes(2_000_000));
    }

    private static Long fillWithPrimes(int number) {
//        List<Long> primes = new ArrayList<>();
        long sum = 0;
        for (long i = 1; i < number; i++) {
            if (Euler10.isPrime(i)) {
                sum += i;
            }

        }
        return sum;
    }


    private static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (long i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}
