import org.testng.annotations.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Example {

    @Test
    void example() {

        String s ="ammaappa";
        HashMap<Character,Integer> hm = new HashMap<>();

        char[] ch = s.toCharArray();
        for(char c:ch){
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);


        }
        System.out.print(hm);
     }


    }


