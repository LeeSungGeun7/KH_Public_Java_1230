package 블랙잭;
// 5 21 => 카드 장수 , 주어진 값
// 5 6 7 8 9 => 3장의 카드를 골라서 주어진 값과 제일 가까운 값을 찾는것 (주어진 값을 넘어가면 안됨)
import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        System.out.print("카드숫자 : ");
        int num = sc.nextInt();
        System.out.print("주어진 값 : ");
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> sumArr = new ArrayList<>();

        // 012 013 014 015 021 023 024 025



        for(int i = 0 ; i<arr.length;i++) {
            for(int j = 1 ; j<arr.length; j++){
                for(int c = 2 ; c<arr.length; c++){
                    if(arr[i]+arr[j]+arr[c] <= num ){
                        sumArr.add(arr[i]+arr[j]+arr[c]);
                    }
                }
            }
          }

        System.out.println(sumArr);
        }

    }


