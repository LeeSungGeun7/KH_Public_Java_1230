package 전자레인지;

import java.util.Scanner;

// 3개의 시간조절용 버튼 A , B , C 가 달려 있습니다.
// A 버튼은 5분 , B 버튼은 1분 , C 버튼은 10초단위로 시간을 설정 할수 있습니다.
// 예를 들어 요리시간 100초 소요된다면 B버튼 1회 , C버튼 4회 => T=014
// 3개의 버튼으로 시간을 맞출수 없는 경우 -1
public class MicrowaveEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int delay = sc.nextInt();

        int A = 300;
        int B = 60;
        int C = 10;


        if(delay % 10 !=0) System.out.println("-1");
        else {
           int a = delay/300;
           int b = delay % 300/60;
           int c = delay % 300 % 60 /10;
           System.out.printf("T=%d%d%d\n",a,b,c);
        }







    }
}
