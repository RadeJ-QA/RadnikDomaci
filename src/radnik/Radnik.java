package radnik;

public abstract class Radnik {

    protected String firstName;
    protected String lastName;
    protected String socialNumber;
    protected String accNumber;
    public static double payPerHour = 20.50;
    public static double payPerDay = 202.75;
    public static double payPerMonth = 4555.25;
    public static String moneyUnit = "$";

    public Radnik(String firstName, String lastName, String socialNumber, String accNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialNumber = socialNumber;
        this.accNumber = accNumber;
    }

    public Radnik() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public abstract void isplatiPlatu();


}
