package 코코아톡;
// 인터페이스의 메소드는 자동으로 public abstract 로 만들어 집니다.

import 네트워크인터페이스.NetworkAdapter;

public interface NetAdapter {
    void connect();
    void send(String msg);

}
class WiFi implements NetAdapter {

    @Override
    public void connect() {}

    @Override
    public void send(String msg){
        System.out.println("wifi >>" + msg);
    }
}
class FiveG implements NetAdapter{


    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("5G >>" + msg);
    }
}