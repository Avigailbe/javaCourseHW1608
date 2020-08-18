package home_work1608;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    /* add additional parameter which will be an object (MyComparator) which will have function
       like boolean equals(T t1, T t2) that will check
       how many times t is in the List but first check if same object*/
    public static <T>  int countDuplicates(List<T> elements, T t ,MyComparator myComp) {
        int counter = 0;
        for (T element : elements)
           if (myComp.compareAndCount(element, t)){
                counter++;
            }
        //returns how many time the t is in the list
        return counter;
    }

    public static void main(String[] args) {
        int amount = 0;
        String msg = "";

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("r");
        stringList.add("a");
        stringList.add("k");
        stringList.add("e");
        stringList.add("d");
        stringList.add("a");
        stringList.add("b");
        stringList.add("r");
        stringList.add("a");

        //sends implementation to countDuplicates and returns count of duplicates
        amount = countDuplicates(stringList,"a",(t1, t2)-> {
                                if(t1.getClass() == t2.getClass()){
                                    return t1.equals(t2);
                                 } return false;});
        msg = "The amount of times 'a' is in the list is: "+ amount;
        printDuplicates(msg);

        amount = countDuplicates(stringList,"b",(t1, t2)-> {
                                if(t1.getClass() == t2.getClass()){
                                    return t1.equals(t2);
                                } return false;});
        msg = "The amount of times 'b' is in the list is: "+ amount;
        printDuplicates(msg);

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(4);
        integers.add(3);
        integers.add(5);
        integers.add(5);
        integers.add(1);
        integers.add(1);
        integers.add(7);

        amount = countDuplicates(integers,1,(t1, t2)-> {
                                if(t1.getClass() == t2.getClass()){
                                    return t1.equals(t2);
                                } return false;});
        msg = "The amount of times 1 is in the list is: "+ amount;
        printDuplicates(msg);

        amount = countDuplicates(integers,7,(t1, t2)-> {
                                if(t1.getClass() == t2.getClass()){
                                    return t1.equals(t2);
                                } return false;});
        msg = "The amount of times 7 is in the list is: "+ amount;
        printDuplicates(msg);

    }
    public static void printDuplicates(String message) {
        System.out.println(message);
    }
}
