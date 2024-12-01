package Ex3_3;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        // Create BigInteger instances for the given numbers
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        // Perform addition
        BigInteger sum = i1.add(i2);
        System.out.println("Sum: " + sum);

        // Perform multiplication
        BigInteger product = i1.multiply(i2);
        System.out.println("Product: " + product);
    }
}

