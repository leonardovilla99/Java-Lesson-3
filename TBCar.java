/**
 * TBCar
 */
public class TBCar {

    private int yearModel;
    private int speed;
    private String make;

    public TBCar(int ym, String m){
        yearModel = ym;
        make = m;
        speed = 0;
    }

    // Method
    // Accessors
    public int getYearModel(){
        return yearModel;
    }
    public String getMake(){
        return make;
    }
    public int getSpeed(){
        return speed;
    }

    // Other
    public void accelerate(){
        speed += 5;
    }
    public void brake(){
        if(speed>=5){
            speed -= 5;
        }else{
            speed = 0;
        }
    }
}