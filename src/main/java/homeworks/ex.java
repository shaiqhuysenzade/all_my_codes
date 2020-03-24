package homeworks;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ex {
    public static void main(String[] args) {
//        String s ="strawberries";
//        System.out.println(s.substring(2,5));
//        char x ='x';
//        System.out.println((int)x);
//        long time = System.currentTimeMillis();
//        ZoneId zoneId = ZoneId.systemDefault();
//          long x=LocalDate.of(1986,12,01).atStartOfDay(zoneId).toEpochSecond();
//        System.out.println(x);
////        LocalDate dt = LocalDate.from();
////        System.out.println(dt);
////        System.out.println(t.getTime());
////        long x = LocalDate.of(1970, 07, 07).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")).toEpochDay();
////        System.out.println(x);
////        new SimpleDateFormat("dd/MM/yyyy").parse(new SimpleDateFormat("dd/MM/yyyy").format(new Date(1970, 01, 02))).getTime();
//        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
//
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return b.compareTo(a);
//            }
//        });
        LinkedList<String> x =  new LinkedList<>();
        x.add("k");
        x.add("l");
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        numberList.stream()
                .filter(i -> i % 2 == 0)
                .forEach(i-> System.out.println(i*2));

    }
}
