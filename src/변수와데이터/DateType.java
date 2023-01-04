package 변수와데이터;

// 클래스 이름은 파일이름과 동일해야함
// 실수는 소수점이며 값이 존재하고 기본은 double형 (8Byte)이 기본


public class DateType {
    //접근제한자 , 정적변수 , 반환타입 , main()
    public static void main(String[] args) {

       int num1 = 0  , num2  = 1 ; // 같은 타입의 변수 콤마 (,)로 구분해서 동시에 선언가능
       double num3= 3.14; // 선언과 동시에 초기화
        int hour = 3 ;
        int minute = 55;
//        String name = "곰돌이사육사";
//        System.out.println(hour + "시"+ minute + "분");
//        System.out.println(name);

        NameCard ns = new NameCard();
        ns.name = "곰돌이사육사";
        ns.age= 24;
        System.out.println(ns.name);
        System.out.println(ns.age);

       }

}
// 사용자 정의 자료형
class NameCard {
    String name;
    int age;
    String addr;
    String eMail;
    String phoneNumber;





}
