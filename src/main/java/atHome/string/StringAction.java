package atHome.string;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAction {
    public static String joinStrings(String[] strings, String glue) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
            if (i < strings.length - 1) {
                stringBuilder.append(glue);
            }
        }
        return stringBuilder.toString();
    }

    public static char[] testAllUpperCase(String str) {
        char[] c1 = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                c1[i] = c;
            }
        }
        //str.charAt(index)
        return c1;
    }

    public static void main(String[] args) {
        String string[] = {"Shaiq", "salam", "aleykumf"};
        System.out.println(joinStrings(string, " ") + "g");
        System.out.println("=====================================");
        String text = "Ata ishde deyil amma karantindedi ";
        String tokens[] = text.split("\\s+");
        Arrays.stream(tokens).forEach(System.out::println);
        System.out.println("=====================================");
        String email = "shaiqhuseynzade98@gmail.com";
        String tokens2[] = email.split("s");
        Arrays.stream(tokens2).forEach(System.out::println);
        System.out.println("=====================================");
        String text1 = "Shaiq";
        String text2 = "Shai";
        String text3 = text1;
        System.out.println(text2.equals(text1));
        System.out.println("=====================================");
        String textq = "Shaiq salam1";
        if (text1 instanceof java.lang.String) {
            System.out.println(textq);
        }
        System.out.println("=====================================");
        char[] c = {'a', 'b'};
        int v = 5;
        int r = 7;
        System.out.println(String.valueOf(c));
        System.out.println(String.copyValueOf(c));
        System.out.println("=====================================");
        String h[] = {"Kak", "dela"};
//        System.out.println(h.replaceAll("\\s", ""));
        System.out.println(Arrays.stream(h).map(Objects::toString).collect(Collectors.joining(", ")));
        System.out.println(Arrays.toString(text.split(Pattern.quote("|"))));
        Stream<Character> characterStream = text.chars().mapToObj(x -> (char) x);
        System.out.println(characterStream);
        System.out.println("======================================");
//        int n = StringUtils.countMatches("11112222", "1");
//        System.out.println(n);
        System.out.println(testAllUpperCase("SHAiq"));
        char[] chars = testAllUpperCase("ShaAAAiQ");
        System.out.println(Arrays.toString(chars).replaceAll(" ", "").replaceAll(",", ""));
//        testAllUpperCase("sHaiQ")
        String[] citiesArray = {"Kyiv", "Odessa", "Lviv"};
       for(int i=0;i<citiesArray.length;i++){
           System.out.println(citiesArray[i]);
       }
        int i = 7;
        String str = String.valueOf(i);
        System.out.println(str);
        String n ="Shaiq";
        String b="Aysel";
        String a ="Aysu";
        n.join(b,a);
        System.out.println(n.join(b,a));
        String name="Shaiq";
        int mark=8;
        System.out.println("The student's " + name + " exam mark is " + mark);
        System.out.println(String.format("The student's %s , exam mark is %d",name,mark));
       System.out.printf("The student's %s , exam mark is %d",name,mark);
        String text8 = "You are the best.But never stop.";
        String[] words = text8.split(" ");

        for(String word : words) {
            System.out.println(word);
        }
    }


}
