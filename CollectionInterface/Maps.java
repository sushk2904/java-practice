package CollectionInterface;

import java.util.*;
public class Maps {
    public static void main(String args[]){

        Map<String, Integer> students = new HashTable<String, Integer>();
        students.put("Sushant", 101);
        students.put("Hizru", 100);
        students.put("Om Saveaho", 67);

        students.put("Hizru", 105);
        System.out.println(students.keySet());

        for(String key: students.keySet())
        {
            System.out.println(key + ":" + students.get(key));
        }
    }
    
}
