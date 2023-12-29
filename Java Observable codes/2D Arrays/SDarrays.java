public class SDarrays {
    public static void main(String [] args){
        //2Darray = an array of arrays
        String[][] alphabets = new String[3][3];
        alphabets[0][0] = "A";
        alphabets[0][1] = "B";
        alphabets[0][2] = "C";
        alphabets[1][0] = "D";
        alphabets[1][1] = "E";
        alphabets[1][2] = "F";
        alphabets[2][0] = "G";
        alphabets[2][1] = "H";
        alphabets[2][2] = "I";
        for(int i=0; i<alphabets.length; i++){
            System.out.println();
            for(int j=0;j<alphabets[i].length; j++){
                System.out.print(alphabets[i][j]+" ");
            }
        }
        System.out.println();
        //another way
        String[][] bengaliLIPI = {{"ক", "খ", "গ"}, {"ঘ", "ঙ", "চ"},{"ছ", "জ", "ঝ"},{"ঞ", "ট", "ঠ"}};
        for(int k=0; k<bengaliLIPI.length; k++){
            System.out.println();
            for(int l=0;l<bengaliLIPI[k].length; l++){
                System.out.print(bengaliLIPI[k][l]+" ");
            }
        }
    }
}
