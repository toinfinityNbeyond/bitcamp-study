package Day0628;

public class TestLast {

  public static void main(String[] args) {

    int a = 234;
    double b =78.9;
    String c = "1200";

    // 문제1 b타입으로 int형으로 변환  + 34
    int x = (int)b;
    System.out.println(x+34);
    //    int x = (int) b;

    // 문제2 c타입으로 int형으로 변환
    int y = Integer.parseInt(c); // String ==> int
    System.out.println(y + 34);

    // 문제3 a타입으로 String형으로 변환
    //    String z = Integer.toString(a); // int ==> String
    String z = String.valueOf(a);
    System.out.println(z + 34);
  }// end
}// class END
