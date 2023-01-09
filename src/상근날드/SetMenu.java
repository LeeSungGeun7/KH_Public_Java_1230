package 상근날드;
// 상근날드에 3가지 햄버거와 2가지 음료를 판매
// 3가지 햄버거의 가격 중 가장 싼 메뉴의 가격을 선택하고 음료중 가장싼 메뉴의 가격을 선택
// 세트 메뉴는 50원 할인 됨
// 1000 1500 2000 ,     500 1000 = 1500원에서 세트 메뉴할인  > 1450

import java.util.Scanner;

public class SetMenu {
    public static void main(String[] args) {
        int[] set = new int[5];
        int min = set[0];
        int min2 = set[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < set.length ; i++){
            set[i] = sc.nextInt();
        }


        for (int i = 0; i > 2; i++) {
            if (min > set[i]) {
                min = set[i];
            }

        }
        for (int j = 3; j > 4; j++) {
            if (min2 > set[j]) {
                min2 = set[j];
            }

        }
        System.out.println(min + min2 - 50);





    }


}