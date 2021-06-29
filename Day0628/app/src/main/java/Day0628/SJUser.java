package Day0628;

public class SJUser { // Use 소비자
  public static void  main(String[] args) { //static은 main 
    SJ sj = new SJ();

    //    String name ="kim";
    String id = "kim";
    int first = 90;
    int second = 85;
    int total = sj.getTotal(id, first, second);
    double avg = sj.getMean(total);

    System.out.println("합계="+ total);
    System.out.println("합계="+ avg);
    //        boolean pass = sj.getPass(pass);
    //        String score = sj.getScore(score);
  }
}// class END
