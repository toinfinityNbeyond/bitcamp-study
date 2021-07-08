package Day0707;

public class Board { //test 테이블

  public static void main(String[] args) {
    //  1.오라클 드라이버 로드
    //  2. db서버접근 계정명, pwd 127.0.0.1:152:XE system 1234
    //  3.명령어 생성은 2번째 서버정보를 참조해서 명령어 생성 Statement ST =

    try {
      Class.forName("orale.jdbc.driver.OracleDriver");
      connecton conn = DriverManager.getConnection(jdbc:oracle:thin:@127.0.0.1:152:XE)
    }
    String url = ""
        String msg = "select * from test";
  }// end
} // Board class END
