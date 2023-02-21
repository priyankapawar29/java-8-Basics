package com.learnJava.Lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * Comparator prior to java 8
         * compare method returns 0 when o1 == o2
         * compare returns 1 when o1>o2
         * comapre returns -1 when o1<o2
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Comparator result is" + comparator.compare(3,2));

        /**
         * Implementation using Lambda
         */

        Comparator<Integer> comparatorLambda1 = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Comparator result is" + comparator.compare(3,2));

        Comparator<Integer> comparatorLambda2 = (a,b) -> a.compareTo(b); //Lambda intelligent enough to typecast parameters
        System.out.println("Comparator result is" + comparator.compare(3,2));

    }
}
