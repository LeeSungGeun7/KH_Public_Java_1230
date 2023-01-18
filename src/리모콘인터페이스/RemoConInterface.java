package 리모콘인터페이스;

import java.util.Scanner;

public class RemoConInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("제품을 선택하세요. [1]TV [2]Audio");
        int sel = sc.nextInt();
        RemoteControl remoteCon;
        if (sel == 1) {
            remoteCon = new Television();
            remoteCon.turnOn();
            remoteCon.setVolume(20);
            remoteCon.getInfo();
            remoteCon.setMute(true);
            RemoteControl.changeBattery();
        } else {
            remoteCon = new Audio();
            remoteCon.turnOn();
            remoteCon.setVolume(120);
            remoteCon.getInfo();
        }
        RemoteControl rc = new RemoteControl() {
            int volume;

            @Override
            public void turnOn() {
                System.out.println("플레이 스테이션5 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("플레이 스테이션5 끕니다.");
            }

            @Override
            public void setVolume(int volume) {

                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 Audio 볼륨 : " + this.volume);
            }

            @Override
            public void getInfo() {

            }
        };
        rc.turnOn();
        rc.setVolume(100);
        rc.getInfo();
    }
}
