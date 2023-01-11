// 인간 클래스를 만들기
// age (정수값 : 나이) : 필드와 세터/게터
// sleep (정수값 : 시간) : 필드와 세터/게터
// 인간의 특성을 상속받아 직장인 만들기
// - worker (정수값 : 일한 시간) : 필드와 세터/게터
// 인간의 특성을 상속받아 학생 만들기
// - 공부한다 (열심히/적당히/놀면서/) : 필드와 세터/게터
package Person상속;


public class Person {
    private int age;
    private int sleep;

    void setAge(int age) {
        this.age = age;
    }
    int getAge(){
        return age;
    }
    int getSleep(){
        return sleep;
    }
    void setSleep(int time){
        sleep = time;
    }
   final void viewAge(){
        System.out.println("나이:"+age);
    }
   final void viewSleep(){
        System.out.println("잠자는 시간:"+sleep);
    }


}
class Worker extends Person {
    private int workT ;
    void setWorkT(int workT){
        this.workT = workT;
    }
    void viewWorkT(){
        System.out.println("일하는 시간:"+ workT);
    }
    int getWorkT(){
        return workT;
    }

}


class Student extends Person {
    int style;
    void setStyle(int style){
        this.style = style;
    }
    String getStyle(){
        String[] studyStr = {"","\"열심히\"","\"적당히\"","\"놀면서\""};
        return studyStr[style];
    }
    void study(){
        System.out.println(style + "공부한다.");
    }



}

// 문제해결 시나리오
// 1.while 문에 대해서 묻는 문제 : 반복문을 진입하는 조건을 묻는 문제
// 2.문자열비교
// 3. 반복문(while)과 조건문(if)을 이용해서 일정 범위 내에 있는 5의배수를 구하는 문제인데 > for문과 switch case 문제로 변경
// 4. 배열의 인덱스 접근시 ArrayIndexOutofBoundException ? 왜 발생하는지 확인하고 코드수정

// 서술형
//1. 변수생성 규칙
//2. 변수에 대한 데이터 타입을 묻는문제
//3. 변수란 ?
//4. 기본자료형? 참조자료형?
//5. 상수란?
//6. 문자열 담기?
//7. 자동형변환(묵시적 형변환)=> 컴파일러가 자동으로 유리한 방향으로 형변환
//8. 단항연산자 종류 : ! , ++ , --,-(음수표현)
//9. 다항연산자 종류 :
//10. 삼항연산자 종류
//11. 산술연산자 ?
//12. ++,--
//13. && , ||
//14. 전위연산자 , 후위연산자 설명
//15. 연산자 우선순위가 높은 순서 대로 기술 [산술연산자,삼항연산자,논리연산자,최우선연산자,대입연산자]
//16. 스위치문에 조건식으로 올수있는것 (정수,문자열,문자)
//17. 구구단 출력에 관한 코드