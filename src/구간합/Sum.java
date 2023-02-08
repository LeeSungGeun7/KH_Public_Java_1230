package 구간합;
//1 3
//2 4
//5 5
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("배열개수: ");
        int[] arr = new int[sc.nextInt()];
        System.out.print("테스트케이스 : ");
        int testCase = sc.nextInt();
        System.out.print("값 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        while (testCase != 0) {
            sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i = a - 1; i < b; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
            testCase--;
        }



    }

}
