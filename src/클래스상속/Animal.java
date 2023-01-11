package 클래스상속;

public class Animal {
    String name ;
    void setName(String name){
        this.name = name ;
    }






}
// Animal 로 부터 도그가 상속을 받아서 클래스 생성
class Dog extends Animal{
    void sleep(){
        System.out.println(name + "가 잠을 잡니다.");
    }
}
class HouseDog extends Dog{
    @Override
    void sleep(){ // 오버라이딩 관계가 만들어 짐
        System.out.println(name + "오랫동안 잠을 잡니다.");
    }
    void sleep(int kk){ // 오버로딩
        System.out.println(name +kk +"오랜동안 잠을 잡니다.");
    }


}
