package Day0628;

public class Lotto2 { // 단독실행


  public static int[] input() {
    int [] su = new int[6]; // su 배열 지역배열기술, 전역배열로 빼지 마세요
    su[0] = 1;  su[1] = 11;  su[2]=12;
    su[3] = 13; su[4] = 14;  su[5]=15;
    return su;
  } // end

  public static void output(int [] LT) {
    for (int i=0; i <LT.length; i++) {
      System.out.println(LT[i]);
    }
    System.out.println("로또 배열을 출력하였습니다.");
  }

  public static int output() {
    int hap = 0;
    int [] su = new int[6];
    su[0] = 1;  su[1] = 11;  su[2]=12;
    su[3] = 13; su[4] = 14;  su[5]=15;

    for(int i=0; i < su.length; i++) {
      hap += su[i];
    }
    return hap;
  }// end 
} // class END
