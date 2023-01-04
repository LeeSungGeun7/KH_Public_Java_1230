package 스위치예제2번;
// Switch 문으로 계산기 만들기
import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식을 입력하세요 : ");
        int x = sc.nextInt();//첫번째값
        char op = sc.next().charAt(0); //연산자
        int y = sc.nextInt(); // 두번째값



        switch(op) {
            case  '+' : System.out.print("SUM :" + (x + y));
            break;
            case  '-' : System.out.print("뺄셈 : " + (x - y));
            break;
            case '*' : System.out.print("곱셈 "+ (x * y));
            break;
            case '/' : System.out.print("나누기 : " + ((double)x/y));
            break;
            default:System.out.println("연산자를 잘못입력하였습니다.");




        }


    }
}
