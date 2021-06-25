package com.eomcs;

class Calculator3 {
  int result; //변수 사용하고 싶으면 new 를 사용해야함

  // non-static 메서드 = 인스턴스 메서드
  // => 인스턴스 주소를 받는 'this'변수가 내장되어 있다.
  // => 따라서 개발자가 인스턴스 주소를 받는 변수를 파라미터로 선언할 필요가 없다.
  //
  void plus ( /*Calculator3 this,*/  int value) { //value는 100이 값 들어있음
    this.result += value;                            //c는 주소
  }
}

public class Test3 {
  public static void main (String[] args) {
    Calculator3 obj1 = new  Calculator3(); //new 라는 작업은 힙에 변수를 만든다.
    Calculator3 obj2 = new  Calculator3(); //obj2에 들어가는것은 인스턴스의 주소값


    // 인스턴스 메서드를 호출할 때 
    // 반드시 앞에 인스턴스 주소를 제공해야 한다.
    // 그 인스턴스 주소는 메서드에 내장된 this 라는 변수에 전달된다.
    obj1.plus(100); // obj1, 100 장소,값
    obj1.plus(200); 
    obj1.plus(300);

    obj2.plus(111);
    obj2.plus(222);

    System.out.println(obj1.result );
    System.out.println(obj2.result );
  }
}