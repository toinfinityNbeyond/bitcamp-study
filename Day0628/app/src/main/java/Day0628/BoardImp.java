package Day0628;

public interface BoardImp {
  // 메서드 선언만 = abstract method = 추상메서드 = 명세서
  // abstract 키워드 생략가능, 기술해도 에러없음 
  public abstract int boardCount();
  public abstract  boolean boardInsert();
  public void boardDelete(int num);
}// interface END
