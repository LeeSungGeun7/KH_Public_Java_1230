package 문자열자르기;

import java.util.Arrays;
import java.util.Scanner;

// 시간을 입력 받음 : 23:30:59
// 출력 : 오후 11시 30분 59초
public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] time = input.split(":");
        if (Integer.parseInt(time[0]) <= 11) {
                System.out.printf("오전 %02d시 %02d분 %02d초", Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2]));
            } else {
                System.out.printf("오후 %02d시 %02d분 %02d초", Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2]));
        }
    }
}
