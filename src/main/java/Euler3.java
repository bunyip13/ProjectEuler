/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("unused")
public class Euler3 {

    private static long primeFactors(long n) {
        ArrayList<Long> factors = new ArrayList<>();
        for (long i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return Collections.max(factors);
    }

    private static long primeFactors2(long n) {
        long num = n, d = 2L;
        while (num != 1) {
            if (num % d == 0) num /= d;
            else d++;
        }
        return d;
    }

    public static void main(String... args) {
        System.out.println(primeFactors(600851475143L));
        System.out.println(primeFactors2(600851475143L));
    }
}
