package 표준입출력;

public class StandardInout {
    public static void main(String[] args) {
        String name = "곰동이사육사";
        String addr = "경기도 수원시";
        char gender = '남';
        int age = 23;
        int kor = 99;
        int eng = 88;
        int mat = 55;
        // 자바 스타일 ( print () / println () 메소드 오버로딩 )

        System.out.println(name);
        System.out.println("이름: "+ name);
        System.out.println("주소 : "+ addr);
        System.out.println("성별:"+gender);
        System.out.println("나이:"+age);
        System.out.println("총점:"+    (kor+eng+mat));
        System.out.println("평균:"+ ((double)(mat + kor + eng)/3));

        // c언어 스타일 ( 서식 지정자와 이스케이프 시퀀스 사용 )
        // 서식지정자 : %d , %f , %2f, %2d , %s, %c , %b
        // 이스케이프 시퀀스 : \n, \r , \t , \b , \\
        System.out.printf("========c style ========\n"); // \n 줄바꿈
        System.out.printf("이름: %s\n ",  name);
        System.out.printf("주소 : %s\n" , addr );
        System.out.printf("이름: %s   주소 : %s\n" , name , addr );
        System.out.printf("성별: %c\n", gender); // %c 문자출력
        System.out.printf("나이: %d\n", age); //
        System.out.printf("총점: %05d\n" ,kor+eng+mat);
        System.out.printf("평균: %.2f\n" , (double)(kor+eng+mat)/3);
        System.out.printf("Apple,\t\t\t\nBanana\b\b\b");


        System.out.println("\"Enter\"키를 입력하시면 종료됩니다.");
        System.out.println("Hello\\Java");
        System.out.println("오늘의 습도는 25% 입니다.");








    }


}
