package Day0628;

public class SJ3 { // make 공급처
  public int getTotal (String name ,int a, int b) {
    int sum = a + b;
    return sum;
  }

  public double getMean(int value) {
    double avg = (double) value / 2;
    return avg;
  }

  public char getGrade(double value) {
    char grade = 'B';

    switch ((int)value/10) {
      case 10:
      case 9: grade = 'A'; break;
      case 8: grade = 'B'; break;
      case 7: grade = 'C'; break;
      case 6: grade = 'D'; break;
      default:
        grade = 'F'; break;
    }
    return grade;
  }// end

  public String result (double data, int x, int y) {
    String msg ="합격여부안내";
    if (data >=70 && x >=60 && y>=60 )  {
      System.out.println("축합격");
    } else System.out.println("불합격");
    return msg;
  }//end


}// class END


// 합계구하는 함수 getTotal
// 평균구하는 함수 getMean
// 학점구하는 함수 getGrade
// 합격여부를 구하는 함수 result
// 학점을 구하는 메서드 구현 A 100~90  B 80~89 C70~79 C 60~69 D59~0
// 평균 점수에 따라서 if 대신 switch문 사용
// 리턴 값, 타입, 메서드 이름 고민해보기 
// 평균 70점부터 축합격
// 0~69 재시험
// class Board{}
// class BoardUser{ 메인메서드}

