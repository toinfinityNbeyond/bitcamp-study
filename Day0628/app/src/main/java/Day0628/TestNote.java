package Day0628;

public class TestNote {

  public static void main(String[] args) {
    System.out.println("김민지 9:42");
    System.out.println("하성운 9:42");
    TestNote tn = new TestNote();
    tn.note();

  }//main end

  public  String book() {  // 문제1 같은문서의 메서드 호출
    String my = "몽블랑"; //로컬 변수(local variable)
    return my;
  }// end

  public int price() {
    int money = 2700;
    return money;
  }

  public void note() { //Non-static 메서드
    String title = book();
    int pay = price();
    //    int money =2700;
    System.out.println("책제목 =" + title);
    System.out.println("책제목 =" + book() );
    System.out.println("책가격 =" + pay);
    System.out.println("책가격 =" + price());
  }// end


}// class END
