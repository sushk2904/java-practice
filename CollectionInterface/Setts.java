package CollectionInterface;
import java.util.*;
public class Setts {
    public static void main(String args[])
    { 
        //No duplicates are allowed in set
        Set<Integer> vipl = new TreeSet<Integer>();
        vipl.add(111);
        vipl.add(115);
        System.out.println("Viplist is:" + vipl );

        for (Object n: vipl){
            System.out.println(n);

        }
    }
    
}
