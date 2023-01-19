package ru.leetcode.divanches;

import java.util.*;

public class TestClass<T> {

    public static void main(String[] args) {
        testExistingKeyMap();
    }

    static void testExistingKeyMap() {
        Map<Customer, String> map = new HashMap<>();
        map.put(new Customer(1L, "customer1", 11L), "key");
        map.put(new Customer(2L, "customer2", 12L), "key");
        System.out.println(map);
        map.put(new Customer(2L, "customer22", 122L), "key2");
        System.out.println(map);
    }


//    static void testIterateMap() {
//        Map<String, String> map = new HashMap<>();
//        map.put("123", "23424");
//        map.put("1223", "234241");
//        map.put("1243", "234245");
//
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            entry.setValue("a");
//        }
//        System.out.println(map);
//
//        map.replaceAll((key, value) ->  value + "b");
//        System.out.println(map);
//    }
//
//    static void testPrimitives() {
//        int i = 123123;
//        long l = i;
//        float f = 123123.1231F;
//        double d = f;
//
//        System.out.println(l);
//        System.out.println(d);
//        d = 4342334.34D;
//        System.out.println(d);
//        System.out.println(f);
//
//
//    }
//
//    static void firstOfFirst(String... strings) {
//        List<String> list = List.of(strings);
//        System.out.println(list);
//    }
//
//    static class Test {
//        public static <T, E> void testPrint(T t, E e) {
//            System.out.println(t.toString());
//            System.out.println(e.toString());
//        }
//
//        public static <T> void instanciateObject(List<? extends T> t){
//            for (int i=0; i< 4; i++) {
//                System.out.println(t.get(i).getClass());
//            }
//        }
//    }
//
//    static void getElementsQueue() {
//        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
//        queue.add(5);
//        queue.remove();
//        queue.remove();
//
//        System.out.println(queue);
//    }
//
//    static void printElementNewLine() {
//        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
//        nameSet.stream().forEach(System.out::println);
//    }
//    static void createArrayDeque() {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(2);
//        queue.add(0);
//        queue.add(1);
//        queue.add(7);
//        System.out.println(queue);
//    }
//    static void dictinctValuesInList() throws IOException {
//        int numberOfStudents = 0;
//        Map<String, Integer> marks = new HashMap<>();
//        marks.put("2", 0);
//        marks.put("3", 0);
//        marks.put("4", 0);
//        marks.put("5", 0);
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        numberOfStudents = Integer.parseInt(reader.readLine());
//
//        while (numberOfStudents > 0) {
//            numberOfStudents--;
//            try {
//                String value = reader.readLine();
//                if (marks.containsKey(value)) {
//                    marks.put(value, marks.get(value) + 1);
//                }
//            } catch (IOException e) {
//                System.err.println("can't read value from input. Try again");;
//            }
//        }
//
//        marks.values().forEach(v -> System.out.printf(v.toString() + " "));
//    }

//    static void dictinctValuesInList() {
//        List<String> list = List.of("java", "scala", "java", "clojure", "clojure");
//        List<String> distinctList = new HashSet<>(list).stream().toList();
//        System.out.println(distinctList);
//    }
//
//    static void foreachMap() {
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("Gamma",  3);
//        map.put("Omega", 24);
//        map.put("Alpha",  1);
//
//        //write your code here
//        for (Map.Entry entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }
//    }
}