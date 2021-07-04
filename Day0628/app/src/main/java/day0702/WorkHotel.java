package day0702;

import java.util.Scanner;

public class WorkHotel {


  // 생성자 클래스이름, 리턴값X , void 기술 X
  // 생성자 사용은 new키워드 다음에 기술 ob = new 클래스()
  // 생성자는 중복가능, 기본생성자 생략가능
  // 멤버필드 = 전역변수 private

  Scanner sc = new Scanner(System.in);

  private int floor; // 층 = 행 3층
  private int room; // 호 = 행 5호 3층*5열 = 15방구성
  private String[][] name = new String [3][5];
  private String title;



  public WorkHotel() { }
  public WorkHotel(String name) { }
  public WorkHotel(String name, int year) { }


  public void process() {
    map();
    System.out.println("7월 1일 목요일 4시 19분");
    int sel = 9;
    while (true) {
      System.out.println("\n1.투숙 2.퇴실 3.map 4.list 9.종료 >>>");
      sel = Integer.parseInt(sc.nextLine());
      if(sel==9) {
        System.out.println("호텔예약프로그램 종료합니다.");
        System.exit(1);
      } 


      switch (sel) {
        case 1: checkIn(); break;
        case 2: checkOut(); break;
        case 3: map(); break;
        case 4: list(); break;
        default: System.out.println("잘못된 명령입니다."); break;

      }// switch end
    }//while end
  }// end

  public void checkIn () {
    //    String [][] name = null;
    //    String [][] arr  = new String[3][5];
    try {
      System.out.print("몇층에 투숙? [1...3]");
      floor = Integer.parseInt(sc.nextLine())-1;
      System.out.print("몇호에 투숙? [1...5]");
      room = Integer.parseInt(sc.nextLine())-1;
      //if 문 이미예약중인 방입니다.

      System.out.print("투숙객 이름?");
      title = sc.nextLine();
    } catch (Exception e){
      System.out.println("올바른 명령이 아닙니다.");
    }
    System.out.print("체크인 성공!");
    System.out.println("");
  }// end

  public void checkOut() {
    System.out.println("퇴실 하시겠습니까?[y/N]");
    if (sc.nextLine().equals("y")) {
      System.out.println("방번호?");
      room = Integer.parseInt(sc.nextLine());
      System.out.println("체크아웃 성공!");
    } else { 
      System.out.println("취소하셨습니다.");
    }

  }// end

  public void map() {  //printAll() = list() = display()
    System.out.println("\n\t[" + title + "투숙 상태 ]");
    System.out.println();

    // 배열 초기화
    String[][] name = new String [3][5];
    for(int i = 0; i < 3; i++) {
      for(int b = 0; b < 5; b++) {
        System.out.print((i+1) + "0" + (b+1) + "호 ");
      }
      System.out.println();

      for(int j = 0; j < 5; j++) {
        if(this.name[i][j] == null) {
          System.out.print("\t");
          continue;
        }// if end
        System.out.println(this.name[i][j]+"\t");
      }// for j end
      System.out.println("\n------------------------------------------------");
    }//for i end

  }// end


  public void list() {  // 영림쌤 구현해서 보여드리겠습니다.
    System.out.println("\t [list]");
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 5; j++) {
        if (name [i][j] == null) {
          System.out.print(" " + (i + 1) + "0" + (j+1) + "호 □" + "\t" );
        } else { 
          System.out.print("" + (i +1) + "0" + (j+1) + "호 ■ \t" + name[i][j]);

        }
      } // for j 
      System.out.println();
    }// for i
  }// end


  public static void main(String[] args) {
    WorkHotel wh = new WorkHotel();
    wh.process();

  } // end
}// class END


