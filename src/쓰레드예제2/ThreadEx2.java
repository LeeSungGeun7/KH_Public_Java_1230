package 쓰레드예제2;
//쓰레드 생성 방법 :
// 1.Thread 클래스를 상속 받는 방법 (구현이 쉬움, 쓰레드를 상속 받았기 때문 다른 클래스 상속 불가)
// 2.Runnable 인터페이스 구현하는 방법 (확장성이 좋음, 다른 클래스로 부터 상속을 받을 수 있음)
// 3.Runnable 인터페이스를 이용한 익명의 객체로 구현
// 4.Runnable 인터페이스를 이용한 람다식으로 구현

import static java.lang.Thread.sleep;

public class ThreadEx2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = new Sample();
        Thread thread = new Thread(task); //실제 쓰레드가 생성 됨
        Thread thread2 = new Thread(task);
        thread.setPriority(10); // 1~10 사이의 값으로 우선순위를 줄수 있습니다. 10이 가장높음(자주 수행될 확률이 높아짐)
        thread.start(); // start() 메서드 호출 시 자신의 run() 메서드를 실행합니다.
        thread2.start();

        Runnable task2 = new Thread(task) {
            public void run() {
                int sum = 0 ;
                for(int i = 0 ; i<10; i++){
                    sum += i ;
                    System.out.println(""+Thread.currentThread()+sum);
                }
                System.out.println(Thread.currentThread() + "합계"+sum);
            }

        };
        Thread thread3 = new Thread(task); //실제 쓰레드가 생성 됨
        thread3.start();
        for(int i = 0 ; i < 100 ; i++){
            sleep(1);
            System.out.println("$$$$$$$여기는 메인입니다.");
        }

    }
}
class Basic { }

class Sample extends Basic implements Runnable {

    @Override
    public void run() {
        int sum = 0 ;
        for(int i = 0 ; i< 100; i++){
            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sum += i;
            System.out.println(""+Thread.currentThread() + sum);
        }
        System.out.println(Thread.currentThread() + "합계"+sum);
    }
}