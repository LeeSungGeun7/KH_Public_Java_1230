package 영화표예매;

import java.util.Scanner;

// 영화표 예매 관련 클래스를 만들고 객체를 생성
// 영화표 좌석정보 표시를 위해 배열생성
// 예매하기와 종료하기 메뉴를 만들기
// 극장의 좌석은 10개로 제한
// 각 좌석당 판매 가격은 12000원
// 종료하기를 누르면 현재까지 판매된 좌석의 총 금액을 구함
public class MovieTicket {
    public static void main(String[] args) {
        MovieSell movieSell = new MovieSell();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("[1]예매하기");
            System.out.println("[2]종료하기");
            int selMenu = sc.nextInt();
            if(selMenu == 1 ) movieSell.selectseat();
            else{
//                System.out.println("총 판매 금액: "+movieSell.totalAmount());
                break;
            }

        }






    }
}
