package com.eomcs.lang.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Test0110 {

  static void  printSpace (int len) {
    for (int count = 1; count <= len; count++) {
      System.out.println(" ");
    }
  }
  static void printStars (int len) {
    for (int count = 1; count <= len; count++) {
      System.out.println("*");
    }
  }

  static int getSpaceLength(int totalStar, int displayedStar) {
    return (totalStar - displayedStar) / 2;
  }


  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();

    //    int starLen = 1;
    //    while (starLen <= len) {
    //      // 별 앞에 공백 출력
    //      int spaceCnt = 1;
    //      int spaceLen = (len - starLen) / 2;
    //      while (spaceCnt <= spaceLen) {
    //        System.out.print(" ");
    //        spaceCnt++;
    //      }
    //
    //      // 별 출력
    //      int starCnt = 1;
    //      while (starCnt <= starLen) {
    //        System.out.print("*");
    //        starCnt++;
    //      }
    //
    //      // 출력 줄 바꾸기
    //      System.out.println();
    //      starLen += 2;
    //
    //    }
  }    

}