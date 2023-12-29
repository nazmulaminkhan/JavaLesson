import java.util.ArrayList;

public class sdarrayList {
    public static void main(String[] args){
        // 2DArrayList = a dynamic list of list
        //              You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryLists = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> productList = new ArrayList();
        productList.add("Complex Container *999");
        productList.add("Books of legends *990");
        productList.add("Wild foods from Brazil *991");

        ArrayList<String> computerBrands = new ArrayList();
        computerBrands.add("HUAWEI");
        computerBrands.add("Lenovo");
        computerBrands.add("Realme");

        groceryLists.add(bakeryList);
        groceryLists.add(productList);
        groceryLists.add(computerBrands);

        System.out.println(groceryLists);
    }
}
