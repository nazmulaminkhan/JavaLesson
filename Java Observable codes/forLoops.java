public class forLoops {
    public static void main(String[] args){
//        for Loops =executes a block of code a limited amount of times

        System.out.println("Positive Numbers");
        for(int i = 0; i<=10;  i++){
            System.out.println(i);
        }
        System.out.print("\n");
        System.out.println("Negative way countdown");
        for (int index = 10; index>=0; index--){
            System.out.println(index);
        }
        System.out.print("\n");
                System.out.println("Even numbers but negative countdown");
        for (int indev = 10; indev>=0; indev-=2){
            System.out.println(indev);
        }
        System.out.println("Happy new year!");
    }
}
