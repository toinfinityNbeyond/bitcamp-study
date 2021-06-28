package class0628;

public class Dunkin {
  public String coffee() { 
    // Non-static 메서드, 리턴값
    //주문할 때 = 필요할 때 메모리에 로드
    // 객체화 생성후 객체명.coffee();
    String kind = "쿨라임피지오";
    return kind;
  }// end

  public static void donuts(int cnt) { 
    // static 메서드 메서드(매개인자)
    // 이미 상품화 클래스이름,도너츠()
    // Dunkin.donuts(); 접근
    System.out.println("도너츠메서드 주문갯수  " +cnt+ " 입니다" );
  } //end

  public void menu() { //리턴값X, 매개인자X 

  }// end
}// class END
