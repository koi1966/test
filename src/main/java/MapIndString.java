import sun.security.x509.OtherName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapIndString {
    public static void main(String[] args) {
//                          2   1     1    2      2   2     2    1    1      2
        String stString ="Ваня Ваня Петя Саша Максим Маша Ваня Маша Вова Андрей Максим";
        String[] str = stString.split(" ");
        int Imap = 1;
        HashMap<String,Integer> heshMapp = new HashMap<>();
        for (String s : str) {
            heshMapp.put(s, Imap);
            for (String value : str) {

                if (s.equals(value)) {
                    heshMapp.put(s, Imap++);
                }
            }
            Imap = 1;
        }

//        for (int i = 0; i < str.length; i++) {
//            heshMapp.put(str[i],Imap);
//            for (int j = 0; j < str.length; j++) {
//
//               if (str[i].equals(str[j])){
//                   heshMapp.put(str[i],Imap++);
//               }
//            }
//            Imap =1;
//        }
//        System.out.println(heshMapp.toString());
        System.out.println(heshMapp);

        System.out.println("=======================================");
//        HashMap<String,Integer> heshMapp2 = new HashMap<>();
//        for (int i = 0; i < str.length; i++) {
//            if (heshMapp2.containsKey(str[i])) {
//                Integer temp = heshMapp2.get(str[i]);
//                heshMapp2.put(str[i],++temp);
//            } else
//                heshMapp2.put(str[i],1);
//        }

        HashMap<String,Integer> heshMapp2 = new HashMap<>();
        for (String s : str) {
            if (heshMapp2.containsKey(s)) {
                Integer temp = heshMapp2.get(s);
                heshMapp2.put(s, ++temp);
            } else
                heshMapp2.put(s, 1);
        }
//        System.out.println(heshMapp2.toString());
        System.out.println(heshMapp2);

        System.out.println("=======================================");

        List<String> listF = new ArrayList<>();
        listF.add("White");
        listF.add("Black");
        listF.add("Red");

        for (int i = 0; i < listF.size(); i++) {
            int count =1;
            for (int j = 0; j < listF.size(); j++) {
                if (listF.get(i).equals(listF.get(j)) && (i != j)) count++;

            }
            System.out.println(listF);
        }
    }
}
