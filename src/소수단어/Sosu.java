package 소수단어;

import java.util.Scanner;

public class Sosu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] ch = str.toCharArray();
        int[] sumArr = new int[ch.length];
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && 'z' >= ch[i]) {
                sumArr[i] = ch[i] - 'a' + 1;
            } else if (ch[i] >= 'A' && 'Z' >= ch[i]) {
                sumArr[i] = ch[i] - 'A' + 1;
            }
        }
        for (int e : sumArr) sum += e;
        System.out.println(sum);

        boolean prime;
        for (int i = 2; i < sum; i++) {  // 1과2제외
            if (sum % i == 0) {
                System.out.println("it is not a prime word.");
                prime = false;
                break;
            } else {
                prime = true;
            } if(i==sum-1 && prime==true) {
                System.out.println("it is a prime word");
            }


        }

    }
}

