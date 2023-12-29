import java.util.Scanner;
public class hypotenuseCalculator {
    public static void main(String[]args){
        double x;
        double y;
        double z;

        Scanner hypos = new Scanner(System.in);
        System.out.println("Enter the side of A: ");
        x = hypos.nextDouble();
        System.out.println("Enter the side of B: ");
        y = hypos.nextDouble();
        z=Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is: "+z);

        hypos.close();

    }
}
