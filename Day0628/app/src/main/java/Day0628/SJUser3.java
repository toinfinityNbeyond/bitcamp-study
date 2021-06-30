package Day0628;

public class SJUser3 { // Use 소비자
  public static void  main(String[] args) { 
    SJ sj3 = new SJ();

    String name = "Ha";
    int first = 100;
    int second = 44;
    int total = sj3.getTotal(name, first, second);
    double avg = sj3.getMean(total);
    char grade = sj3.getGrade(avg);

    String info =sj3.result(avg,first,second);


    System.out.println("합계=" + total);
    System.out.println("평균=" + avg);
    System.out.println("학점=" + grade);
    System.out.println("합격=" + info);



  }//main end
}// class END
