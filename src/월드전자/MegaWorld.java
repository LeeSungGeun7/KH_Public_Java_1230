package 월드전자;


import java.util.Scanner;

public class MegaWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if( b >= c ){
            System.out.println("-1");
            return;
        }

        for(int i = 1 ; i<1000 ; i++){
           if (a+(b*i) < c*i) {
               System.out.println(i); break;
           }
        }

        System.out.println(a/(c-b)+1); // 손익분기점 식


    }
}
