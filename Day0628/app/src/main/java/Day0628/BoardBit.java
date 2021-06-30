package Day0628;

public class BoardBit implements BoardImp {

  public static void main(String[] args) {


  }//end

  @Override
  public int boardCount() {
    return 0;
  }//end

  @Override
  public boolean boardInsert() {
    return false;
  }//end

  @Override
  public void boardDelete(int num) {
    // @Overrid 생략가능

  }//end


  public void index() {
    //인터페이스 소속아님, 상속 X , 재정의 대상 X 
    // @Override 기술하면 에러
  }//end

}// class END
