package PC방알바;

import java.util.Scanner;

public class Pc {
    int[] pcarr = new int[100];
    int count ;
    int rejectCnt = 0 ;
    Scanner sc = new Scanner(System.in);


    void select(){
    System.out.print("손님의 수를 입력하세요");
    int consumer = sc.nextInt();


     for(int i = 0 ; i < consumer ; i++){
         int select = sc.nextInt();
         if(pcarr[select-1] == 1) rejectCnt++;
         else pcarr[select-1] = 1;

     }
    }


    void viewPcarr(){
        System.out.print("거절횟수는"+rejectCnt+"입니다.");
        for(int i = 0 ; i <= pcarr.length ; i++){
           if(pcarr[i] == 0 ) {
               System.out.println(i+1+"번째는"+"[O]");
           } else {
               System.out.println(i+1+"번째는"+"[X]");
           }
        }

    }












}
