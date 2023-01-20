package 바이올렛문제;
// 3개의 컬러를 입력 받음(문자열로 입력)
// 첫번째 컬러 : 10 의 자리수를 의미
// 두번째 컬러 : 1의 자리수를 의미'
// 세번째 컬러 : 곱을 의미
// black brown red orange yellow green blue violet grey white

import java.util.Scanner;

public class ResistanceMain {
    public static void main(String[] args) {
        // 컬러값에 대한 문자열 배열 선언
        String[] color = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        int fst=0,sec=0,trd=0;
        Scanner sc = new Scanner(System.in);
        String fstColor = sc.next();
        String secColor = sc.next();
        String trdColor = sc.next();
        for(int i=0; i < color.length ; i++){
            if(fstColor.equals(color[i])) fst = i;
            if(secColor.equals(color[i])) sec = i;
            if(trdColor.equals(color[i])) trd = i;
        }
        System.out.println((long)((fst*10)+sec)*(long)(Math.pow(10,trd)));
    }
}
