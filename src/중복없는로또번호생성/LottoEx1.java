package 중복없는로또번호생성;


import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


// 1. 6개의 로또 번호 생성해서 출력하기 배열사용
// 2. 중복 없는 로또 번호생성 후 출력 하기
// 3. ArrayList 사용해서 출력 (중복 없음)
// 4. Set 을 이용해서 로또번호 출력  (중복 없음 )
public class LottoEx1 {
    public static void main(String[] args) {
        // 6개의 배열 생성
        // 반복문을 순회 하면서 랜덤함수를 이용해 배열에 로또번호 추가
        // 마지막에 배열에 포함된 로또 번호 출력
        List<Integer> lotto = new Vector<>();
//        int[] lotto = new int[6];

       boolean isExist = false; //로또 배열에 지금 생성한 값과 동일한 값이 있는지 확인
        int tmp, index = 0;

//      int num1  = (int)((Math.random()* 45) + 1 );

        while (true) {
            tmp = (int) ((Math.random() * 45) + 1);
            if(!lotto.contains(tmp)){
             lotto.add(tmp);
            }
            if (lotto.size() == 6) break;
        }
        System.out.println(lotto);
    }
}

