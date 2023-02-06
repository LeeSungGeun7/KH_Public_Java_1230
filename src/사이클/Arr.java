package 사이클;
import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;
// 원래 자리로 돌아오는 횟수 구하기
// 28 값을 입력받으면 새로운 68 (2+6 = 8(sumNum) =>
// 입력 받은 수의 일의 자리와 합으로 만들어진 수의 일의 자리로 새로운수 만들기
// 요기까지가 1사이클
// 6+8 14 => 84
// 2 사이클
// 8+4 12 => 42
// 3 사이클
// 4+2 6 => 26
// 4 사이클
public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int input = sc.nextInt();
        int sumNum = 0 ; // 더하는 수
        int newNum = 0 ; // 새로 만들어진 수
        int cnt = 0 ;

        int num = input; // 입력값을 순회용 num 값을 대입함

        while(true){
            sumNum = (num / 10)+(num % 10); // 입력값으로 10의자리 + 1의 자리로 변환
            newNum = ((num % 10) * 10)+(sumNum % 10); // 입력값의 1의자리 + 계산된값의 1의자리를 더함
            cnt++; // 사이클 횟수를 누적
            if(input == newNum) break; // 입력값과 새로운수가 동일한지 확인
            num = newNum; // 새로운 숫자를 순회용 num 에 대입


        }
        System.out.println(cnt);

    }
}
