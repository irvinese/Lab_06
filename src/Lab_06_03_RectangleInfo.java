import java.util.Scanner;

public class Lab_06_03_RectangleInfo {
    public static void main(String [] args) {
        double length;
        double width = 0;
        double area;
        double perimeter;
        double diagonal;
        String trash;

        //area = length * breath
        //perimeter = 2 * length + 2 * breadth
        //diagonal = SquareRoot( length * length + breadth * breadth)

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle");

        System.out.println("enter the width of the rectangle");


        if(in.hasNext()){
            length = in.nextDouble();
            in.nextLine();

            if(in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();


                diagonal = Math.sqrt(length + length + width + width);

                area = length * width;

                perimeter = (2 * length) + (2 * width);

                System.out.printf("The area of the rectangle %.2f", area);
                System.out.printf("          ");
                System.out.printf("The perimeter of the rectangle %.2f", perimeter);
                System.out.printf("           ");
                System.out.printf("The diagonal of the rectangle %.2f", diagonal);

            } else{
                trash = in.nextLine();
                System.out.println("You entered an invalid width value" + trash);
            }






        } else{
            trash = in.nextLine();
            System.out.println("You entered an unvalid value: " + trash);
        }
    }
}
