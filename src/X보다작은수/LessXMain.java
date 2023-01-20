package X보다작은수;

import java.util.Scanner;

// 첫째줄에 N과 X가 주어짐
// 둘째줄에 수열 A를 이루는 정수 N개가 주어진다
// 주어지는 정수는 모두 1보다 크거나 같고, 10000 보다 작거나 같은 정수이다.
// 10 5 => 배열의 갯수와 찾을 수를 연속해서 입력
// 1 10 4 9 2 3 8 5 7 6
// 결과 값 : 1 4 2 3
public class LessXMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 개수 입력 (1~10000) : ");
        int[] arr = new int[sc.nextInt()];
        System.out.print("찾을수 입력 (1~10000) : ");
        int min = sc.nextInt();
        if (arr.length >= 1 && arr.length <= 10000)
            if (min >= 1 && min <= 10000) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt(); //주어진 n 만큼의 수를 입력받음
                    if (arr[i] < min) {
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
