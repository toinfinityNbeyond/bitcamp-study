package day0702;

public class WorkHotel {

  public static void main(String[] args) {


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


        }// switch end
      }//while end
    }// end

    public void checkIn () {


      //입력 받은 값을 배열에 넣기
      //    String [][] arr = { {(Sting)floor} ,{(Sting)room} };

    }// end

    public void checkOut() {


    }// end

    public void map() {  //printAll() = list() = display()
      System.out.println("\n\t[" + title + "투숙 상태 ]");

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
      System.out.println("\n\t [ list ]");
      for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 5; j++) {
          if (name[i][j] == null) {
            System.out.print(" " + (i+1)+ "0" + (j+1) + "호" + "□\t" + "\t");
          }else {
            System.out.print("" + (i+1)+ "0" + (j+1) + "호" + "■\t" + name[i][j]  + "\t");
          }
        }// j end
        System.out.println();
      }//for i end
    }// end


    public static void main(String[] args) {
      Work05Hotel wh = new Work05Hotel();
      wh.process();

    } // end
  }// class END

}

}
