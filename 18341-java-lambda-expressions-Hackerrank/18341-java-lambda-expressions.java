import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isOdd() {
        return new PerformOperation() {
            @Override
            public boolean check(int a) {
                return a % 2 != 0;
            }
        };
    }

    public static PerformOperation isPrime() {
        return new PerformOperation() {
            @Override
            public boolean check(int a) {
                if (a < 2) {
                    return false;
                }
                for (int i = 2; i * i <= a; i++) {
                    if (a % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna