package 알람설정;
// 상근이라는 친구가 있는데 매일 학교를 지각을 합니다 .
// 지각하지않는 방법을 알려줍니다
// 알람을 설정하면 자동으로 설정 시간보다 45분 일찍 되도록 함
// 입력시간을 시간과분 으로 입력 받기
// 입력 받은 시간에서 45분 이전에 알람을 울리도록 설정

import java.util.Scanner;

public class AlarmSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int calc = (hour * 60) + min;

        if(calc < 45) {
            calc =(24* 60) + min;
        }
        calc -= 45;

        System.out.printf("%d시 %d분\n", (calc/60) , (calc % 60));



    }
}
