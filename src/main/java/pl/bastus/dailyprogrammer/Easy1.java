package pl.bastus.dailyprogrammer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Easy1 {
    public static void main(String[] args) throws IOException {
        Files.readAllLines(Paths.get("input1")).stream()
             .map(s->s.split(" "))
             .map(a->reducedFraction(Integer.parseInt(a[0]),Integer.parseInt(a[1])))
             .forEach(System.out::println);
    }
    private static String reducedFraction(int x, int y){
        int gcm = gcm(x, y);
        return (x / gcm) + " " + (y / gcm);
    }

    private static int gcm(int x, int y){
        return y == 0 ? x : gcm(y, x % y);
    }
}
