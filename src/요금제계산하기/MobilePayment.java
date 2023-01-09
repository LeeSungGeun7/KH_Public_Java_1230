package 요금제계산하기;
// 영식 요금제 : 30초마다 10원씩 청구 (30초 미만이면 1통 , 30초 부터 2통 ~~)
// 민식 요금제 : 60초마다 15원씩 청구 (60초 미만이면 1통 , 60초 부터 2통 ~~ )
// 통화횟수 : 3
// 통화시간 : 40 70 45
// 둘 중 싼 요금제 이름을 표시하고 총 요금 계산 ( 영식 요금제 : 총 통화 금액 )
// 총 통화 금액이 같으면 (영식/민식 요금제 ) : 총 통화 금액 )


import java.util.Scanner;

public class MobilePayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영식 통화횟수를 입력하세요 : ");
        int [] pay1 = new int [sc.nextInt()];
        System.out.print("민식 통화횟수를 입력하세요 : ");
        int [] pay2 = new int [sc.nextInt()];
        int count = 1 ;
        int count2 = 1 ;
        for(int i = 0 ; i < pay1.length ; i++){
            System.out.print(" 영식 통화시간을 입력하세요 : ");
            pay1[i] = sc.nextInt();
            if (pay1[i]/30 > 1  ){
                count += (int)pay1[i]/30 ;
            }else{
                count +=  1;
            }
        }
        for(int i = 0 ; i < pay2.length ; i++){
            System.out.print("민식 통화시간을 입력하세요 : ");
            pay2[i] = sc.nextInt();
            if (pay2[i]/60 > 1  ){
                count2 += (int)pay2[i]/60 ;
            }else{
                count += 1;
            }
        }

        System.out.println("영식 요금제의 총가격은  "+ count * 10 + " 입니다. ");
        System.out.println("민식 요금제의 총가격은  "+ count2 * 15 + " 입니다. ");
        if (count*10 < count2*15) {
            System.out.println("영식이의 값이 더저렴합니다. " );
        }
        else if (count*10 > count2*15){
            System.out.println("민식이의 값이 더저렴합니다. "  );
        }



















    }
}
