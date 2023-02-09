package 입출력실습;
//파일을 만들어서 특정위치에 저장
//FileInputStream 을 이용해서 파일을 읽어들임
// 파일의 내용은 스캐너를 사용해서 읽어 들이고 , 문자열을 split(" ")으로 잘라서 문자열 배열에 저장
// 성적은 Integer.parseInt() 를 이용해 변환
// 여기서 필요한게 학생과 성적을 입력받을 클래스를 만들고 split() 생성된 문자열을 클래스부터 생성된 객체에 저장
import java.io.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Score {
    public static void main(String[] args) throws IOException {
        String str = "";
        TreeSet<Student> ts = new TreeSet<>();
        FileInputStream is = null;

        try {
            is = new FileInputStream("src/입출력실습/Score.txt");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        DataInputStream dis = new DataInputStream(is);
        Scanner sc = new Scanner(is);

        while(sc.hasNextLine()) {
            str = sc.nextLine();
    //      System.out.println(str);
            String[] strArr = str.split(" ");
            ts.add(new Student(strArr[0],
                    Integer.parseInt(strArr[1]),
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3])));
        }
        for(Student e : ts){
            System.out.println(e.getName() + " : " + e.getTotal());

        }
        is.close();
        }
}
class Student implements Comparable<Student> {
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public int getTotal() {
        return kor + eng + mat;
    }

    String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getTotal() == o.getTotal()) return (this.name.compareTo(o.name));
        else if (this.getTotal() > o.getTotal()) return 1 ;
        else return -1;
    }



}