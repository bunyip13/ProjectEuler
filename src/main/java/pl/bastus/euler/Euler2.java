/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms
 */

public class Euler2 {
    private static int finob() {
        int a = 0;
        int b = 1;
        int sum = 0;
        int result = 0;
        while (b < 4000000) {
            sum = a + b;
            //System.out.println("sum " + sum);
            a = b;
            //System.out.println("a " + a);
            b = sum;
            //System.out.println("b " + b);
            if (sum % 2 == 0) result += sum;
            //System.out.println(" === ");
        }
        return result;
    }
    public static void main(String... args) {
        System.out.println(finob());
    }
}