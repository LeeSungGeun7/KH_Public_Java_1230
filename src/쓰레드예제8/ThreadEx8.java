package 쓰레드예제8;

public class ThreadEx8 {
    public static void main(String[] args) {
        SharedThread sharedThread = new SharedThread();

        Thread thread = new Thread() {
            @Override
            public void run(){
                sharedThread.setValue(30);
            }
        };
        thread.setName("쓰레드0");
        thread.start();



        Thread thread1 = new Thread(() ->{
            sharedThread.setValue(100);
        });
        Thread thread2 = new Thread(()-> {
            sharedThread.setValue(10);
        });
        thread1.setName("쓰레드 1");
        thread2.setName("쓰레드 2");
        thread1.start();
        thread2.start();
    }
}
class SharedThread {
    private int value = 0 ;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName()+"의 Value 값은"+ this.value+"입니다.");

    }
}