package com.eomcs.lang.ex07;

public class Ex {

  static class MyClass {
    int a;
    int b;
  }

  static void swap(MyClass ref) {
    System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
    int temp = ref.a;
    ref.a = ref.b;
    ref.b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
  }

  public static void main(String[] args) {
    MyClass ref = new MyClass();
    ref.a = 100;
    ref.b = 200;

    swap(ref);
    System.out.printf("main(): a=%d, b=%d\n", ref.a, ref.b);
  }
}
