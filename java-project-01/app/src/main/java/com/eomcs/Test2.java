package com.eomcs;

class Calculator2 {
  int result; //변수 사용하고 싶으면 new 를 사용해야함

  static void plus ( Calculator2 c,  int value) { //value는 100이 값 들어있음
    c.result += value;                            //c는 주소
  }
}

public class Test2 {
  public static void main (String[] args) {
    Calculator2 obj1 = new  Calculator2(); //new 라는 작업은 힙에 변수를 만든다.
    Calculator2 obj2 = new  Calculator2(); //obj2에 들어가는것은 인스턴스의 주소값

    Calculator2.plus(obj1, 100); // obj1, 100 장소,값
    Calculator2.plus(obj1, 200);
    Calculator2.plus(obj1, 300);

    Calculator2.plus(obj2, 111);
    Calculator2.plus(obj2, 222);

    System.out.println(obj1.result );
    System.out.println(obj2.result );
  }
}