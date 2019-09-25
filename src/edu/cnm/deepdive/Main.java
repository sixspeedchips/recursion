package edu.cnm.deepdive;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

  public static void main(String[] args) {
    System.out.println(Factorial.fact(4000));

    System.out.println(Recursion.countPairs("axaxbxax"));
    System.out.println(Recursion.countPairs("axxbxax"));
    System.out.println(Recursion.countPairs("ax"));

  }
}
