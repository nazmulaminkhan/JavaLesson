import java.util.Scanner;
public class logicalOperators {
    public static void main(String[]args){
        // Logical Operators = used to connect two or more expressions
        // && (AND) both conditions must be true
        // || (OR) either conditions must be true
        // ! (NOT) reverses boolean value of a condition

        int temp = 25;
        if (temp>30){
            System.out.println("It is hot outside");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("It is warm outside");
        }
        else{
            System.out.println("It is cold outside");
        }

        //OR
        Scanner sert = new Scanner(System.in);
        System.out.println("If you want to quit the game, then press q or Q");
        String response = sert.next();

        if(response.equals('q') || response.equals('Q')) {
            System.out.println("You quit the game");
        }
        else{
            System.out.println("You are still playing the game *pew *pew");
        }

        //NOT
        Scanner inert = new Scanner(System.in);
        System.out.println("If you want to go back to the game, then press r or R");
        String replay = inert.next();
        if(!replay.equals('r') && !replay.equals('Q')){
            System.out.println("Error, try again");
        }
        else{
            System.out.println("Welcome back to the game");
        }
    }
}
