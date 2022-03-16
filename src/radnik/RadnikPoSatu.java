package radnik;

public class RadnikPoSatu extends Radnik{

    protected double hoursWorked;
    protected String timeUnitHourly= "hours";


    public RadnikPoSatu(String firstName, String lastName, String socialNumber, String accNumber, double hoursWorked) {
        super(firstName, lastName, socialNumber, accNumber);
        this.hoursWorked = hoursWorked;
    }

    public RadnikPoSatu(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public RadnikPoSatu() {
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void isplatiPlatu() {

        double totalPay = hoursWorked * payPerHour;
        System.out.println("\nWorker: " + firstName + " " + lastName + "\nSSN: " + socialNumber + "\nHas worked " + hoursWorked + " " + timeUnitHourly + " this month" + "\nHis total pay is: " + totalPay + moneyUnit + "\nand it should be payed on the following account: " + accNumber + "\n");

    }
}
