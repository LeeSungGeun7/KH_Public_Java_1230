package 예외처리2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// FileNotFoundException
// NullPointException : 내가 참조하고 있는 객체가 없는경우

public class ExceptionEx2 {
    public static void main(String[] args)  {
//            try {
//                BufferedReader br = new BufferedReader(new FileReader("../database.properties"));
//                br.readLine();
//                br.close();
//            } catch (IOException e) {
//                System.out.println("파일을 찾을수없습니다");
//            }
//            System.out.println("시스템을 정상적으로 종료 합니다. ");
        //Test test = new Test();
        Test test = null; // 참조변수에 참조하는 객체가 없음을 의미 함
        String str = test.name;
        System.out.println(str);

    }
}
class Test {
    String name = "테스트";

}