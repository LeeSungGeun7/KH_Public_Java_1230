package 연산자기본;

import java.util.Scanner;

// 산술연산자 : + , * , - , / , % (나머지)
// 대입연산자 : 변수에 값을 대입할때 사용하는 이항 연산자 입니다. ( 오른쪽에서 왼쪽으로 진행)
// 증감연산자 : ++ , -- , 단항연산자 , 피연산자의 값을 1증가 또는 감소시킴
// 비교연산자 : 두개의 피연산자를 비교해서 참과 거짓을 판별 한다 .
// 논리연산자 :  AND (&&) 두개의 조건이 모두참이면 참
// OR || 두개의 조건 중 하나만 참이면 참 , NOT(!)현재의 조건을 부정
// 삼항연산자 : 항이 3개인 연산자 , 조건문의 일종이다. 참과 거짓만 있는 경우 사용가능
// 문자열 결합 연산자 : +
// 연산자 우선순위
public class OpperatorEx1 {
    public static void main(String[] args) {
        System.out.println("JAVA" + 11.04 + 12 );
        int val1 =5 , val2 =5, val3=5 ;
        int rst1 , rst2 ,rst3;
        rst1 = val1 + val2 * val3 ;
        rst2 = (val1 + val2) * val3;
        rst3 =  val1 +  ( ++val2) * val3 ;

        System.out.println(rst1 +"   "+ rst2 +"   " +rst3);


    }


}
