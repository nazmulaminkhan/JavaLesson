import java.util.Scanner;

public class nestedLoops {
    public static void main(String[] args){
        //nested loops = a loop inside of a loop
        Scanner writer = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = writer.nextInt();
        System.out.println("Enter # of columns: ");
        columns = writer.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = writer.next();
        for (int i=1; i<=rows; i++){
            System.out.println();
            for (int j=1; j<=columns; j++){
                System.out.println(symbol);
            }
        }
    }
}
