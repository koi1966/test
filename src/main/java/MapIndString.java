import sun.security.x509.OtherName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapIndString {
    public static void main(String[] args) {
//                          2   1     1    2      2   2     2    1    1      2
        String stString ="Ваня Петя Саша Максим Маша Ваня Маша Вова Андрей Максим";
        String[] str = stString.split(" ");
        Integer Imap = 1;
        Integer Jmap =1;

        HashMap<String,Integer> heshMapp = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            heshMapp.put(str[i],Imap);
            for (int j = 1; j < str.length; j++) {

               if (str[i].equals(str[j])){
                   heshMapp.put(str[i],Imap++);
               }
            }
            Imap =1;
        }
        System.out.println(heshMapp.toString());

        List<String> listF = new ArrayList<>();
        listF.add("White");
        listF.add("Black");
        listF.add("Red");

        for (int i = 0; i < listF.size(); i++) {
            int count =1;
            for (int j = 0; j < listF.size(); j++) {
                if (listF.get(i).equals(listF.get(j)) && (i != j)) count++;

            }

        }
    }
}
