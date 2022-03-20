package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        TreeSet<Integer> resList = new TreeSet<>();
        //Predicate<Integer> isPositive = x -> x >= 0;
        for (int iList : intList) {
            //     isPositive.test(iList);
            if (iList > 0) {
                if (iList % 2 == 0) {
                    resList.add(iList);
                }
            }
        }
        System.out.println("Печать при сортировке без использования потоков");
        System.out.println(resList); // я понимаю, что в такой реализации дублированные значения ( например 32 ) распечатаются один раз, но в ДЗ не уточнен этот момент
        System.out.println("Печать при сортировке при использовании потоков");
        StreamMain streamMain = new StreamMain (intList);
        streamMain.main();

    }
}
