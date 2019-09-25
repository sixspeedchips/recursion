package edu.cnm.deepdive;

import java.math.BigInteger;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    System.out.println(Factorial.fact(20));

    System.out.println(Recursion.countPairs("axaxbxax"));
    System.out.println(Recursion.countPairs("axxbxax"));
    System.out.println(Recursion.countPairs("ax"));

    System.out.println(Palindromes.isPalindrome("race cars"));
    System.out.println(Palindromes.isPalindrome("race car"));
    System.out.println(Palindromes.isPalindrome("able was i ere i saw elba"));
    System.out.println(Palindromes.isPalindrome("Madam, I'm Adam"));

    System.out.println(Fibonacci.fibonacciOneLine(10));
    System.out.println(Fibonacci.fibonacciOneLine(5));
    System.out.println(Fibonacci.fibonacciOneLine(2));
    System.out.println(Fibonacci.fibonacciOneLine(6));
    System.out.println(Fibonacci.fibonacciOneLine(7));
    System.out.println(Fibonacci.fibonacciOneLine(-10));
    System.out.println();
    System.out.println(Fibonacci.fibonacci(10));
    System.out.println(Fibonacci.fibonacci(5));
    System.out.println(Fibonacci.fibonacci(2));
    System.out.println(Fibonacci.fibonacci(6));
    System.out.println(Fibonacci.fibonacci(7));

    System.out.println();
    System.out.println(Fibonacci.fibonacciMemoized(1499, new HashMap<>()));

    System.out.println();
    System.out.println(Fibonacci.fibonacciIterative(1500));


    Fibonacci fibonacci = new Fibonacci(100);
    for (BigInteger bigInteger : fibonacci) {
      System.out.println(bigInteger);
    }



  }
}
