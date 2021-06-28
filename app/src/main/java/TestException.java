package class0628;

public class TestException {

  public static void main(String[] args) {

    int dan = 3;
    for (int i=1; i <10 ; i++) {
      System.out.println(dan + "*" + i + "=" +(dan*i));

      try { Thread.sleep(500); } catch (Exception e) { }
      // try { Thread.sleep(1000); } catch (Exception e) {} 1초단위로 값이 나온다.
      // Thread.sleep(500); //문법에러
    }

    System.out.println();
    System.out.println("우리나라");
    System.out.println("대한민국");
    System.out.println("금수강산");
  }//end
} // TestException class END
