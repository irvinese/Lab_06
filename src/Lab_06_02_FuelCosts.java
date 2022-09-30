import java.util.Scanner;

public class Lab_06_02_FuelCosts {
    public static void main(String [] args){
        double gallon;
        double milesPerGallon;
        double price;
        String trash;

        //milesPerGallon = 25.7 * gallon
        //price = 3.684 * gallon

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount of gallons obtained:");


        if(in.hasNext()) {
            gallon = in.nextDouble();
            in.nextLine();

            System.out.println("Enter the amount of gallons obtained:");

            milesPerGallon = (25.7 * gallon);
            price = (3.684 * gallon);

            System.out.printf("The miles per gallon %.2f", milesPerGallon);
            System.out.printf("     ");
            System.out.printf("The price for your gas %.2f", price);
        }else{
                trash = in.nextLine();
                System.out.println("You entered an invalid width value" + trash);}
        System.exit(0);



    }
}
