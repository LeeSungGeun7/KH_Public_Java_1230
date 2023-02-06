package 피타고라스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int num = sc.nextInt();
        int[] arr2 = new int[num];
        for(int i = 1; i<=num;i++){
            arr.add(i);
        }
        System.out.print(arr);
        Arrays.asList(arr,arr2);
    }
}
