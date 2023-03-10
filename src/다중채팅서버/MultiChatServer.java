package 다중채팅서버;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MultiChatServer {
    static List<Socket> list = new ArrayList<>();
    public static void main(String[] args) {
        int port = 8900;

        try{
            // 서버를 만들때는 두가지 정보가 필요함 : IP 와 port 번호
            ServerSocket serverSocket = new ServerSocket(port); // port 번호만 넣으면 자동으로 서버 IP는 지정됨 (첫번째 IP가 자동 등록)
            while(true) { // 서버는 반복문을 수행하면서 클라이언트의 요청을 받아줌
                //하나의 session ,  하나의 연결 통로를 생성 함 .
                Socket socket = serverSocket.accept();
                Thread serverTh = new MultiChatThread(socket);
                serverTh.start();
            }
        } catch (IOException e) {}
    }
}
