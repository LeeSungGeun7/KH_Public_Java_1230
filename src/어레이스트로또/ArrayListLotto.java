package 어레이스트로또;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
// ArrayList 활용해 중복제거
// Set
public class ArrayListLotto {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); // 어레이리스트는 배열과 다르게 크기를 지정할 필요없음
        while(true){
            int tmp = (int)(Math.random()* 45) +1 ;
            set.add(tmp);
            if(set.size() == 6) break;

        }
        System.out.println(set);













    }
}
