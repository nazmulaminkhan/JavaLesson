public class arrays {
    public static void main(String[] args){
        // Arrays = used to store multiple values in a single variable
        String[] cars = {"Tesla", "Bugatti", "Ferrari"};
        cars[0] = "Lamborgini";
        System.out.println(cars[0]);
        System.out.println(cars[2]);
        
        System.out.println();
        //additional way
        String[] carz = new String[3];
        carz[0]="VolsenVagen";
        carz[1]="Porsce";
        carz[2]="GTR";
        for(int i=0; i<carz.length; i++){
            System.out.println(carz[i]);
        }
    }
}
