import java.util.ArrayList;
import java.util.Collections;

/*
 A palindromic number reads the same both ways.
 The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 Find the largest palindrome made from the product of two 3-digit numbers.
 */
@SuppressWarnings("unused")
public class Euler4 {
    private static boolean checkPalindrome(int input) {
        String inputString = Integer.toString(input);
        int length = inputString.length();

        int i, begin, end, middle;

        begin = 0;
        end = length - 1;
        middle = (begin + end) / 2;

        for (i = begin; i <= middle; i++) {
            if (inputString.charAt(begin) == inputString.charAt(end)) {
                begin++;
                end--;
            } else break;
        }
        return i == middle + 1;
    }

    private static int findPalindrome(int min, int max) {
        ArrayList<Integer> palindromes = new ArrayList<>();
        int ij;
        for (int i = min; i < max; i++) {
            for (int j = min; j < max; j++) {
                ij = i*j;
                if (checkPalindrome(ij)) {
                    palindromes.add(ij);
                    System.out.println("Palindrome " +ij+ ", a=" +i+ ", b=" +j);
                }
            }
        }
        return Collections.max(palindromes);
    }

    public static void main(String... args) {
        System.out.println(findPalindrome(100, 999));
    }
}
