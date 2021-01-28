package streamsWS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String string = "";

    List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

    List<String> cs = myList.stream().filter(str -> str.charAt(0) == 'c')
            .collect(Collectors.toList());

        for (String c : cs) {
            c.toUpperCase();

        }

        Collections.sort(cs);

    System.out.println(cs.toString());


    }


}
