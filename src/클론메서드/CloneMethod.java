package 클론메서드;
// clone() : 해당 객체(인스턴스)를 복제해 새로운 인스턴스를 생성
// 얕은 복사와 깊은 복사 개념이 필요
// 얕은 복사로 인해 주소가 복사되어 의도하지 않은 동작이 일어나는 문제를 해결하기 위해서 깊은 복사를 수행 함
public class CloneMethod {
    public static void main(String[] args) {
        Member member1 = new Member("hunter","곰","4323",30,true);
        Member member2 = member1.getMember();

        member2.age = 300;
        member2.name = "멍멍이";
//        System.out.println("age : "+member1.age);
//        System.out.println("name : "+member1.name);
//        System.out.println("age : "+member2.age);
//        System.out.println("name : "+member2.name);
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
}
