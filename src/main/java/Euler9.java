import java.util.TreeMap;

/*

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 */
@SuppressWarnings("unused")
public class Euler9 {

//     Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
//     (c - a)(c + a) = Math.pow(b, 2);
//
//     a = Math.pow(m, 2) - Math.pow(n, 2);
//     b = 2nm;
//     c = Math.pow(m, 2) + Math.pow(n, 2);
//
//    Exactly one of a, b is odd; c is odd.
//    Exactly one of a, b is divisible by 3.
//    Exactly one of a, b is divisible by 4.
//    Exactly one of a, b, c is divisible by 5.
//  The largest number that always divides abc is 60.

    //

    public static void main(String... args) {
        System.out.println(Euler9.triplet(1000));
//        System.out.println(Euler9.triplet(50));
//        System.out.println(Euler9.triplet(1000));
    }

    private static TreeMap<Long, Long> triplet(int number) {
        TreeMap<Long, Long> map = new TreeMap<>();
        long m;
        long n;
        for (int i = 1; i < number; i++) {
            for (int j = 1; j < number; j++) {
                for (int k = 1; k < number; k++) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2) && i < j && j < k) {
                        m = i+j+k;
                        n = i*j*k;
                        if (m == number) {
                            map.put(m, n);
                        }
                    }
                }
            }
        }
        return map;
    }
}
