package Day0628;

import java.io.InputStream;

public class Work03gugudan {

  public static void main(String[] args) throws Exception {

    // 자바에서 표준입력 ascii  코드 byte 형태
    // 자바에서 표준입력 System.in 키보드입력
    InputStream is = System.in;  
    System.out.println("단입력 >>>" );
    int dan = is.read();
    for (int a=1; a < 10; a++) {
      System.out.println(dan + "*" + "=" +(dan * a));
    }


  }// end
} // class END
