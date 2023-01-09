package TV만들기;

public class TvClass {
    private boolean isOn; // 티비의 전원에 대한 상태 값 저장 접근제한자를 설정(캡슐화)
    private int channel ; // 티비의 채널 상태값 저장
    private int volume ; // 티비의 볼륨 상태값 저장
    TvClass(){ // 매개변수가 없는 생성자
        isOn = false;
        channel = 10;
        volume = 10;
    }
    TvClass(boolean isOn, int cnl , int vol){
        this.isOn = isOn;
        channel = cnl ;
        volume = vol;
    }
    // 외부에서 전원값을 변경 할수 있도록 제공되는 메소드 (리모콘과 비슷한 역할)
    void setON(boolean isOn){
        this.isOn = isOn; //매개변수로 전달 받은 값을 인스턴스 필드에 저장
        String onOffStr = (isOn) ? "ON" : "OFF";
        System.out.println("Tv 가 : " + onOffStr + "되었습니다.");
    }
    void setChannel(int cnl) {
        if (cnl >= 0 && cnl <= 999) { // 해당 필드에 허용되지 않는 값이 들어오지않도록 조건을 정함
            channel = cnl;
            System.out.println("채널을" + channel + "로 변경하였습니다.");
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을" + volume + "변경 하였습니다.");
        } else {
            System.out.println("볼륨설정 범위가 아닙니다.");
        }
    }

    void getTv() {
        String onOffStr = (isOn) ? "ON" : "OFF";
        System.out.println("==== TV 정보 ====");
        System.out.println("전원 : " + onOffStr);
        System.out.println("볼륨: " + volume);
    }

}
