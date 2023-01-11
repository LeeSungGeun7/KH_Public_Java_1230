package final메소드;
// final 키워드 최종상태라는 의미가 있음
// final 키워드를 클래스 , 필드 , 메소드 선언시 사용가능

public class FinalMethod {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Ferrari");
        ElectricCar electricCar = new ElectricCar("EV6");

        sportsCar.setTurbo(true);
        sportsCar.infoCar();
        sportsCar.accelerator();
        sportsCar.breakPanel();

        electricCar.setAutoDrv(true);
        electricCar.infoCar();



    }
}
