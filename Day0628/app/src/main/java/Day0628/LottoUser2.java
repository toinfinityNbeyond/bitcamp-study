package Day0628;

public class LottoUser2 {

  public static void main(String[] args) {

    int [] arr = Lotto.input();
    Lotto.output(arr);

    Lotto LG = new Lotto();
    int value = LG.inputHap();
    System.out.println("숫자합계="+ value);
    System.out.println("숫자합계="+ LG.inputHap());

    System.out.println("");
    System.out.println("java User PM 09:20");

  }// end
}// class END
