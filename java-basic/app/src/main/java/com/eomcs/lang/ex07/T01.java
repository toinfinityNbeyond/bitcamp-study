package com.eomcs.lang.ex07;

class MyMathTest{
  //# 메서드 : 사용 전
  //
  public class T01 {
    public static void main(String[] args) {
      MyMath mm = new MyMath();
      long result = mm.add(5,3);

      System.out.println("add(5L,3L) = " + result );

      class MyMaht{
        long add(long a, long b){
          return a > b ? a : b;
        }
      }

    }
  }
}