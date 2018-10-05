import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       /* Set<String> set = new HashSet<String>;
        set.add("Mama");
        set.add("Mila");
        set.add("Mama");*/
       /* List<String> list = new LinkedList<>();
        list.add("d");
        list.add("u");
        list.add("p");

       for (String aList : list)
           System.out.println( aList);*/
        //Interator <String> iter= list.iterator();
        //while (iter.hasNext()) {
        //System.out.println(iter.next());
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mama");
        map.put(2, "Mima");
        map.put(3, "Muma");
        for (Map.Entry<Integer, String> pair : map.entrySet()) {

            Integer key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
         }


     // вывести рекурсивно 12345678 числа фибоначи через стринг билдер


        /*/ TODO Auto-generated method stub
        //String str= "";
       // public static void hey (int i) {
            System.out.println(i);
            hey (++i);
        }


        //StringBuilder str = new StringBuilder();
        //for (int i = 0; i < 7; i++) {
        //str.append(i);
        //str += i;
        //}

        //System.out.println(str);*/



