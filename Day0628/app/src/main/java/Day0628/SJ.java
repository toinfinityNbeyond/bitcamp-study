package Day0628;

public class SJ { // make 공급처

  public int getTotal( String name, int a, int b) { // 지역변수 이름과 매개변수 이름과 달라야함.
    System.out.println(name + "님의 성적합계처리");
    //    String name1 = "kim";
    int hap = a + b;   // int hap = kor + eng;
    return hap; 
  }// end

  public double getMean(int value) {
    double avg = (double)value / 2;
    return avg;
  }// end

  public char getGrade (double value) { // 평균데이터 점수 int 정수형
    char grade = 'F';

    switch ((int)value/10) {
      case 10:  
      case 9: grade = 'A'; break;
      case 8: grade = 'B'; break;
      case 7: grade = 'C'; break;
      case 6: grade = 'D'; break;
      default :
        grade = 'F'; break;
    }
    return grade;
  }// end

  public String result (double data) { 
    String msg = "합격여부안내문";
    if (data >=70)  {
      msg = "축합격";
    } else 
      msg = "재시험";
    return msg;
  }// end

  public String result (double data, int x , int y) { // 함수의 중복 = 오버로딩(overLoading)
    String msg = "합격여부안내문";
    if (data >=70 && x >= 60 && y >= 60)  {
      msg = "축합격";
    } else 
      msg = "재시험";
    return msg;
  }// end
}// class END


// 합계구하는 함수 sum getTotal
// 평균구하는 함수 avg
// 학점구하는 함수 total
// 합격여부를 구하는 함수 pass
// 학점을 구하는 메서드 구현 A 100~90  B 80~89 C70~79 C 60~69 D59~0
// 평균 점수에 따라서 if 대신 switch문 사용
// 리턴 값, 타입, 메서드 이름 고민해보기 
// 평균 70점부터 축합격
// 0~69 재시험
// class Board{}
// class BoardUser{ 메인메서드}

