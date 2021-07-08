package Day0707;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//클래스 및 인터페이스 이름 첫글자는 대문자
// 메서드 및 전역변수는 첫글자 소문자
public class DBTest {
  Connection CN = null; //DB서버연결정보 서버 ip 주소,계정id pwd
  Statement ST =null; // ST =CN.createStatement()명령어생성 삭제, 신규등록, 조회
  ResultSet RS = null; //select 조회 결과값 전체 데이터를 기억.
  String msg= "isud=crud쿼리문기술";
  int Gtotal = 0;
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    DBTest DB = new DBTest();

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클드라이브 로드
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
      DB.CN = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "system", "1234");
      System.out.println("오라클 드라이브 및 서버 연결성공");
      DB.ST = DB.CN.createStatement();// 첫번째 명령어 생성

    }catch (Exception ex) {System.out.println("에러이유" + ex );}
    DB.p();
  }


  public void p() {
    int sel = 3;
    while (true) {
      System.out.println("메뉴 선택");
      System.out.println("\n1.입력 2.조회 3.종료>>>");
      sel = Integer.parseInt(sc.nextLine());
      if(sel==3) {
        System.out.println("종료합니다.");
        System.exit(1);
      }

      switch (sel) {
        case 1: in(); break;
        case 2: out(); break;
        default: System.out.println("잘못된 명령");break;
      }
    }
  }

  public void in() {
    // 두번째 키보드에서 데이터 입력
    try {
      System.out.print("\n코드입력(4자릿수)>>>"); 
      int a = Integer.parseInt(sc.nextLine()); // 코드 자릿수 4자리 체크
      System.out.print("\n이름입력>>>"); 
      String b = sc.nextLine();
      System.out.print("\n제목입력>>>"); 
      String c = sc.nextLine();

      // 세번째 쿼리문 완성
      //msg ="insert into test(code,name,title,wdate,cnt) values(3300,'b','c', sysdate, 0)";
      msg ="insert into test(code,name,title,wdate,cnt) values("+a+" ,'"+b+"','"+c+"', sysdate,0)";
      System.out.println(msg);

      // 네번째 서버에서 실행 executeUpate("insert ~~")
      int OK = ST.executeUpdate(msg);
      if (OK > 0) {
        System.out.println(a+" 코드 저장성공했습니다");
      } else {
        System.out.println( a+" 코드 저장실패했습니다");}

      /////////////////////////////////////////
      msg = "select count(*) as hit from test";
      RS = ST.executeQuery(msg);
      if (RS.next()== true) {Gtotal = RS.getInt("hit");}
      //////////////////////////////////////

    } catch (Exception ex) {} 
  }
  public void out() {

    try {
      System.out.println("프로그램 전체데이터 읽어오는중...잠시 기다려 주세요");
      Thread.sleep(1000);
      msg ="select * from test"; // 문자열을 명령어 인식해서 실행하도록 Statement
      RS = ST.executeQuery(msg);

      System.out.println();
      System.out.println("------------ 데이터 출력--------------");
      System.out.println("\t\t\t    전체레코드갯수:" + Gtotal);
      System.out.println("코 드\t이 름\t제 목\t날 짜\t\t   조회수");
      while(RS.next()==true) {
        // 필드에 접근해서 데이터를 가져올 때 getxxx() 필요
        int ucode = RS.getInt("code");
        String uname = RS.getNString("name");
        java.util.Date udt = RS.getDate("wdate");
        String utitle = RS.getNString("title");
        int ucnt = RS.getInt("cnt");
        System.out.println(ucode + "\t" + uname + "\t" + utitle + "\t" + udt + "\t" + ucnt );
      }

    } catch (Exception ex) {}


  }// main end
}// class END

//신규등록, 전체출력 성공 후 메서드를 생성해서 최대한 메서드 활용
