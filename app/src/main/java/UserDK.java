package class0628;



public class UserDK {

  public static void main(String[] args) {
    //문제 Dunkin 클래스 coffee 메서드 호출, donuts 메서드 호출
    System.out.println("UserDk클래스 3:40");
    Dunkin.donuts(3);
    Dunkin dk = new Dunkin();
    String msg = dk.coffee();
    System.out.println("주문한 음료는 " + msg +" 입니다");
  }// end
}// class END
