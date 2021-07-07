package day0702;

import java.util.Scanner;

public class Test { 


  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String message= " ";


    System.out.println("사번입력>>>");
    int a = Integer.parseInt(sc.nextLine()); // 3345

    System.out.println("이름입력>>>");
    String b = sc.nextLine(); // kim

    System.out.println("부서입력>>>");
    String c = sc.nextLine(); // 전산


    // SQL쿼리문장 문자,문자열 'kim' '전산'
    message = "insert into insa (sabun,name,buse) values(a, b, c)";
    message = "insert into insa (sabun,name,buse) values(" +a+", '"+b+"', '"+ c +"')";
    System.out.println(message);
    //msg = insert into insa (sabun,name,buse) values(3345,,'kim','전산')
  }
}