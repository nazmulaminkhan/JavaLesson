public class switches {
    public static void main(String[]args){
        //switch = statement that allows a variable to be tasted for equality against a list of values
        String day = "Google";

        switch (day){
            case "Sunday": System.out.println("It is sunny day");
            break;
            case "Monday": System.out.println("It is moon rise day");
            break;
            case "Tuesday": System.out.println("On this day mars rises on the sky");
            break;
            case "Wednesday": System.out.println("On this day venus rises on the sky");
            break;
            case "Thursday": System.out.println("On this day Jupiter rises on the sky");
            break;
            case "Friday": System.out.println("On this day Mercury rises on the sky");
            break;
            case "Saturday": System.out.println("On this day saturn rises on the sky");
            break;
            default: System.out.println("please insert a day!");
        }
    }
}
