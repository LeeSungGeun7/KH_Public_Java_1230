package 문자열반전;

import java.util.Scanner;

//abcderfg => gfredcba
// 입력받은 문자열을 역순으로 출력하기
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char  ch ;

        for(int i = str.length()-1 ; i >= 0 ; i--)

            System.out.print(str.charAt(i));









    }
}
