package Vector클래스;

import java.util.ArrayList;
import java.util.List;

// ArrayList : 동적 배열(개수를 정할 필요가 없고 값이 추가 될때마다 사이즈가 커짐) 검색은 매우빠름
//             삽입과 삭제는 매우느림 O(n) , 동기화를 지원하지 않음(멀티 스레드 환경에서 지원하지않음) ,물리적으로 연속공간
// Vector : 동적 배열 , 물리적으로 연속된 공간 , 내부적으로 ArrayList 구조가 동일 , 동기화 지원 하지만 느림
// LinkedList : 물리적으로 연속되어 있지않음 , 양방향 링크드 리스트 , 검색은 느림 , 삽입과 삭제는 빠름
public class VectorEx {
    public static void main(String[] args) {
            List<NameCard> vector = new ArrayList<>();
            vector.add(new NameCard("우영우","yyy@naver.com","01030432403","변호사"));
            vector.add(new NameCard("동그라미","yy2y@naver.com","01050432403","무직"));
            vector.add(new NameCard("이준호","yyy1@naver.com","01030332403","변호사"));
            vector.add(new NameCard("박수연","yyy2@naver.com","01030232403","변호사"));

            for(NameCard e : vector){
                System.out.println("이름: " + e.name);
                System.out.println("메일: " + e.mail);
                System.out.println("전화번호: " + e.phone);
                System.out.println("직업: " + e.jobs);
            }
    }
}
class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone,String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}