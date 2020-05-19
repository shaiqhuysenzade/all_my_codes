package warmup.hackerank;

import java.util.StringJoiner;

public class Encryption {
    public static void main(String[] args) {
        Encryption x = new Encryption();
        String s = "have a nice day";


        System.out.println(x.encryption(s));
    }


    private String encryption(String s) {
        String newString = s.replaceAll(" ", "");
        int rows = (int) Math.sqrt(newString.length());

        //Expand the columns if the sentence doesn't fit in a square matrix
        int columns = (newString.length() > rows*rows) ? rows+1 : rows;

        //Expand the rows if the sentence still doesn't fit
        rows = (newString.length() > rows*columns) ? rows+1 : rows;
        StringJoiner sj = new StringJoiner(" ");
        for(int i = 0; i < columns; i++)
        {
            //System.out.print(sentence.charAt(i));
            int currentIndex = i;
            for(int j = 0; j < rows; j++)
            {
                if(currentIndex <= newString.length()-1)
                {
                    newString.charAt(currentIndex);
                }
                currentIndex += columns;
            }
            if(i+1 != columns) System.out.print(" ");
        }
        return newString;
    }
}
