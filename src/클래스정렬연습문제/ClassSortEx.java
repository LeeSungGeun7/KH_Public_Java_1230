package 클래스정렬연습문제;

import 클래스정렬2.Fruit;

import java.util.*;

// 문제 : 첫 번째 줄에 학생의 수 N 입력
//       두번째 줄부터 학생의 이름과 성적을 공백 기준으로 입력
// 2
// 안유진 95
// 정국 88
// 유나 77
// 출력 조건은 : 모든 학생의 이름을 성적이 낮은 순서대로 출력 하기
public class ClassSortEx  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("학생의수 입력 : ");
        int N = sc.nextInt();
        HashMap<String,Student> hs = new HashMap<>(N);


        for(int i = 0 ; i< N ; i++){
            System.out.print("이름과 성적을 입력하세요");
            hs.put(sc.next(),new Student(sc.nextInt()));
        }
        for(int i = 0 ; i< N ; i++){
            System.out.println(hs.keySet().iterator().next());

        }



    }


    }
    class Student  {

        String name;
        int score;

        public Student(int score) {

            this.score = score;
        }
    }
    class Sort implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
                if(o1.score==o2.score){
                    return o1.name.compareTo(o2.name); //성적이 같은 경우 이름을 사전순 정렬
                } return o1.score-o2.score;
        }
    }
