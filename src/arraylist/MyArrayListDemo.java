/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 20-Nov-20
 *  Time: 3:09 PM
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Creating an ArrayList of Integer object, we will explore some of the methods
 * of ArrayList class and Collections class
 */
public class MyArrayListDemo {
    public static void main(String[] args) {
        //create an ArrayList
        List<Integer> list = new ArrayList<>();
        //add some elements in this list
        list.add(10);
        list.add(20);
        list.add(10);
        //check the size of list
        System.out.println("size = " + list.size());

        System.out.println(list);
        list.add(3, 500);

        System.out.println(list);

        list.add(1, 50);
        System.out.println(list);
        System.out.println("removed =" + list.remove(2));
        System.out.println(list);
        System.out.println("remove 5000 =" + list.remove(Integer.valueOf(5000)));
        System.out.println(list);

        //traversing the list, i.e. processing each element
        // by performing sum of all elements of list
        int sum = 0;
        //for each
        for(Integer element : list){
            sum = sum + element;//unboxing
        }
        System.out.println("sum = " + sum);
        sum = 0;
        // iterator
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            Integer element = itr.next();
            //itr.remove();
            sum = sum + element;
        }
        System.out.println("sum = " + sum);
        System.out.println(list);

        //creating a new ArrayList, and initializing it by random values using Math.random()
        List<Integer> integerList = new ArrayList<>();
        //initializing
        for (int i = 0; i < 10; i++) {
            integerList.add((int)(Math.random() * 100));
        }
        System.out.println(integerList);

        //using addAll
        list.addAll(2,integerList);
        System.out.println(list);
        list.retainAll(integerList);
        System.out.println(list);

        System.out.println("max element of the list = " + Collections.max(list));
        System.out.println("min element of the list = " + Collections.min(list));
        //sorting the list
        Collections.sort(list);
        System.out.println(list);
        //getting elements by index
        System.out.println("element on index 0 = " + list.get(0));

        //replacing an element on given index
        list.set(0, 12345);
        System.out.println(list);

        //searching for an element in arraylist
        System.out.println( list.contains(123457));
        //clearing the complete list
        list.clear();
        System.out.println(list);

    }
}
