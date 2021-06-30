package Day0628;

public class Child extends Father{

  public static void main(String[] args) {
    // 모든 클래스는 최상위 Object 클래스 상속받음
    Child cd = new Child();
    int a = cd.bank();
  }// end

  public void book() { int m = bank();}



}
