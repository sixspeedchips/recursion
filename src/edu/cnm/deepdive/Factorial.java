package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorial {

  public static BigInteger fact(Integer n) {
    return (n <= 1 ? BigInteger.ONE : fact(n - 1).multiply(BigInteger.valueOf(n)));
  }

  public static BigInteger iterativefact(Integer n){
    BigInteger product = BigInteger.ONE;
    for (Integer i = 2; i <= n; i++) {
      product = product.multiply(BigInteger.valueOf(i));
    }
    return product;
  }

}
