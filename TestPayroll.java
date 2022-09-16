import java.util.Scanner;
public class TestPayroll {
    public static void main(String[] args) {
        String name;
        int id, hours;
        double rate;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter name: ");
            name = input.nextLine();
            System.out.println("Enter id number: ");
            id = input.nextInt();
            System.out.println("Enter rate: ");
            rate = input.nextDouble();
            System.out.println("Enter Hours: ");
            hours = input.nextInt();
            Payroll pay = new Payroll(name, id);
            pay.setHours(hours);
            pay.setRate(rate);
            System.out.println(pay);
        }
    }
}
