///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package final1;
//
//import java.util.HashMap;
//import java.util.Set;
//
///**
// *
// * @author قتادة
// */
//public class hash {
//
//    public static void main(String[] args) {
//        String s = "alaa";
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (map.get(s.charAt(i)) == null) {
//                map.put(s.charAt(i), 1);
//            } else {
//                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
//            }
//            System.out.println(map.get(s.charAt(i)));
//        }
//        HashMap< Integer, String> map1 = new HashMap<>();
//        map1.put(33, s);
//        print(map1, s, 0, 33);
////        map.put(33, "ali");
////        map.put(33, "ahmad");
////        map.put(3, "sa");
////        System.out.println(map.put(33, "ali"));
////        System.out.println(map.put(3, "ahmad"));
//    }
//
//    public static void print(HashMap<Integer, String> map, String s, int length, int k) {
//        int count = 0;
//        Set<Integer> keys = map.keySet();
//        for (int i : keys) {
//            length++;
//        }
//        String[] a = new String[length];
//        for (int j = 0; j < a.length; j++) {
//            a[j] = map.get(j);
//        }
//        for (int d = 0; d < a.length; d++) {
//            if (a[d].equals(s)) {
//                count++;
//            }
//        }
//        if (count == 0) {
//            map.put(k, s);
//            System.out.println("Ok");
//        } else {
//            System.out.println(count);
//        }
//    }
//}
