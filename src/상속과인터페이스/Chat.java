package 상속과인터페이스;

public abstract class Chat {
    Chat(){}
    public void sendMsg(){
        System.out.println("메세지를 보냅니다.");
    }
    public void rcvMsg(){
        System.out.println("메세지를 받습니다.");
    }
    String testName(){

        return null;
    }
}
