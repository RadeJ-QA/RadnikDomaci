package radnik;

public class RadnikFiksno extends Radnik{


    public RadnikFiksno(String firstName, String lastName, String socialNumber, String accNumber) {
        super(firstName, lastName, socialNumber, accNumber);
    }

    public RadnikFiksno() {
    }

    @Override
    public void isplatiPlatu() {

        System.out.println("\nWorker: " + firstName + " " + lastName + "\nSSN: " + socialNumber + "\nHas worked this whole month" + "\nHis total pay is: " + payPerMonth + moneyUnit + "\nand it should be payed on the following account: " + accNumber + "\n");

    }
}
