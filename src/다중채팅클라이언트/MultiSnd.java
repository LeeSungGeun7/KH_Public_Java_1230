package 다중채팅클라이언트;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.Scanner;

public class MultiSnd extends Thread{
    private Socket socket = null;
    private String name = null;
    private Scanner sc = null;

    public MultiSnd(Socket socket,String name) throws IOException {
        sc = new Scanner(System.in);
        this.socket = socket;
        this.name = name;
    }
        @Override
        public void run(){
            try{
            while(true) {
                OutputStream os = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(os,true); // auto Flush 이므로 별도의 flush 동작 필요없음
                writer.println(name+":");
            }
            } catch (IOException e) {}
        }
    }

