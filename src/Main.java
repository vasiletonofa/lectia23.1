import filter.Filter;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        String a = new String("A");                                           // "B" -> 22
//        String a1 = new String("A");                                          //  "C" -> 55
//
//        System.out.println(a.equals(a1)); // true -> se compara continutul
//        System.out.println(a == a1); // false -> se compara adresele de memorie
//
//        String b = "B"; // 22
//        String b1 = new String("B"); // 33
//
//        System.out.println(b.equals(b1)); // true -> se compara continutul
//        System.out.println(b == b1); // false -> se compara adresele de memorie
//
//        String c = "C"; // 55
//        String c1 = "C"; // 55
//
//        System.out.println(c.equals(c1)); // true
//        System.out.println(c == c1); // true


//        String x = "A"; // 22 -> este eligibila sa fie colectata de catre Garbage Colector
//         x = x + "V"; // 33 -> este eligibila sa fie colectata de catre Garbage Colector
//         x = x + "D"; // 44

//        for (int i = 0; i< 1000; i++) {
//            x = x + i; // se va genera adresa noua de memorie
//        }

        // x = x + 0; // 88 -> este eligibila sa fie colectata de catre Garbage Colector
        // x = x + 1; // 99 -> este eligibila sa fie colectata de catre Garbage Colector
        // x = x + 2; // 77

        // String -> Imutabil (la fiecare modificare se creaza adresa noua de memorie)
        // StringBuilder -> Mutabil (la fiecare modificare se utilizeaza aceiasi adresa de memorie)

//        StringBuilder stringBuilder = new StringBuilder("A"); // 11
//        stringBuilder.append("B"); // AB -> 11
//        stringBuilder.append("C"); // ABC -> 11
//        stringBuilder.append("D"); // ABCD -> 11
//
//        for (int i = 0; i < 1000; i++) {
//            stringBuilder.append(i); // 11
//        }

        // ABCD + 0 -> 11
        // ABCD + 1 -> 11
        // DCBA + 2 -> 11

//        String result = stringBuilder.toString();
//
//        String t = "ABCDE";
//
//        StringBuilder stringBuilder1 = new StringBuilder(t);
//        t = stringBuilder1.reverse().toString();

        // String vs StringBuilder ->
        // StringBuilder atunci cand avem multe modificari,
        // String atunci cand nu avem multe modificari


//        List<String> list =  new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        // list.size() = 3
        // list.get(0) = A
        // list.get(1) = B
        // list.get(2) = C

//        Set<String> strings = new HashSet<>();
//        strings.add("Z");
//        strings.add("E");
//        strings.add("F");

//        strings.get(0);

//        String[] array = strings.toArray(new String[0]);
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

//        for(String s : strings) {
//            System.out.println(s);
//        }

        // s = Z
        // s = E
        // s = F

//        List<String> list =  new ArrayList<>();
//        list.add("Vasile");
//        list.add("Anatolie");
//        list.add("Ion");
//        list.add("Andrei");
//
//        List<String> filteredList = new ArrayList<>();
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).startsWith("A")) {
//                filteredList.add(list.get(i));
//            }
//        }
//
//        System.out.println(list);
//        System.out.println(filteredList);
//
//        for (int i = 0; i < filteredList.size(); i++) {
//            filteredList.set(i, filteredList.get(i).toLowerCase());



       List<String> a =  Stream.of("Andrei", "Vlad", "Nicolae")
                .collect(Collectors.toList());

        Set<String> b =  Stream.of("Andrei", "Vlad", "Nicolae")
                .collect(Collectors.toSet());

        List<String> list = new ArrayList<>();
        list.add("AAFVB");
        list.add("CERF");
        list.add("BSD");
        list.add("CSE");

       Set<String> set = list.stream()
               .collect(Collectors.toSet());

       List<String> list2 = list.stream()
               .filter(s -> s.contains("B")) // AAFVB -> true, "CERF" -> false, "BSD" -> true : // AAFVB,  "BSD"
               .filter(s -> s.contains("A")) // AAFVB - true, "BSD" -> false
               .map(s -> s.toLowerCase()) // aafvb
               .collect(Collectors.toList()); // aafvb
        
        Figura figura = () -> System.out.println("Disenez area patrat");
        figura.diseneaza();

        diseneaza(() -> System.out.println("Disenez area patrat"));


        Filter filterObj = (s) -> s.contains("B"); // true/false
        filterObj.filter("AC"); // false

    }

    // Programare OOP -> Clase, Obiecte
    // Programare Functionala -> functiii / metode

//        Set<String> list1 = list.stream()
//                .filter((s) -> s.startsWith("A"))
//                .map((s) -> s.toLowerCase())
//                .collect(Collectors.toSet());
//
//        System.out.println("Lista din for: " + filteredList);
//        System.out.println("Lista din stream: " + list1);


    // [Vasile, Anatolie, Ion, Andrei].stream()  -----> filter( filtreaza toate cu A ) ----> [Anatolie, Andrei] --> map( transformam lowercase ) ---> [anatolie, andrei] ---> toSet() --> new HashSet([anatolie, andrei])

//        Set<String> set2 =  Stream.of("Andrei", "Ion", "Anatolie")
//                .filter((s) -> s.startsWith("A"))
//                .map((s) -> s.toLowerCase())
//                .collect(Collectors.toSet());
//
//        String[] array = new String[3];
//        array[0] = "Ion";
//        array[1] = "Ion";
//        array[2] = "Ion";
//
//        Set<String> set3 = Arrays.stream(array)
//                .filter((s) -> s.startsWith("A"))
//                .map((s) -> s.toLowerCase())
//                .collect(Collectors.toSet());



    public static void diseneaza(Figura figura) {
        figura.diseneaza();
    }


    public static void print(String... val) { // C,D,E;  A;  [A, B]

    }

    public static void print2(String[] val2) { // [A, B]

    }

    public static void print3(String val3) { //A, o valoare

    }
}