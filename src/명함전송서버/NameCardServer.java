package 명함전송서버;
// 1. 명함 정보를 담을 클래스 생성
// 2. List 생성 후 10명에 대한 명함 정보 입력
// 3. 서버는 accept() 에서 클라이언트 연결을 기다리다가 연결 요청이 오면 연결을 수락하고
// 명함 전송 여부를 물어본 (전송 하시겠습니까 ? (Yes / No))
// 4. 클라이언트에서 명함을 수신하면 출력하기


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class NameCardServer {
    static List<NameCard> list = new ArrayList<>();

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        int port = 5433;
        Scanner sc = new Scanner(System.in);
        try {
            serverSocket = new ServerSocket(port);

            while (true) {
                System.out.println("연결 중..");
                Socket socket = serverSocket.accept(); // 클라이언트 연결 요청에 대한 대기
                System.out.println("[클라이언트 : ]" + socket.getRemoteSocketAddress());
                System.out.print("전송하시겠습니까? Yes or No");
                String confirm = sc.next();
                if (confirm.equalsIgnoreCase("yes")) {
                    OutputStream outputStream = socket.getOutputStream();
                    ObjectOutputStream oos = new ObjectOutputStream(outputStream);
                    oos.writeObject(writeNameCard());
                    oos.flush();
                    oos.close();
                }

                // 직렬화 수행 (객체를 바이트 스트림으로 변환)



            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static List<NameCard> writeNameCard() {
        list.add(new NameCard("", "010-5006-1234", "", ""));
        list.add(new NameCard("", "010-5006-1234", "", ""));
        list.add(new NameCard("", "010-5006-1234", "", ""));
        list.add(new NameCard("", "010-5006-1234", "", ""));
        list.add(new NameCard("", "010-5006-1234", "", ""));
        list.add(new NameCard("", "010-5006-1234", "", ""));
        return list;
    }

}
