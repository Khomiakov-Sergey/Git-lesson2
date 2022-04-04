package by.it.academy;

import java.util.ArrayList;
import java.util.List;

public class HelperForCollections {
    public static List<Integer> fillTheArrayList (int numberOfElements){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++){
            list.add((int)(Math.random()*10+1));
        }
        return list;
    }

    public static List<Integer> fillTheArrayList (int numberOfElements, int maxValue){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++){
            list.add((int)(Math.random()*maxValue+1));
        }
        return list;
    }

    // some changes
    // some changes1
}
