package Day0628;

public class TestJumin {

  public static void main(String[] args) {
    // java.lang 패키지 String 클래스의 메서드 char CharAt(int)
    // java.lang 패키지 String 클래스의 메서드 int indexOf(int/String)
    // java.lang 패키지 String 클래스의 메서드 String substring (1시작,2끝 -1)
    // java.lang 패키지 String 클래스의 메서드 String substring (1시작) 시작부터 끝까지


    String min = "871024-1541965";
    int pos = min.indexOf("-");
    //    int tt = Integer.parseInt(min.substring(min.indexOf("-")));
    //    System.out.println(tt);
    System.out.println("pos=" + pos);
    //10월24일 생일이네요.

    String month = min.substring(2, 3);
    String day = min.substring(4, 5);
    System.out.println(month + "월" + day + "일 생일이네요");


    String last = min.substring(7); // 시작점, 끝 X
    System.out.println(last);

    int len = min.length();
    System.out.println("총 자리수 = " + len);


    //    int birthday = min.indexOf("8");
    //    System.out.println("birthday=" + birthday);

  }// end
}// class END

//    //    내가 한거
//    String min = "871024-1541965";
//    char c = min.charAt(7);
//    //    System.out.println(c);
//
//    if (c =='1' || c=='3') {
//      System.out.println("남자입니다.");
//    } else if (c == '2' || c == '4'){
//      System.out.println("여자입니다.");
//    }else { System.out.println("성별이 잘못되었습니다.");}


//    // 선생님 
//    String min = "871024-1541965";
//    char gender = min.charAt(7);
//    String message = "성별을 출력합니다." ;
//
//    if (gender == '1' ) {
//      message = "남자입니다.";
//    } else if (gender == '2' )  {
//      message = "여자입니다.";
//    } else { message = "성별이 잘못 표기 되었습니다."; }
//
//    System.out.println(message);
//
//    // 조건 if 남자입니다 /여자입니다
//    // String 문자열은 0번째부터 시작
//    //Srting 클래스의 메서드 charAt(int)




/*
 * 
 * 
 */
