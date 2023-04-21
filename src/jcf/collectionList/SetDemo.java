package jcf.collectionList;

import java.util.HashSet;

public class SetDemo {


    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
       //Set<Student> hs=new LinkedHashSet<>();
        Student s1 = new Student();
        s1.setName("robin");
        Student s2 = new Student();
        s2.setName("subhani");
        Student s3 = new Student();
        s3.setName("vinay");


        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.print(hs.size());
        System.out.print(hs);
    }
}
