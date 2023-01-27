package 배수찾기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 첫번째 배수에 대한 기본을 입력
// 연속으로 값 입력 받기 (ArrayList 입력 받은 값을 저장)
// 0 이면 종료
// 입력 받기를 종료 한 이후 List 내에 있는 값이 주어진 값의 배수인지 아닌지 확인해서 출력
// 예를 들어 주어진 값이 3이면
// 99 is a multiple of 3 ;
// 7 is Not a multiple of 3 ;
public class MultipleGetEx {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0 ;
        int fir = sc.nextInt(); // 주어진 기본값

        while(true){
            arr.add(i,sc.nextInt());
            if(arr.contains(0)) {
             arr.sort(Comparator.naturalOrder());
             System.out.print(arr.toString());
             break;
            }
            if(arr.get(i) % fir == 0) {
                System.out.println(arr.get(i) +" is a multiple of "+ fir);
            } else System.out.println(arr.get(i) +" is a not multiple of "+ fir);

            i++;
        }





    }
}
