package 문자열추가;
// 2개의 문자열을 입력받고 , 정수 N 값을 입력받음
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// ulkorea 첫번째문자열 뒷부분 n개 문자를 두번째 문자열 앞에 붙인다

import java.util.Scanner;

public class StringAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int num = sc.nextInt();
        // 0 1 2 3 4 5 = str.length - num = 2 = 4
        System.out.println(str1.substring(str1.length()-num)+str2);
    }
}
