package com.eomcs.lang.ex04;


public class T0120 {
    public static void main(String[] args) {
    
    
        int  a = 1, b = 2, c = 3;
       
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a+b+c);
        System.out.println("a+b+c=" + a);
        System.out.println("a+b+c=" + b);
        System.out.println("a+b+c=" + c);
        System.out.println(a+b);
        System.out.println(a+c);
        System.out.println(b+c);
        System.out.println("a+b+c="+a+b+c); //결과값이 a+b+c=123 출력된다. 문자열이 먼저더해지기 때문. 아래열 처럼 괄호 사용해야 함.
        System.out.println("a+b+c="+(a+b+c)); 
        System.out.println(a+b+c + "=a+b+c");
        System.out.print("a+b+c=");
        System.out.print(a+b+c);
       // System.out.printf("a+b+c=");
        //static.out.printf(a+b+c);
       // System.out.println("a+b+c=" + a+b);
        



    }
}