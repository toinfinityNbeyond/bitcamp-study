package Day0628;

public class Child extends Father{

  public static void main(String[] args) {
    Child ck = new Child();
    ck.book();

  }// end


  public void book() {

    super.car();
    this.car();
  }

  public void car() { 
    System.out.println("Child 자식클래스 car 메소드");


  }
