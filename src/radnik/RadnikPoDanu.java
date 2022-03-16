package radnik;

public class RadnikPoDanu extends Radnik{

    protected int daysWorked;
    protected String timeUnitDaily= "days";

    public RadnikPoDanu(String firstName, String lastName, String socialNumber, String accNumber, int daysWorked) {
        super(firstName, lastName, socialNumber, accNumber);
        this.daysWorked = daysWorked;
    }

    public RadnikPoDanu(int daysWorked) {
        this.daysWorked = daysWorked;
    }



    public RadnikPoDanu() {
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    @Override
    public void isplatiPlatu() {
        double totalPay = daysWorked * payPerDay;
        System.out.println("\nWorker: " + firstName + " " + lastName + "\nSSN: " + socialNumber + "\nHas worked " + daysWorked + " " +  timeUnitDaily + " this month" + "\nHis total pay is: " + totalPay + moneyUnit + "\nand it should be payed on the following account: " + accNumber + "\n");

    }
}
