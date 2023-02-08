package 스트림으로홀수짝수정렬;

import java.util.Arrays;
import java.util.Scanner;

// 7개의 정수를 입력 받아 홀수 짝수 나누어 출력하기
// 스트림을 이용해서
public class StreamTestEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        for(int i =0 ; i<arr.length; i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("--- 짝수 ---");
        Arrays.stream(arr).filter(c->c%2==0).forEach(System.out::println);
        System.out.println("--- 홀수 ---");
        Arrays.stream(arr).filter(c->c%2!=0).forEach(System.out::println);
    }
}
