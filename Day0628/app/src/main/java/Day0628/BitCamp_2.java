package Day0628;

public class BitCamp_2 extends LA { // LA상속 cherry 메서드 호출 

  public static void main(String[] args) {
    BitCamp_2 bc =new BitCamp_2();
    bc.book ();
    //    bc.cherry(); // 이렇게도 접근 가능.
    //    super.cherry(); // 부모클래스 접근 super
    //    this.cherry(); // this 생략 가능  , static에서는 super this 사용불가
  }// end

  public  void book() {
    System.out.println("book 몽블랑");
    super.cherry(); // 부모클래스 접근 super
    this.cherry(); // this 생략 가능
  }//end


  @Override
  public void cherry() {     //@Override public void cherry() 한줄로도 사용 가능 
    System.out.println("제주산 체리 11:07");
  } // end
}// class END

//LA 클래스에 있는 cherry() 메서드를 재정의 { 제주산 체리 0:57}