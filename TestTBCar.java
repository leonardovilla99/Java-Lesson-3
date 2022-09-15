public class TestTBCar {
    public static void main(String[] args) {
        TBCar tbc1 = new TBCar(2018, "Toyota");
        System.out.println("For " + tbc1.getMake() + " " + tbc1.getYearModel());
        for(int i=0; i<5; i++){
            tbc1.accelerate();
            System.out.println("Speed " + tbc1.getSpeed() + " mph");
        }
        for(int i=0; i<6; i++){
            tbc1.brake();
            System.out.println("Speed " + tbc1.getSpeed() + " mph");
        }
    }
}
