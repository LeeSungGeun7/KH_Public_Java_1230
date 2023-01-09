package StringKMP;
// 입력 : Knuth-Morris-Pratt
// 출력 : KMP
// 입력 : Mirko - Slavko
// 출력 : MS

import java.util.Scanner;

public class StringKMP {
    public static void main(String[] args) {
        // 첫번째 방법 : split() 메소드를 이용하는 방법
        // 두번째 방법 : charAt() 메소드를 이용해 대문자만 추출하는 방법
        // 0번째 문자를 출력하고 , '-' 이 후 문자를 출력하는 방법
        // 네번째 방법 : 문자 배열로 변경 후 출력 하기

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        // 첫번째 방법 : split() 메소드를 이용하는 방법
        String[] a = str.split("-"); // - 기준으로 문자열을 작은 문자열로 만듬

//        for(int i= 0 ; i < a.length ; i++){
//
////          System.out.print(a[i].substring(0,1));
////        System.out.print(a[i].charAt(0)); // 해당 문자열의 0번 인덱스의 문자를 추출
//
//        }
        // 두번째 방법 : charAt() 메소드를 이용해 대문자만 추출하는 방법




        // 0번째 문자를 출력하고 , '-' 이 후 문자를 출력하는 방법
//        for(int i = 0 ; i < str.length() ; i++){
//            if(i == 0){
//                System.out.print(str.charAt(i));
//            }else{
//                if(str.charAt(i) == '-') System.out.print(str.charAt(i+1));
//            }
//        }

           // 네번째 방법 : 문자 배열로 변경 후 출력 하기
        char[] chName = str.toCharArray();
        for(char e : chName){
            if(e >= 'A' && e <= 'Z')System.out.print(e);
        }





    }
}
