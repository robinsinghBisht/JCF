package jcf.collectionList;

import java.util.ArrayList;
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
        list2.add("hello");
        // list2.add(1); compilation error type missmatch
        String string=list2.get(0);
        System.out.println(string);

        //**
    }
}
