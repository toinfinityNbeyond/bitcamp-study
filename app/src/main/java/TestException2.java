package class0628;

public class TestException2 {

  public static void main(String[] args) {

    int su1 = 9;
    int su2 = 5;
    int mul = 0, mok = 0;

    try {
      mul = su1*su2 ;
      mok = su1/su2 ; 
    } catch (Exception ex) {System.out.println("에러이유 " + ex);}

    System.out.println();
    System.out.println(su1 + " * " + su2 + "=" + mul);
    System.out.println(su1 + " / " + su2 + "=" + mok);

    //    System.out.printf("%d * %d = %d%n" , su1, su2, su1 * su2);
    //    System.out.printf("%d / %d = %d%n" , su1, su2, su1 / su2);

    //    boolean[] camp = new boolean[5];
    //    System.out.println(camp[11]);
    //    System.out.println(camp[4]);

    System.out.println("\n***** 까사노의 1학기 점수 *****");
    System.out.println("국어=90");
    System.out.println("영어=85");
    System.out.println("총점=175");

  }//end
} // TestException2 class END
