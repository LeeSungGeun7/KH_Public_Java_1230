package 에어컨만들기;

import java.util.Calendar;

//- 전원 ON/OFF 기능
//- 온도 설정 기능 (1도 단위 설정)
//- 현재 온도 표시 기능
//- 냉방기 ON/OFF 기능
//- 난방기 ON/OFF 기능
//- 바람세기 설정 (1단계 / 2단계 / 3단계)
public class AirCon {
    boolean isPower; // 전원 온오프
    int setTemp; // 온도 설정 필드
    int currTemp; // 현재 온도
    boolean isCooler; // 에어컨 온오프
    boolean isHeater; // 히터 온오프
    int windStep; // 1단,2단,3단
    AirCon(){
        final int[] monthTemp = {-5,3,8,15,20,26,32,30,24,16,8,4};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH); // month 는 현재 몇월인지 정보를 가져오는데 정보가 배열의 인덱스 같음
        currTemp = monthTemp[month];

    }



}
