package 진법변환복습;

import java.util.Scanner;

public class DecToBinFinalEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("십진수 입력 : ");
        int val = sc.nextInt();
        val = decToBin(val);
        System.out.println("이진수 : "+ val);
        val = binToDec(val);
        System.out.println("십진수 : "+ val);

    }
    // 함수의 결과가 이진수 형태로 표시되지만 실제는 이진수가 아님
    static int decToBin(int dec) {
        int bin = 0 ;
        int tmp = 0 ; // 계산값을 담을 임시변수
        int pos = 1 ; // 포지션 (자리수)
        while(dec != 0) {
            tmp = dec % 2 ; // 11인경우였다면 1
            bin = bin + tmp * pos; // 첫번째값은 1 이다
            dec = dec / 2;
            pos = pos * 10 ;

        }
        return bin;
    }
    static int binToDec(int bin) {
        int dec = 0 ;
        int i = 0 ;
        int tmp = 0 ;
        while(bin !=0){
            tmp = bin % 10;
            bin = bin / 10;
            dec += tmp * Math.pow(2,i++);
        }
        return dec;
    }
}
