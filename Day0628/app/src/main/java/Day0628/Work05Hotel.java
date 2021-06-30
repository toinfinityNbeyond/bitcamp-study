package Day0628;

import java.util.Scanner;

public class Work05Hotel {

  // 생성자 클래스이름, 리턴값X , void 기술 X
  // 생성자 사용은 new키워드 다음에 기술 ob = new 클래스()
  // 생성자는 중복가능, 기본생성자 생략가능
  // 멤버필드 = 전역변수 private

  private int floor; // 층 = 행 3층
  private int room; // 호 = 행 5호 3층*5열 = 15방구성
  private String[][] name = new String [3][5];
  private String title;


  public Work05Hotel() { }
  public Work05Hotel(String name) { }
  public Work05Hotel(String name, int year) { }


  public void process() {
    Scanner sc = new Scanner(System.in);
    int sel = 9;
    while (true) {
      System.out.println("\n1.투숙 2.퇴실 3.map 4.list 9.종료 >>>");
      sel = Integer.parseInt(sc.nextLine());
      if(sel==9) {
        System.out.println("호텔예약프로그램 종료합니다.");
        System.exit(1);
      }
      switch (sel) {


      }// switch end
    }//while end
  }// end

  public void checkIn() {

  }// end

  public void checkOut() {

  }// end

  public void map() {  //printAll() = list() = display()

  }// end

  public void list() {  // 영림쌤 구현해서 보여드리겠습니다.

  }// end


  public static void main(String[] args) {
    Work05Hotel wh = new Work05Hotel();
    wh.process();

  } // end
}// class END
