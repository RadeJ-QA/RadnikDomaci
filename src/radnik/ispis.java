package radnik;

import java.util.Scanner;

public class ispis {

    public static void main(String[] args) throws InterruptedException {

        RadnikFiksno worker1 = new RadnikFiksno("Chuck", "Noris", "10101971223311" , "1604578921365478" );
        Radnik worker2 = new RadnikPoSatu("Pera", "Peric", "230165986214", "1579864000032145", 23.5);
        Radnik worker3 = new RadnikPoDanu("Jane", "Doe", "110100333222", "12063214000879", 15);

        worker1.isplatiPlatu();
        worker2.isplatiPlatu();
        worker3.isplatiPlatu();


//        RadnikPoSatu hourlyPayedEmployee = new RadnikPoSatu();
//        RadnikPoDanu dailyPayedEmployee = new RadnikPoDanu();
//        Radnik fixedPayedEmployee = new RadnikFiksno();
//
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please select the Employee type: \n a - for employee payed per hour \n b - for employee payed per day \n c - for employee payed per month");
//        char operator = input.next().charAt(0);
//
//        switch (operator) {
//            case 'a': {
//                System.out.println("Please enter Employee First Name: ");
//                hourlyPayedEmployee.setFirstName(input.nextLine());
//                System.out.println("Please enter Employee Last Name: ");
//                hourlyPayedEmployee.setLastName(input.nextLine());
//                System.out.println("Please enter Employee Social Security Number: ");
//                hourlyPayedEmployee.setSocialNumber(input.nextLine());
//                System.out.println("Please enter Employee account No: ");
//                hourlyPayedEmployee.setAccNumber(input.nextLine());
//                System.out.println("Please enter how many hours employee worked : ");
//                hourlyPayedEmployee.setHoursWorked(input.nextDouble());
//                hourlyPayedEmployee.isplatiPlatu();
//                break;
//            }
//
//            case 'b':
//                System.out.println("Please enter Employee First Name: ");
//                dailyPayedEmployee.setFirstName(input.nextLine());
//                System.out.println("Please enter Employee Last Name: ");
//                dailyPayedEmployee.setLastName(input.nextLine());
//                System.out.println("Please enter Employee Social Security Number: ");
//                dailyPayedEmployee.setSocialNumber(input.nextLine());
//                System.out.println("Please enter Employee account No: ");
//                dailyPayedEmployee.setAccNumber(input.nextLine());
//                System.out.println("Please enter how many days employee worked : ");
//                dailyPayedEmployee.setDaysWorked(input.nextInt());
//                dailyPayedEmployee.isplatiPlatu();
//                break;
//
//            case 'c':
//                System.out.println("Please enter Employee First Name: ");
//                fixedPayedEmployee.setFirstName(input.nextLine());
//                System.out.println("Please enter Employee Last Name: ");
//                fixedPayedEmployee.setLastName(input.nextLine());
//                System.out.println("Please enter Employee Social Security Number: ");
//                fixedPayedEmployee.setSocialNumber(input.nextLine());
//                System.out.println("Please enter Employee account No: ");
//                fixedPayedEmployee.setAccNumber(input.nextLine());
//                fixedPayedEmployee.isplatiPlatu();
//                break;
//
//            default:
//                System.out.println(operator + " is not valid employee type label");
//        }







    }
}
