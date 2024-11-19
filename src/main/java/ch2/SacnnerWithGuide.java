package ch2;

import java.util.Scanner;

public class SacnnerWithGuide {

    public void printWithScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 개의 숫자를 입력하세요.");
        System.out.print("첫 번째 숫자:" + sc.nextInt() + "두 번째 숫자" + sc.nextInt());

    }
}
