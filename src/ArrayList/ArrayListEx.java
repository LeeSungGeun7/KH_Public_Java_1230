package ArrayList;

import java.lang.reflect.Array;
import java.util.*;

// 특정위치에 삽입 : add()
public class ArrayListEx {
    public static void main(String[] args) {
//        List<String> pitches = new ArrayList<>();
//        pitches.add("178");
//        pitches.add("129");
//        pitches.add("142"); // 계속 뒤에 추가 됨
//        pitches.add(0,"150"); // 특정 위치에 값을 삽입
//        System.out.println(pitches);
//        System.out.println(pitches.get(1)); // 해당 인덱스의 값을 가져옴
//        System.out.println(pitches.size()); // List 내부에 있는 요소의 개수를 반환
//        System.out.println(pitches.contains("142")); // 해당 값이 내부에 있는지 확인 (있으면 true)
//        System.out.println(pitches.remove("142")); // 해당 값이 있으면 삭제하고 true 반환 없으면 false
//        System.out.println(pitches.remove(0)) ; // 해당 하는 인덱스의 값을 삭제하고 해당 값을 리턴
//        System.out.println(pitches);
        String[] data = {"138","129","142"};
        List<String> pitches = new ArrayList<>(Arrays.asList(data)); // 이미 만들어진 배열을 추가
        System.out.println(pitches);
    }
}
