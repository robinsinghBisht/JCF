package jcf.collectionList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {


    public static void main(String... r){
        List list1=new ArrayList();
        List<String> list2=new ArrayList();

        //non generic list demo
        list1.add("hello");
        list1.add(1);
        Object object=list1.get(1);
        System.out.println(object);

        //generic list demo
        list2.add("hello other string");
        // list2.add(1); compilation error type missmatch
        String string=list2.get(0);
        System.out.println(string);
        System.out.println();

        //LinkedList

        list2 = new LinkedList<>();
        list2.add("another string");
        System.out.println(list2.get(0));


        //== initialization demo
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,4));
        System.out.println(list3.get(0));



        //list toString demo
        System.out.println(list3);

        //for each
        for(int i: list3){
            System.out.println(i);
        }




    }
}
