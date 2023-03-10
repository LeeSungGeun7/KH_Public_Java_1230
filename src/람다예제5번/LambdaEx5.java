package 람다예제5번;

import java.util.function.IntBinaryOperator;

// 메서드 참조 : 메소드를 참조해서 매개 변수의 정보 및 리턴타입을 알아내서 불필요한 매개변수를 제거하는 목적
class Calculator {
    public static int staticMethod(int x , int y ) {
        return x + y ;
    }
    public int instanceMethod(int x , int y ) {
        return x + y;
    }
}
// IntBinaryOperator : 두개의 int 타입에 대한 연산 인터페이스명
// applyAsInt : 두개의 int 연산 ( 추상 메서드 )
// 클래스::메소드
// 참조변수::메소드
public class LambdaEx5 {
    public static void main(String[] args) {
        IntBinaryOperator operator;
        // 정적메서드 참조
        operator = (x,y) -> Calculator.staticMethod(x,y);
        System.out.println("결과 1 : "+operator.applyAsInt(1,2));
        operator = Calculator::staticMethod;
        System.out.println("결과 2 : " + operator.applyAsInt(3,4));
        // 인스턴스 메서드
        Calculator cal = new Calculator();
        operator  = (x,y) ->cal.instanceMethod(x,y);
        System.out.println("결과 3 : " + operator.applyAsInt(5,6));
        operator = cal::instanceMethod;
        System.out.println("결과 4 : " + operator.applyAsInt(7,8));
    }
}
