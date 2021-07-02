package Day0628;

public class Bank {
  // 자바는 객체지향언어 = oop = Object Oriented Programming
  // 6장 5 생성자 = constructor = constr
  // 기본생성자만 기술 => 기본생성자 생략가능
  // 비번으로 입금,송금,계좌이체,인출,잔액
  private int pwd = 1234; // private 키워드는 현재 클래스에만 적용
  private Bank() { }

  // 6장 4 오버로딩 메서드중복, 생성자도 중복가능
  void cal() { System.out.println(pwd); }
  public void cal (int m) { } // 입금
  public void cal (String name, int m)  {}  //어느 은행, 입금

}// class END
