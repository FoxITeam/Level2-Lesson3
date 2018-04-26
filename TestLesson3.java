package ru.foxit.grayfox;


import java.util.*;

public class TestLesson3 {

        static int i0 = 5;
        static Integer i1 = new Integer(5);
        Float f;
        Byte by;
        Short s;
        Long l;
        Boolean b;
        Double d;
        Character c;

        public static void main(String[] args) {

            TreeMap<String, Integer> map = new TreeMap<>();
            map.put("January", 1);
            map.put("February", 2);
            map.put("March", 3);
            map.put("April", 4);
            System.out.println(map.put("January", 10));
            System.out.println(map);
            map.containsValue(3);
            map.containsKey("April");

            // Map.Entry<K, V> //one row
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("K: " + entry.getKey() + ", V: " + entry.getValue());
            }

//        Set<Map.Entry<String, Integer>> set = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> entry = iterator.next();
//            System.out.println("K: " + entry.getKey() + ", V: " + entry.getValue());
//        }

//        Box b1 = new Box(1, 1);
//        Box b2 = new Box(2, 2);
//        Box b3 = new Box(3, 3);
//        TreeSet<Box> treeSet = new TreeSet<>();
//        treeSet.add(b3);
//        treeSet.add(new Box(4, 4));
//        treeSet.add(b1);
//        treeSet.add(b2);
//
//        System.out.println(treeSet);

//        LinkedHashSet<String> set = new LinkedHashSet<>();
//        set.add("January");
//        set.add("February");
//        set.add("March");
//        set.add("April");
//        set.add("January");
//
//        System.out.println(set);

//        Box b1 = new Box(1, 1);
//        Box b2 = new Box(2, 2);
//        Box b3 = new Box(3, 3);
//        LinkedList<Box> list = new LinkedList<>();
//
//        list.add(b1);
//        list.add(b2);
//        list.add(b3);
//        list.add(new Box(4, 4));
//
//        System.out.println(list.contains(new Box(1, 1)));
//
//        System.out.println(list);

            //        System.out.println(i0);
//        System.out.println(i1);
//        int a0 = 5;
//        Integer a1 = a0;
//        int a2 = a1;
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("The");
//        list.add("Big");
//        list.add("Java");
//        list.add("World");
//        System.out.println(list);
//        System.out.println(list.contains(new String("Hello")));
//
//        while(list.iterator().hasNext()) {
//            System.out.print(list.remove(list.size() - 1) + " ");
//        }
//
//        list.contains("Hello");
//        list.indexOf("Big");
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//
//        System.out.println();
//
////        Iterator<String> iterator = list.iterator();
////        while (iterator.hasNext()) {
////            System.out.print(iterator.next() + " ");
////        }
//        for (String aList : list) {
//            System.out.print(aList + " ");
//        }


        }
    }

