package edu.cnm.deepdive;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;

public class Fibonacci implements Iterable<BigInteger>{

  final int length;

  public Fibonacci(int length) {
    this.length = length;
  }

  public static BigInteger fibonacciOneLine(int n){
    return n <= 1 ? BigInteger.valueOf(n) : fibonacciOneLine(n-1).add(fibonacciOneLine(n-2));
  }

  public static BigInteger fibonacci(int n){
    BigInteger f;

    if(n==0) {
      f = BigInteger.ZERO;
    } else if(n==1){
      f = BigInteger.ONE;
    } else {
      f = fibonacci(n-1).add(fibonacci(n-2));
    }
    return f;
  }

  public static BigInteger fibonacciMemoized(int n, Map<Integer, BigInteger> memo){

    BigInteger f;

    if(memo.containsKey(n)){
      return memo.get(n);
    }

    if(n==0) {
      f = BigInteger.ZERO;
    } else if(n==1){
      f = BigInteger.ONE;
    } else {
      f = fibonacciMemoized(n-1,memo).add(fibonacciMemoized(n-2,memo));
    }
    memo.put(n,f);
    return f;
  }

  public static BigInteger fibonacciIterative(int n){
    BigInteger prev = BigInteger.ZERO;
    BigInteger curr = BigInteger.ONE;

    if(n <= 0){
      return prev;
    }
    for (int i = 2; i < n; i++) {
      BigInteger next = prev.add(curr);
      prev = curr;
      curr = next;


    }
    return curr;

  }





  @Override
  public Iterator<BigInteger> iterator() {
    return new FibIterator(length);
  }
  private class FibIterator implements Iterator<BigInteger>{

    private final int length;
    private int counter;
    private BigInteger prev = BigInteger.valueOf(-1);
    private BigInteger curr = BigInteger.ONE;


    private FibIterator(int length) {
      this.length = length;
      counter = length;
    }

    @Override
    public boolean hasNext() {
      return counter > 0;
    }

    @Override
    public BigInteger next() {
      BigInteger next = prev.add(curr);
      prev = curr;
      curr = next;
      counter--;
      return curr;
    }
  }
}
