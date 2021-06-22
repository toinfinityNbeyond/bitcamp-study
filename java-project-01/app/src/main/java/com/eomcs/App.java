package com.eomcs;

import java.util.Scanner;

//01. main(): 프로그램 entry point
//02. 사용자로부터 명령어 입력 받기
//03. 사용자로부터 계속 명령어 입력 받기
//04. quit 명령어를 입력 받았을 때 반복 종료하기
//05. 명령어 별로 실행을 분기하기
//06. 게시글 입력 받기
//07. 배열을 이용하여 여러 개의 게시글 보관하기
//08. 상수(final 변수)를 이용하여 배열의 크기를 다루기
//09. 게시글 목록 출력하기
//10. 게시글 상세 조회
//11. 게시글 조회수 추가하기
//12. 게시글 등록일 추가하기
//13. 게시글 변경하기
//14. 게시글 삭제하기
//15. 메서드 문법을 이용하여 기능 별로 명령어를 묶어 관리하기
//16. 클래스를 이용하여 새 데이터타입을 정의하기
public class App {
  public static void main(String[] args) {
    System.out.println("[게시판 관리]");

    Scanner scanner = new Scanner(System.in); 
    System.out.print("명령 → ");
    String s = scanner.nextLine();
    scanner.close();

    switch (s) {
      case "list":
        System.out.println("[게시판 목록]");
        break;
      case "name":
        System.out.println("[게시판 이름]");
        break;
      case "update":
        break;
      default :
        System.out.println("지원하지 않는 명령입니다.");
    }
    System.out.println("입력을 완료했습니다.");
  }

}





