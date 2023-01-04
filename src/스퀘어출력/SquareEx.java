package 스퀘어출력;
// 양의 정수 n을 입력 받아 n* n 크기의 행렬을 출력 하는 프로그램
// 행렬의 값은 1부터 시작
// n을 3로 입력하면 1
// 1 2 3
// 4 5 6
// 7 8 9


import java.util.Scanner;

public class SquareEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1 ; i <= n*n ; i++ ){
            System.out.printf("%2d " ,i);
           if (i % n == 0) {
               System.out.println();
           }
        }





    }






}
