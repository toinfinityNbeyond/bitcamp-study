package Day0628;

public class TestBook {
  public  int m = 78;

  public static void main(String[] args) {
    //    new TestBook().note();  // 익명의 객체 (Anonymous)
    char a ='A', b='0' , c = 97;  //48~49  65~90  97~122
    System.out.println(a + "\t" + b + "\t" + c);
    System.out.println();

    int x = a;
    int y = b;
    int z = c;
    System.out.println(x + "\t" + y + "\t" + z);
    System.out.println();

  }//main end



  public  void note() { //Non-static 메서드
    int m = 24;
    System.out.println("지역변수 책가격 =" + m); //24
    System.out.println("전역변수 책가격 =" + this.m); //78

  }// end
}// class END
