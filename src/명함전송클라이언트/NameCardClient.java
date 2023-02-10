package 명함전송클라이언트;
import 명함전송서버.NameCardServer;
import 명함전송서버.NameCard;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class NameCardClient {
    public static  void main(String[] args) {
            try {
                Socket socket = new Socket("localhost", 5433);
                InputStream inputStream = socket.getInputStream();
                ObjectInputStream ois = new ObjectInputStream(inputStream);
                ArrayList<NameCard> nameCards = (ArrayList<NameCard>) ois.readObject();
                viewNameCards(nameCards);


                ois.close();
                socket.close();
            } catch (ConnectException e) {
                System.out.println("연결실패 !!!!!");
            } catch (Exception e ) {
                e.printStackTrace();
            }
        }
        static void viewNameCards(List<NameCard> nameCards){
            for(NameCard e : nameCards) {
                System.out.println("이름 : " + e.getName());
                System.out.println("핸드폰 : " + e.getPhoneNum());
                System.out.println("이메일 : " + e.getEmail());
                System.out.println("전화번호 : " + e.getPhoneNum());
            }
        }
    }


