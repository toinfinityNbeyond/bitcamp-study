package Day0628;

public class Work01jumin {

  public static void main(String[] args) {
    String min = "871024-1541965"; //키보드 입력대신 초기값으로 사용
    String min1 = "871024";
    String min2 = "1541965";

    //문제 1
    String total = min.substring(0);
    String message1 = "Q1 : 전체 자릿수를 출력하세요.";

    System.out.println(message1);
    System.out.println("전체 자릿수 = " + total);
    System.out.println();

    //문제 2
    String message2 = "Q2 : 번호를 출력하세요.";
    System.out.println(message2);
    String num = min.substring(7);
    String num2 = min.substring(min.indexOf("-"));

    for(int i=0; i < min1.length(); i++) {
      System.out.print("*");
    }

    System.out.println(num2);
    System.out.println();

    //문제 3 
    char gender = min.charAt(7);
    String message3 = "Q3 : 성별을 출력하세요.";
    System.out.println(message3);

    switch (gender) {
      case '1':
      case '3': System.out.println("남자입니다."); break;
      case '2':
      case '4': System.out.println("여자입니다.");break;
      default : System.out.println("성별이 잘못되었습니다."); break;
    }
  } // end
} // class END


//문제1 총 자릿수는6 -7 13자리, -포함해서 14자리
//문제2 ******-1541965
//문제3 1,3 남자 2,4 여자 switch
// length(), substring(), indexOf(), charAt()


