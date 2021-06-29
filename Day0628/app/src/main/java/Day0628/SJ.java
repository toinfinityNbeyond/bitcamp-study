package Day0628;

public class SJ { // make 공급처

  public int getTotal( String name, int a, int b) { // 지역변수 이름과 매개변수 이름과 달라야함.
    System.out.printf(name + "님의 성적합계처리");
    //    String name1 = "kim";
    int hap = a + b;   // int hap = kor + eng;
    return hap; 
  }// end

  public double getMean(int value) {
    double avg = (double)value / 2;
    return avg;
  }// end

  public String getScore (String c) {
    String score = c;
    return score;
  }// end

  public boolean getPass(boolean b) {
    boolean pass = true;
    return pass; 
  }// end
}// class END


//합계구하는 함수 sum getTotal
//평균구하는 함수 avg
//학점구하는 함수 total
//합격여부를 구하는 함수 pass


