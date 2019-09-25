package edu.cnm.deepdive;

import java.math.BigInteger;

public class Fibonacci {

  public static BigInteger fibonacci(int n){

    return n <= 1 ? BigInteger.valueOf(n) : fibonacci(n-1).add(fibonacci(n-2));


  }


}
