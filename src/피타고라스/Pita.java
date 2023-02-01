package 피타고라스;
// 문제 : N개의 숫자가 공백없이 쓰여 있슴 이 숫자를 모두 합해서 출력하는 문제
// 54321 => 15
// 5678 => 26
// 70000000=> 7
// 0000 => 종료

import java.util.Scanner;

public class Pita {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String a = sc.next();
       int sum = 0 ;
       char[] ch = a.toCharArray();
           for (int i = 0; i < ch.length; i++) {
               sum += ch[i] - 48;
           }
           System.out.println(sum);


    }
}
