import java.util.ArrayList;

public class forEachLoop {
    public static void main(String[] args){
        /*
        * For each loop or for-each = traversing technique to iterate through the elements in an array/collection
        *                               less steps, more readable
        *                               less flexible
        * */

        //String[] animals = {"cat", "dog", "tiger", "bird"};
        ArrayList<String> animals = new ArrayList();
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Cameleon");
        for (String i:animals) {
            System.out.println(i);
        }
    }
}
