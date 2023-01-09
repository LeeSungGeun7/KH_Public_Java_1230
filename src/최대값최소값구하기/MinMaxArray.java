package 최대값최소값구하기;

import 가장큰수출력.MaxValue;

import java.util.Arrays;
import java.util.Scanner;

// 정수를 입력 받음 (배열의 갯수)
// 입력받은 정수의 크기 만큼의 배열 생성
// 배열의 크기 만큼 순회하면서 임의의 정수 값 입력
// 입력 받은 배열에서 최소값과 최대값 출력
// 정수값 : 10
// 1 3 5 7 2 6 7 12 34 9 11
// Min : 1
// Max : 34
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("배열의 크기를 입력");
        int[] numArr = new int[num1];

        for(int i = 0 ; i < numArr.length ; i++){
            numArr[i] = sc.nextInt();

        }
        int min = numArr[0];
        int max = numArr[0];
        for(int e : numArr){
            if (min > e) min = e ;
            if (max < e) max = e ;
        }
        System.out.println("최소값:" + min ) ;
        System.out.println("최대값:"+ max);

//        for(int count = 0; ; ) {
//
//            System.out.print((numArr[count]) + " ");
//            count++;
//            if (count == num1){
//                   break;

            }
        }






        // 정수값 입력 받기 V
        // 입력 받은 정수 값으로 배열 생성 V
        // 생성된 배열의 크기만큼 순회 하면서 정수 입력 받음
        // 최소값 최대값을 구하기위해 배열의 첫번째값 대입
        // 반복문을 순회하면서 최소값과 최대값 찾기

















