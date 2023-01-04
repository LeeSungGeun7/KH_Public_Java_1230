package 데이터타입변환;
// 타입변환이란 선언된 변수의 데이터 타입의 다른 타입으로 변경 하는 것
//묵시적 타입 변환 자동타입 변환 : 컴파일러 자동으로 해주며 유리한 방향으로 타입 변환이 일어 남.
// 명시적 타입 변환 : 개발자가 의도적으로 형을 변경하는 것
// 메서드를 사용하는 형 변환 : 문자열을 숫자타입으로 변경이 필요한 경우
// Integer.parseInt(): 문자열을 정수로 변환
public class ConvType {
    public static void main(String[] args) {
        int num1 =1 , num2 =4 ;
        double rst1 = (double)num1 / num2;
        double rst2 = 100 + 100.1;
        String phoneNumber ="01032183238";
        int number = Integer.parseInt(phoneNumber);
        System.out.println(number);


        String Temp = "35.5";
        double numberTmp = Double.parseDouble(Temp);
        System.out.println(Temp);





    }




}
