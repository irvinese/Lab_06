import java.util.Scanner;

public class Lab_06_04_MetricConverter {
    public static void main(String [] args){

        double meters;
        double miles;
        double feet;
        double inches;
        String trash;

        //miles = .000621 * meters
        //feet = 3.28084 * meters
        //inches = 39.37 * meters

        Scanner in = new Scanner(System.in);

        System.out.println("enter your measurment in meters");

        if(in.hasNext()) {
            meters = in.nextDouble();
            in.nextLine();

            System.out.println("enter your measurment in meters");

            miles = (.000621 * meters);
            feet = (3.28084 * meters);
            inches = (39.37 * meters);

            System.out.printf("your meters in miles are %.2f", miles);
            System.out.printf("           ");
            System.out.printf("Your meters in feet are %.2f", feet);
            System.out.printf("            ");
            System.out.printf("Your meters in inches are %.2f", inches);

        }else{
                trash = in.nextLine();
                System.out.println("You entered an unvalid value: " + trash);
            }
            System.exit(0);



        }

    }
