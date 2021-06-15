package com.eomcs.lang.ex05;

public class 연습 {
    public static void main(String[] args){
        
        int age = 34;
        int age2 =32;

        String message = ( age > 30) ? "성년":"청년";
        System.out.printf("나이가 %d면 %s이다.\n", age,message);

        String message2 = ( age2 < 25 ) ? "성년":"청년";
        System.out.printf("나이가 %d면 %s이다.\n", age2 ,message2);
    }
}