package 접근제한자;

// 접근제한자란 객체 지향 4가지 특징중에 하나이며 , 데이터 은닉 또는 캡슐화의 핵심 개념입니다.
// 데이터 은닉이란 사용자가 알 필요가 없거나 숨겨야 할 정보를 보이지 않도록 하는 개념입니다.
// 대형 프로젝트 진행중 필드 값을 외부에 접근 가능 한 경우 여러가지 문제점이 발생 할수 있습니다.
public class RestrictedEx {
    public static void main(String[] args) {
        ChildRest childRest = new ChildRest();
        childRest.getMoney();
        System.out.println(childRest.jobs);
        System.out.println(childRest.name);


    }
}
class ChildRest extends ParentRest {
    String jobs ;

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }
    public String getMoney(){ // protected 대한 접근 (동일 패키지와 상속과 성립하면 접근허용)
        return money;
    }
    public String getName(){  // 디폴트에 대한 접근 (동일 패키지만 접근 허용)
        return name;
    }
    public String getAddr(){ // private 에 대한 접근
        return addr;
    }

}