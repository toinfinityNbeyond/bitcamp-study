package day0702;

import java.util.Scanner;

public class Work05Hotel {   

  private int floor ; //층=행 3층
  private int room ;  //호=열 5호  3층*5열=15방구성
  private String[][] name = new String[3][5];
  private String title;



  public Work05Hotel(){ }
  public Work05Hotel(String name){ }
  public Work05Hotel(String name, int year){ }



  public void process() {
    Scanner sc = new Scanner(System.in);
    map();
    int sel = 9;
    while(true) {
      System.out.println("\n1.투숙  2.퇴실  3.map  4.list 9.종료 >>>");
      sel = Integer.parseInt(sc.nextLine());
      try {
        if(sel==9) { 
          System.out.println("호텔예약프로그램 종료합니다");
          System.exit(0);
        } 
        switch(sel) {
          case 1 : checkIn(sc); break;
          case 2 : checkOut(sc); break;
          case 3 : map(); break;
          case 4 : list(); break;
          default : System.out.println("올바른 메뉴를 선택해 주세요");
          break;
        }//switch end
      }catch (Exception e) {
      }//while end
    }
  }//end

  public void checkIn(Scanner sc) {


    try {
      System.out.print("몇층에 투숙?");
      floor = Integer.parseInt(sc.nextLine())-1;

      System.out.print("몇호에 투숙?");
      room = Integer.parseInt(sc.nextLine())-1;

      System.out.print("투숙객 이름?");
      name[floor][room] = sc.nextLine();
    }catch (Exception e) {
      System.out.println("유효한 객실을 선택해 주세요.");
    }

  }//end

  public void checkOut(Scanner sc) {
    System.out.println("퇴실 이름 : ");

    String title = sc.nextLine();
    for(int floor = 0; floor < name.length; floor++) {
      for(int room = 0; room <name[0].length; room++) {
        if(name[floor][room].equals(title)) {
          name[floor][room] = null;
        }//if e
        System.out.println("퇴실 완료 되었습니다.");
      }
    }//for e
    //    ----------------------------------------------------------------
    //    System.out.println("퇴실 방 번호?");
    //    int temp;
    //    int i;
    //    int floor1 = 0;
    //    int room1 = 0;
    //    int[] num = new int[3];
    //    temp = Integer.parseInt(sc.nextLine());
    //    
    //    for(i = num.length-1; i>=0; i--) {
    //      num[i] = temp % 10;
    //      temp /= 10;
    //      
    //      if(i == num.length-1) {
    //      floor1 = (num[i]-1);
    //    } if(i == num.length-3) {
    //      room1 = (num[i]-1);
    //    }//if e
    //    
    //    for(; floor < name.length; floor++) {
    //      for(; room <name[0].length; room++) {
    //        if(name[floor][room] == name[floor1][room1]) {
    //          name[floor][room] = null;
    //      }//if e
    //    }
    //    }//for e
    //    
    //    }//for e
    //System.out.println("퇴실 완료 되었습니다.");

  }//end

  public void map() { 
    System.out.println("\t[호텔 투숙 상태]");
    for(int floor = 0; floor < name.length; floor++) {
      for(int n = 0; n < name[0].length; n++) {
        System.out.print((floor+1) + "0" + (n+1) + "\t");

      }
      System.out.println();

      for(int room = 0; room <name[0].length; room++) {
        if(name[floor][room] == null) {
          System.out.print("\t");
          continue;
        }//if e
        System.out.print(name[floor][room] + "\t");
      }
      System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    }//for E
  }//end

  public void list() {
    System.out.println("\t[호텔 투숙 상태]");
    for(int floor = 0; floor < name.length; floor++) {
      for(int room = 0; room <name[0].length; room++) {
        if(name[floor][room] == null) {
          System.out.print((floor+1) + "0" + (room+1) +"호 □ " + "\t");
        } if(name[floor][room] != null) {
          System.out.print((floor+1) + "0" + (room+1) +"호 ■ "+ name[floor][room] + "\t");
        }
      }System.out.println();

    }
  }//end

  public static void main(String[] args) { 
    Work05Hotel wh = new Work05Hotel();
    wh.process();
  }//end
}//class END
