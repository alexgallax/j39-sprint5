package edu.praktikum.sprint5.collections;

import java.util.*;

public class Sets {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("CDR");
        list.add("a");
        list.add("g12");

        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        Set<String> linkedSet = new LinkedHashSet<>(list);
        Set<String> treeSet = new TreeSet<>(list);

        System.out.println(set);
        System.out.println(linkedSet);
        System.out.println(treeSet);
    }
}
