package jcf.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {


//    you have an array of Person objects with attributes name, age,
//    and gender. Implement a Java method that takes this
//    array and returns a map where the keys are genders,
//    and the values are lists of names of persons older than 25.

        public static void main(String[] args) {

            String[][] persons = {
                    {"Alice", "28", "Female"},
                    {"Bob", "22", "Male"},
                    {"Charlie", "30", "Male"},
                    {"Diana", "26", "Female"},
                    {"Eva", "24", "Female"}
            };

            Map<String, List<String>> result =
                    Arrays.stream(persons)
                            .filter(p -> Integer.parseInt(p[1]) > 25)
                            .collect(Collectors.groupingBy(
                                    p -> p[2],
                                    Collectors.mapping(p -> p[0], Collectors.toList())
                            ));

            System.out.println(result);
        }
    }

//    public static void main(String[] args) {
//        String[][] persons = {
//                {"Alice", "28", "Female"},
//                {"Bob", "22", "Male"},
//                {"Charlie", "30", "Male"},
//                {"Diana", "26", "Female"},
//                {"Eva", "24", "Female"}
//        };
//
//        List<String[]> personsList = Arrays.asList(persons);
//        List<List<String>> personLists = new ArrayList<>();
//        List<String> person;
//        for (int j = 0; j < personsList.size(); j++) {
//            String r[] = personsList.get(j);
//            person = new ArrayList<>();
//            for (int i = 0; i < r.length; i++) {
//                person.add(r[i]);
//            }
//           personLists.add(person);
////            System.out.println(person);
//
//        }
//        AtomicReference<List<String>> personsListMapped = new AtomicReference<>(new ArrayList<>());
//        personLists.stream().forEach(personsi ->
//                personsListMapped.set(personsi.stream().filter(e -> {
//                    try {
//                        int age = Integer.valueOf(e.toString());
//                        if (age > 25) {
//                            System.out.println(age);
//                            personsListMapped.set(personsi);
//                            return true;
//                        }
//                    } catch (NumberFormatException ex) {
//
//                    }
//                    return false;
//                }).collect(Collectors.toList())));
//
//        System.out.println(personsListMapped);
//    }






