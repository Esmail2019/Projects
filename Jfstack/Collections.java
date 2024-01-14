import java.util.ArrayList;
import java.util.*;

public class Collections {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Master Coding Bro");
        list.add("Master Coding Browny");
        list.add("Master Coding Henry");

        // USING ITERATOR
        // Iterator<String> iterator = list.iterator();
        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }

        // while (iterator.hasNext()) {
        // String obj = iterator.next();
        // System.out.println(obj);
        // }

        // USING FOR EACH
        for (String s : list) {
            System.out.println(s);
        }
    }
}
