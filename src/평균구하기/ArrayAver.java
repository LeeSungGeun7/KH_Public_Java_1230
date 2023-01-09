package 평균구하기;

import java.util.Scanner;

// 5명의 학생이 시험을 치는데 시험점수가 40점 미만이면 보충수업으로 듣는 조건으로 점수를 40으로 수정
// 모든학생이 40점미만 인경우 보충수업을 듣기로함
// 모든 학생의 성적에 대한 평균을 구하기
public class ArrayAver {
    public static void main(String[] args) {
      int[] scoreArr = new int [4] ; // 5명의 성적 입력 받기 위한 배열
        Scanner sc = new Scanner(System.in); //성적을 입력 받기 위한 스캐너생성
      int score = sc.nextInt();  // 배열에 성적을 받기
      int sum = 0 ;
      int count=0 ;


      for(int i = 0 ; i < scoreArr.length ; i++ ){
          scoreArr[i] = sc.nextInt();
          sum += scoreArr[i] ;
          if(scoreArr[i] < 40) scoreArr[i] = 40;
      }
            System.out.printf("%.2f", (double)sum/5);


//
//      for(int i = 0   ; scoreArr.length ; i++){
//
//          if ( scoreArr[i] < 40 ){
//              count++;
//          if (count == 5) System.out.println("보충수업을 듣기");
//          }
//
//
//      }
//
//      System.out.println((int)sum/scoreArr.length + " ");
//



















    }
}
