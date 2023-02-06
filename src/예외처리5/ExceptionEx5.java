package 예외처리5;

import java.io.IOException;

// 예외처리 미루기 : 해당 메서드 안에서 예외처리에 대한 부분을 메서드 호출한 상위로 떠넘기는것
public class ExceptionEx5 {
    public static void main(String[] args) {
        IOSample ioSample = new IOSample();

        try {
            ioSample.input();
            ioSample.output();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class IOSample {
    private int num ;
    public void input() throws IOException {
        num = System.in.read();
    }
        public void output() {
            System.out.println(num);
        }
    }
