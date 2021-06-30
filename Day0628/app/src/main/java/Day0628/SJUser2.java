package Day0628;

public class SJUser2 { // Use 소비자
  public static void  main(String[] args) { 
    SJ2 sj2 = new SJ2();

    String name = "totoro";
    int first = 100;
    int second = 200;
    int total = sj2.getTotal(name, first, second );
    double avg = sj2.getMean(total);
    char ret = sj2.getGrade(avg);

    String info = sj2.result(avg, first, second);
    System.out.println("합계:" + total);
    System.out.println("평균:" + avg);
    System.out.println("학점 :" + ret);
    System.out.println("결과 :" + info);



  }//main end
}// class END
