package 반복문기본;

import java.util.Scanner;

public class WhileBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 :");
        long number = sc.nextLong();

        long sum = 0 ;

        for(int i = 1; i <= number; i++){
            sum += i ;

        }
        System.out.println("입력받은 정수의 합은 : " +sum + "입니다.");









    }
}
