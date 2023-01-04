package 가장큰수출력;
// 세자리 정수를 입력받아 가장 큰 수  출력
//365 , a = 3 , b= 6 , c = 5


import java.util.Scanner;

public class MaxValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리 정수를 입력하세요 :  ");
        int number = sc.nextInt();
        int a , b, c ;
        a = number/100;
        b = (number % 100) / 10 ;
        c = number % 10;

        if (a>b && a>c) {
            System.out.println(Math.max(a,c));
        }
//         System.out.println(a+ " 첫째 자리수가 제일 큽니다.");
//        } else if (b>a && b>c)
//            System.out.println(b + " 둘째 자리수가 제일 큽니다");
//          else
//        System.out.println(c + " 셋째 자리수가 제일큼.");


    }




}
