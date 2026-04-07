package Module3;

import java.util.*;
public class ListSetMap {
    public static void main(String args[])
    {
        List<String> groceries = new ArrayList<>();
        groceries.add("DOODH");
        groceries.add("DAHI");
        groceries.add("GHEE");
        System.out.println("Groceries List is:" + groceries);

        Set<String> viplist = new HashSet<>();
        viplist.add("Sushant");
        viplist.add("Om Saveaho");
        viplist.add("Suarin");
        System.out.println("VIP List is:" + viplist);

        Map<String, Integer> Students = new HashMap<>();
        Students.put("Sushant", 101);
        Students.put("Monu", 102);
        Students.put("Bodmosh", 111);
        System.out.println("Sushant's grades: " + Students.get("Sushant"));

    }
}    

