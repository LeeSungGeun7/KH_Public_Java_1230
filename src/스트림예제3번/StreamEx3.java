package 스트림예제3번;

import java.util.ArrayList;
import java.util.List;

// 스트림을 중간 처리와 최종 연산 수향
public class StreamEx3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("우영우",99));
        list.add(new Student("최수연",96));
        list.add(new Student("권민우",92));
        double avg = list.stream()
                .mapToInt(Student::getScore) // 메서드 참조 문법이며 , 중간처리 연산
                .average() //최종연산
                .getAsDouble();
        System.out.println("평균 점수 : "+avg);
    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

