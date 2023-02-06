package 진수변환;
// 문제 : 8진수가 주어 졌을때 , 2진수로 변환하는  프로그램을 작성하시오.
// 입력 : 첫째줄에 8진수가 주어짐
// 출력 : 첫째줄에 주어진 8진수를 2진수로 변환하여 출력, 수가 0인 경우를 제외하고 반드시 1로 시작
// 314  => 각자리의 수가 0~7
// 11001100  011001100
// 000 001 010 011 100 101 110 111
//       1  10  11 100 101 110 111

import java.util.Scanner;

public class ConversionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char[] ch = num.toCharArray();
        String rst = "";
        String[] arr = {"000","001","010","011","100","101","110","111"};

        for(int e : ch) {
            switch(ch[e]-48){
                case 0 :  rst += arr[0]; break;
                case 1 :  rst += arr[1]; break;
                case 2 :  rst += arr[2]; break;
                case 3 :  rst += arr[3]; break;
                case 4 :  rst += arr[4]; break;
                case 5 :  rst += arr[5]; break;
                case 6 :  rst += arr[6]; break;
                case 7 :  rst += arr[7]; break;
            }
        System.out.print(rst);

        }
    }
}
