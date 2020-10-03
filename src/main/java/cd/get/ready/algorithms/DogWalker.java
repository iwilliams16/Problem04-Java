package cd.get.ready.algorithms;
import java.util.*;

import java.util.HashMap;

public class DogWalker {
    public int numberOfWalksCalculator(int[] dogSizes){  // int[] dogs = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int numberOfWalks  = 0;                             // int[] dogs = {10, 20, 10, 10, 30, 50, 10, 20, 30};
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int size: dogSizes){
            if(myMap.containsKey(size)){
                myMap.put(size, myMap.get(size)+1);
            }
            else{
                myMap.put(size,1);
            }
        }

        for(int values: myMap.values()) {
            numberOfWalks += Math.ceil(values/2.0f);

        }
        return numberOfWalks;
    }
}
