/*
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
@SuppressWarnings("unused, all")
public class Euler5 {

    public static void main(String... args) {
        /*long[] array = {11,12,13,14,15,16,17,18,19,20};
        long answer = lcm(array);
        System.out.println(answer);

        // ver 2
        final int NUMBER = 20;
        int total = NUMBER;
        for (int i = NUMBER-1; i >= 2; i--){
            //greatest common factor
            total *= i / BigInteger.valueOf(total).gcd(BigInteger.valueOf(i)).intValue();
        }
        System.out.println(total);*/

        System.out.println(findLCM(20));
    }

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    private static long lcm(long[] input) {
        long result = input[0];
        for (int i = 1; i < input.length; i++) result = lcm(result, input[i]);
        return result;
    }

    // pretty as hell
    private static int findLCM(int input) {
        int inpt = input;
        int ans = 1;
        //multiplying all the primes lesser than input
        for (int i = 2; i <= inpt; i++) {
            //if a prime i, i*i is lesser than or equal to input
            if (isPrime(i) && i * i <= inpt) {
                for (int j = i; j <= inpt; ) {
                    j = j * i;
                    ans = ans * i;
                }
            } else if (isPrime(i)) {
                ans = ans * i;
            }
        }
        return ans;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

}
