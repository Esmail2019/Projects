import java.util.ArrayList;


public class arrlist {

    public static void main(String args[]) {

        // Creation
        // ArrayList<String> list1 = new ArrayList<>();// dealing with object

        // // adding elements
        // list1.add("coding ide");
        // list1.add("master coding channel");
        // list1.add("Master pro");

        // // 3 adding elements at speicific location
        // list1.add(2, "Assalamualikum");

        // // // Removing elements from arrlist
        // // list1.remove(2);

        // // // ` Change an element in arrlist
        // // list1.set(0, "changed ide");

        // // //
        // // System.out.println(list1);

        // // // Wrapper class
        // // // storing or wrapping primitive data as an object

        // // // Integer y = 15; // Wrapping the candy
        // // // Integer z = y.intValue(); // opening the candy

        // // ArrayList<Integer> list_two = new ArrayList<>();

        // // list_two.add(9156);
        // // list_two.add(72);
        // // list_two.add(63);
        // // list_two.add(98);

        // // int m = 14;
        // // list_two.add(m); // Boxing it will convert automatically int to Integer
        // // // Boxing is an automatic conversion from primitive to a wrapped object of
        // // // appropriate type

        // // // int x = list_two.get(3); // Unboxing is conversion from wrapped object
        // to
        // // its corresponding primitive
        // // // data

        // // // System.out.println(x);

        // // //Iteration of arrlist

        // // //USING FOR LOOP

        // // for (int i = 0; i < list1.size(); i++) {
        // // System.out.println(list1.get(i));
        // // }

        // // //USING FOR EACH LOOP
        // // for (String s : list1) {
        // // System.out.println(s);
        // // }

        // // USING ITERATOR INTERFACE

        // Iterator<String> iterator = list1.iterator();
        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }

        ArrayList<Integer> list_two = new ArrayList<>();

        list_two.add(9156);
        list_two.add(72);
        list_two.add(63);
        list_two.add(98);

        // Comparing the elemenst of arraylist
        // compareTo:
        // - a negative number for less than realtion
        // 0 to indicate equality
        // + a positive number for greater than realtion

        System.out.println(list_two.get(0).compareTo(list_two.get(1)));
        System.out.println(list_two.get(2).compareTo(list_two.get(3)));

    }
}
