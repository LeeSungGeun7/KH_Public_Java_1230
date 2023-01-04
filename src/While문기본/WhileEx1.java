package While문기본;

import java.util.Scanner;

// 정해진 횟수를 반복하기
public class WhileEx1 {
//    public static void main(String[] args) {
//        int treeHit = 0 ;
//        while (true) { // 무한의 반복조건
//            treeHit++; // 변수값을 1증가
//            System.out.println("나무를" + treeHit + "찍었습니다.");
//
//            if(treeHit == 10) {
//                System.out.println("나무가 넘어갑니다.");
//                break;//반복문 수행을 탈출
//            }
//
//
//
//        }
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i+1;j++) {
            System.out.print("* ");
        }
        System.out.println();
    }















    }










}
