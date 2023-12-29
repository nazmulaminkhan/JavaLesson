import java.util.Random;
public class randomNumbers {
    public static void main(String[]args){
        Random random = new Random();
        int x = random.nextInt(90);
        System.out.println(x);

        //double
        double y = random.nextDouble();
        System.out.println(y);

        //boolean
        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
