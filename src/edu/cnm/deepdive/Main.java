package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    System.out.println(Factorial.fact(4000));

    System.out.println(Recursion.countPairs("axaxbxax"));
    System.out.println(Recursion.countPairs("axxbxax"));
    System.out.println(Recursion.countPairs("ax"));

    System.out.println(Palindromes.isPalindrome("race cars"));
    System.out.println(Palindromes.isPalindrome("race car"));
    System.out.println(Palindromes.isPalindrome("able was i ere i saw elba"));
    System.out.println(Palindromes.isPalindrome("Madam, I'm Adam"));

    System.out.println(Fibonacci.fibonacci(10));
    System.out.println(Fibonacci.fibonacci(5));
    System.out.println(Fibonacci.fibonacci(2));
    System.out.println(Fibonacci.fibonacci(6));
    System.out.println(Fibonacci.fibonacci(7));



  }
}
