package 쓰레드예제3;
// Sleep() : 실행중인 쓰레드를 일정 시간동안 멈추고 싶을때 사용한다 .
// 매개변수로 전달되는 시간은 mille Second 단위 입니다. ( 1/1000 초)
// 전달된 시간이 경과되면 다시 실행 대기상태로 돌아갑니다

import java.awt.*;

public class ThreadEx3 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0 ; i<20; i++){
            toolkit.beep();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
        }
    }
}
