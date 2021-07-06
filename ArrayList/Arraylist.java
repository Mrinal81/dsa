package ArrayList;

import java.util.ArrayList;
import java.io.*;

public class Arraylist {

    public static void main(String args[]) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print(list);
        System.out.print(list.size());
         
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        
        list.add(20);
        list.add(40);
        System.out.println(list);
        System.out.println(list.size());
        list.add(20);
        list.add(40);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.remove(1);
        
    }
    
}
