package 쓰레드예제7;

import java.util.Scanner;

// 쓰레드의 안정한 종료(Stop 플래그 , interrupt())
public class ThreadEx7 {
    public static void main(String[] args) throws InterruptedException {
//        RunThread runThread = new RunThread();
//        runThread.start();
//        Thread.sleep(5000);
//        runThread.setStop(true);
//        Scanner sc = new Scanner(System.in);
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        Thread.sleep(5000);
        interruptThread.interrupt();

    }
}
