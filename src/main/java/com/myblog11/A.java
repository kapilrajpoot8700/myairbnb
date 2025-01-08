package com.myblog11;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A {
//predicate is functional interface introduce java 8 it's  return a boolean value
    public static void main(String[] args) {
// Predicate<Integer> result = n->n%2!=0;
// boolean val = result.test(100);

//    Predicate<String> result = str->str.startsWith("n");
//    boolean val = result.test("mike");

//      Predicate<String> result = str->str.endsWith("k");
//       boolean val =result.test("mile");

//        Predicate<String> result = str->str.equals("mike");
//        boolean val = result.test("Mike");

//        Predicate<String> result = str->str.equalsIgnoreCase("mike");
//        boolean val = result.test("mikE");
//        System.out.println(val);

//        List<Integer> list = Arrays.asList(10, 31, 30, 40);
//       List<Integer> newList =  list.stream().filter(n->n%2 == 0).collect(Collectors.toList());
////        System.out.println(newList);
//
//      List<String> list =   Arrays.asList("mike","smith","sachin","sam");
//      List<String> newList =list.stream().filter(str->str.startsWith("s")).collect(Collectors.toList());
//
//        System.out.println(newList);


//      List<String> list =  Arrays.asList("adam","kapil","rajput","sam","adam");
//      List<String> newList = list.stream().filter(n->n.equalsIgnoreCase("adam")).collect(Collectors.toList());

//        System.out.println(newList);
//        System.out.println(newList.size());
//        List<String> list = Arrays.asList("adam","kapil","rajpoot","sam","adam","kapil");
//        List<String> newList = list.stream().distinct().collect(Collectors.toList());
//
//        System.out.println(newList);

//       List<Integer> list = Arrays.asList(10,39,39,10,3,29,29,33,44,33,6);
//       List<Integer>newList = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(newList);
//        System.out.println(newList.size());

//        Function<Integer,Integer> val = n->n+10;
//        Integer result =val.apply(10);
//        System.out.println(result);

//       Function<Integer,Integer> val = n->n*n;
//       Integer resutl = val.apply(10);
//        System.out.println(resutl);
//
//        Function<Integer,String> val = n->"The Output is: "+n*n;
//        String result = val.apply(10);
//        System.out.println(result);
//
//       List<Integer> data = Arrays.asList(10,30,20,40,50);
//      List<Integer> data1 =  data.stream().map(n->n*n).collect(Collectors.toList());

       // System.out.println(data1);

      List<String> list =   Arrays.asList("kapil","mike","stalin","smith");

    List<String> list1 =  list.stream().map(n->n.toUpperCase()).collect(Collectors.toList());

        System.out.println(list1);









            }

    //@ Stream api =
}
