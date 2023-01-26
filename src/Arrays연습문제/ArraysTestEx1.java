package Arrays연습문제;

import java.util.Arrays;
import java.util.Scanner;

// 1000개의 배열을 생성하고 , 각 배열에 1000미만의 임의의 수 생성 (중복 값 제거)
// 찾을 임의의 수 입력
// 배열을 오름 차순 정렬하고 난 후 찾을 수를 이분 검색을 이용해서 값 찾기
// 값을 찾으면 해당 값의 위치를 출력 (인덱스가 아님)
public class ArraysTestEx1 {
    public static void main(String[] args) {
     int[] arr = new int[1000];
     boolean isTrue = false ;
     int c = 0 ;

     Scanner sc = new Scanner(System.in);
     int find = sc.nextInt();

     for(int i =0; i < arr.length; i++){
         for(int j = 1 ; j < arr.length; j++){
          if(arr[i] == arr[j]) isTrue = true;
           if(isTrue) {
               arr[i] = (int)(Math.random()*10000);
           }
         }


     }
     Arrays.sort(arr);
//     while(true){
//
//            System.out.println(arr[c]);
//
//        c++;
//        if(c == 1000) break;
//     }
      System.out.println(Arrays.binarySearch(arr,find)+1);

    }
}
