package 집합;

import java.util.Arrays;
import java.util.HashSet;

// 합집합 : 어느 한쪽에만 값이 존재해도 결과 반영 됨 (중복 값은 제거)
// 교집합 : 양족에 모두 존재해야 결과에 반영 됨
// 차집합 : 앞에 집합에서 뒤에 집합에 뺀 것
public class Union {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        //s1.addAll(s2); // 합집합을 수행
        //s1.retainAll(s2); // 교집합
        s1.removeAll(s2); //차집합
        System.out.println(s1);
    }
}
