import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;



public class Sets {
    public static void main(String args[]) {

        // Set<String> s1 = new HashSet<>();
         
        // s1.add("element 1");
        // s1.add("element 2");
        // s1.add("element 2");
        // s1.add("element 3");


        // Iterator<String> iterator = s1.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // for (String s : s1) {
        //     System.out.println(s);
        // }





        // Set<String> s2 = new LinkedHashSet<>();
        // s2.add("A");
        // s2.add("B");
        // s2.add("C");
        // s2.add("D");
        // s2.add("D");
        // s2.add("E");

        // Iterator<String> iterator = s2.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }
 
 

        Set<String> s3 = new TreeSet<>();
        s3.add("A");
        s3.add("B");
        s3.add("C");
        s3.add("D");
        s3.add("B");
        s3.add("B");


        Iterator<String> iterator = s3.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}