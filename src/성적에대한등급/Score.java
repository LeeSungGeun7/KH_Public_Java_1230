package 성적에대한등급;

import java.util.Scanner;

// 주민등록번호를 입력 받아 성별과 생년월일 표시 하기, 만 나이를 표시 - 문자열 다루기 // 숙제
// 입력받은 성적이 0 ~ 100 사이가 아니면 " 성적을 잘못 입력 하였습니다. "
// 90이상이면 A ,  80 이상 이면 B , 70이상이면 C , 60 이상이면 D , 나머지는 F 로 출력
public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String birth = sc.next();
        String year = birth.substring(0,4);
        String month = birth.substring(4,6);
        String day = birth.substring(6,8);

        int year2 = Integer.parseInt(year);
        int realYear = 2023-year2-1;
        System.out.printf("%s년생 %s월 %s일 " , year,month,day);
        System.out.print(realYear+"세");


    }







}
