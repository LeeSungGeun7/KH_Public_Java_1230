package 단일채팅클라이언트;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.rmi.UnexpectedException;

public class SingleChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket("192.168.10.245", 7676);
            System.out.println("서버와 연결되었습니다.");
        } catch (ConnectException e) {
            System.out.println("서버의 연결이 거절 되었습니다. 서버를 먼저 실행하세요");
        } catch (UnexpectedException e) {
            System.out.println("서버를 알 수 없습니다.");
        } catch(IOException e) {
            e.printStackTrace();
        }
        if(socket != null) {
            RcvThread rcvThread = new RcvThread(socket);
            rcvThread.start();
            SendThread sndThread = new SendThread(socket);
            sndThread.start();
        }
    }
}
