package 암호체크;
//암호체크
// 암호의 길이는 10 ~ 30자 사이 (10 <= len <= 30)
// 암호에는 숫자, 소문자 , 대문자 , 특수문자가 포함되어야함
// 특수문자는 !,%,_,#,&,+,-,*,/ 9개 중의 하나
// 입력받은 패스워드가 조건을 만족하면 "good password" 만족하지 않으면 "bad password" 출력
// 반복문을 사용하고 사용자가 "종료" 또는 "exit"를 입력하면 프로그램 종료

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        PwdCheckClass pwdCheckClass = new PwdCheckClass();
        String pwd ; //암호를 입력 받기위한 변수
        while (true) {
            System.out.print("암호입력");
            pwd = sc.next();
            if (pwd.equals("종료") || (pwd.equalsIgnoreCase("exit"))) break;
            if (!pwdCheckClass.validLength(pwd)) {
                System.out.println("Bad length password");
                continue;
            }
            if (!pwdCheckClass.validNumber(pwd)) {
                System.out.println("Bad number password");
                continue;
            }
            if (!pwdCheckClass.validLowerAlphabet(pwd)) {
                System.out.println("Bad lower password");
                continue;
            }
            if (!pwdCheckClass.validUpperAlphabet(pwd)) {
                System.out.println("Bad upper password");
                continue;
            }
            if(!pwdCheckClass.validRex(pwd)){
                System.out.println("Bad");
                continue;
            }
            System.out.println("good"); break;
        }
    }
}
//     Scanner sc = new Scanner(System.in);
//     String str = sc.next();
//     int count = 0;
//     int count1 =0;
//     String[] strArr2 = {"!","#","%","&","/","+","*"};
//
//     String[] strArr = new String[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            strArr[i] = String.valueOf(str.charAt(i));
//        }
//
//     for(int i = 0 ; i < strArr2.length ; i++){
//         if(strArr[i].equals(strArr2[i])){
//             count1++;
//         }
//     }
//
//
//
//
//
//
//     while(true) {
//         if(str.length() >= 10 && 30 >= str.length()) {
//             for (int j = 0; j < str.length(); j++) {
//                 if (Integer.parseInt(strArr[j]) > 0) {
//                     count++;
//                 }
//             }
//
//            if(count > 0 && count1 > 0){
//                System.out.println("Good Password"); break;
//            } else System.out.println("Bad Password"); break;
//         }
//     }
//
//
//
//
//    }
//}

