
package 스위치문;
import java.util.Scanner;
// 스위치문은 조건값에 따라 분기 할 수 있으며 , 조건 값은 정수 , 문자 , 문자열이 올수 있음


public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요 : ") ;
        String season = sc.next();

        switch(season) {
            case "spring" : // 해당 조건이 실행됨
                System.out.println("봄이 왔어요");
                break; // 해당 조건을 빠져나온다
            case "summer" :
                System.out.println("여름 ");
            case "fall" :
            case "autumn" :
                System.out.println("가을 ");
                break;
            case "winter" :
                System.out.println("겨울");
                break;
            default :
                System.out.println("X");

        }



    }





}
