package 명함전송서버;
// 1. 명함 정보를 담을 클래스 생성
// 2. List 생성 후 10명에 대한 명함 정보 입력
// 3. 서버는 accept() 에서 클라이언트 연결을 기다리다가 연결 요청이 오면 연결을 수락하고
// 명함 전송 여부를 물어본 (전송 하시겠습니까 ? (Yes / No))
// 4. 클라이언트에서 명함을 수신하면 출력하기


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class NameCardServer {
    public static List<NameCard> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
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
                System.out.print("전송할 파일을 지정하세요: ");
                String originalFileName = sc.next();   // 파일경로/파일이름
                OutputStream is = new FileOutputStream(originalFileName);
                System.out.print("저장경로를 지정하세요: ");
                String filePath = sc.next(); //저장경로

                if (confirm.equalsIgnoreCase("yes")) {

                    ObjectOutputStream oos = new ObjectOutputStream(is);
                    oos.writeObject(originalFileName);
                    oos.flush();
                    oos.close();
                }

                // 직렬화 수행 (객체를 바이트 스트림으로 변환)



            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
