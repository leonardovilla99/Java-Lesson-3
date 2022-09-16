public class Payroll {
    private String name;
    private int idNumber;
    private double rate;
    private int hours;

    // Constractor
    public Payroll(String n,int id){
        name = n;
        idNumber = id;
        rate = 0;
        hours = 0;
    }

    // Accessors
    public String getName(){
        return name;
    }
    public int getId(){
        return idNumber;
    }
    public double getRate(){
        return rate;
    }
    public int getHours(){
        return hours;
    }

    public String toString(){
        return name + ", employee number " + idNumber + ", made $" + grossPay() + " in gross pay.";
    }

    // Mutators
    public void setName(String n){
        name = n;
    }
    public void setId(int id){
        if(id>=0){
            idNumber = id; 
        }else{
            idNumber = 0;
        }
    }
    public void setRate(double r){
        if(r>=0){
            rate = r; 
        }else{
            rate = 0;
        }
    }
    public void setHours(int h){
        if(h>=0){
            hours = h; 
        }else{
            hours = 0;
        }
    }

    // Other
    public double grossPay(){
        return hours*rate;
    }
}
