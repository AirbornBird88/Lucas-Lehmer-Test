package cz.vse.java;

public class LucasLehmerTest {
    // Determine if Mp = 2p − 1 is prime for p > 2

    public static String primalityTest(final int p) {
        final double M =  Math.pow(2, p) - 1;
        int i;
        double result = (4 % M);
        for (i = 0; i < p - 2; i++)
            result = ((result * result) - 2) % M;

        if((result == 0 && p != 1) ||  p == 2) {
            return M + " IS PRIME";
        } else {
            return M + " IS COMPOSITE";
        }
    }
}
