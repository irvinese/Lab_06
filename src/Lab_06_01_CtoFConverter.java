import java.util.Scanner;

public class Lab_06_01_CtoFConverter {
    public static void main(String [] args) {
        double c;
        double f;
        String trash;

        //Celcius = (c * 9/5) +32= f

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the degrees in c");

        if(in.hasNext()){
            c = in.nextDouble();
            in.nextLine();

            System.out.println("enter the temperature");

            f = ((c * 9/5) + 32);

            System.out.printf("the degrees in the room %.2f", f);
        } else{
            trash = in.nextLine();
            System.out.println("You entered an invalid tempurature" + trash);
        }
        System.exit(0);

        }




    }
