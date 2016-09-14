/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
*/

import java.util.ArrayList;
import java.util.List;

public class Euler7 {

    public static void main(String... args) {
        System.out.println(Euler7.primeNumber(10001));
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    private static int primeNumber(int pos) {
        List<Integer> primes = new ArrayList<>();
        int index;
        for (int i = 1; ; i++) {
            index = i;
            if (isPrime(i)) primes.add(i);
            if (primes.size() == pos) return index;
        }
    }
}
