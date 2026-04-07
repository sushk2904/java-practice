package CollectionInterface;

import java.util.*;

public class Arraylist {
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(9); 
        nums.add(2); 
        nums.add(10); 
        System.out.println(nums.indexOf(9));
        System.out.println(nums.get(2));

        for (Object n: nums){
            int num = (Integer)n;
            System.out.println(num*2);
        }

        System.out.println("THE ARRAY IS:" +  nums);
    }
    
}
