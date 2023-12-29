public class StringMethods {
    public static void main(String[] args){
        // String = a reference data type that can store one or more characters 
        //          reference data types have access to useful methods
        String name = "Guanxu";
        //boolean result = name.equalsIgnoreCase("guansu");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("G");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = name.replace('x', 's');

        System.out.println(result);
    }
}
