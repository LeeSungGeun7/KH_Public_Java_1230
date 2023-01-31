package 암호문자;

import java.util.Scanner;

public class Strrr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 : ");
        String str = sc.next();
        str.trim();
        System.out.print("암호문 : ");
        String str2 = sc.next();

        char[] ch = str.toCharArray();
        char[] ch2 = str2.toCharArray();
        int[] arr = new int[ch.length];

        for(int i = 0 ; i<ch2.length; i++){
            arr[i] = ch2[i] - 'a'-1;
        }
        for(int i = 0 ; i<ch.length; i++){
            if(ch[i]>'a'&&ch[i]<'z')
            ch[i] += arr[i];
            System.out.print(ch[i]);
        }


    }
}



