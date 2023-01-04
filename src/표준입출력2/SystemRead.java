package 표준입출력2;

import java.io.IOException;

public class SystemRead {
    public static void main(String[] args) throws IOException {
        while(true){
            int keyCode = System.in.read();
            System.out.println("keycode : "+ keyCode);
            if(keyCode == 'q') break;


        }




    }

}
