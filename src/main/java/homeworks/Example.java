package homeworks;

import javax.xml.bind.ParseConversionEvent;
import java.lang.reflect.Array;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Example {
    static int [] array = {2, 3, 4, 5};
//    public int[] delete (int i){
//        int n[] = new int[array.length-1];
//        for (int j = 0, k = 0; i < array.length; i++) {
//            if (array[j] != array[i]) {
//                n[k++] = array[i];
//            }
//        }
//        for(int  b=0;b<n.length;b++){
//            System.out.println(n[b]+" ");
//        }
//        return n;
//    }
    public static void main(String[] args) {
//        new Example().delete(3);
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//
//        String dateStr = "10/03/2019";
//
////        Date dateObj = format.parse("10/03/2019");
//        System.out.println(dateObj);
//        Date date = Calendar.getInstance().getTime(); // OR new Date()
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy HH:mm:ss.SSS Z");
//
//        String formatStr = dateFormat.format(date);
////        System.out.println(formatStr);
//        double a = 8.5;
//        int x = 58769999;
//        double t = x;
//        int v = (int) x;
//        long b = x;

//        int c =b;
//        Integer y = x;
//        String string = y.toString();
////        System.out.println(string);
//        char ch = string.charAt(0);
//        byte b1 = 4;
//        byte b2 = 5;
//        byte b3 = (byte)(b1+b2);
//
//        byte op1 = 4;
//        byte op2 = 5;
//        byte myResultingByte = (byte)x;
//        System.out.println(b3);
        int child [] = new int[]{2,3};
        int n = child.length;
        int count = 0;
        int [] newChildArray = new int[n - 1];
        for (int i = 0, k = 0; i < child.length; i++) {
            if (child[i] != 3) {
                newChildArray[k++] = child[i];
//                count++;
            }
        }
        System.out.println(Arrays.toString(newChildArray));
    }


}

