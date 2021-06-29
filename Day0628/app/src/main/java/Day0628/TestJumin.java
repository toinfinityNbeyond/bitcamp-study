package Day0628;

public class TestJumin {

  public static void main(String[] args) {
    // java.lang 패키지 String 클래스의 메서드 char CharAt(int)
    String min = "871024-1541965";
    char c = min.charAt(7);
    //    System.out.println(c);

    if (c =='1' || c=='3') {
      System.out.println("남자입니다.");
    } else {
      System.out.println("여자입니다.");

    }

    // 조건 if 남자입니다 /여자입니다
    // String 문자열은 0번째부터 시작
    //Srting 클래스의 메서드 charAt(int)

  }// end
}// class END
