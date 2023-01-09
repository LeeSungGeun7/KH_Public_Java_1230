package 간판만들기;

import java.util.Scanner;

// 임의의 숫자를 입력 받음 : 120
// 120에 대한 차지하는 공간을 계산
// 0은 4칸 , 1은 2칸 그외의 숫자는 3칸
// 120 => 1 + 2 + 1 +3 + 1 + 4 + 1
// 5611 => 1 + 3 + 1 + 3 + 1 + 2 + 1 + 2 + 1 => 15
// 0 입력되기 전까지는 반복 수행해야함
public class SignBoardMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int sum = 0 ;

        for (int i = 0; i < num.length(); i++) {
//            for(int j = 0 ; j < num.length(); j++){
                sum += num.charAt(i) ;





            if (num.charAt(i) == 0){
                break;
            }

        }


    }
}