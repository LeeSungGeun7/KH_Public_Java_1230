package 박싱과언박싱;
// 프로그램의 동작에 있어 기본타입의 데이터를 객체로 취급 해야하는 경우가 있음 (일반화 프로그램)
// Wrapper 클래스는 8개의 기본 타입에 대해 객체 타입으로 포장해주는 클래스를 Wrapper 클래스라고함
// Boxing : 기본타입을 자동으로 Wrapper 클래스타입으로 변환해주는 것을 의미
// UnBoxing : Wrapper 클래스타입을 기본타입으로 변환
public class BoxingEx {
    public static void main(String[] args) {
        Integer num1 = new Integer(17) ; // 기본적인 정수형에 대한 Wrapper 클래스 타입
        Integer num = 17 ; // 자바 1.5 이후에 변경된 사항
        //int n = num.intValue(); // 언박싱
        int n = num;
        Character ch = 'x' ;
        Character ch2 = new Character('X');


    }
}
