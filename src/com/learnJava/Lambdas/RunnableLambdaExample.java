package com.learnJava.Lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * prior to java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable without java 8!");
            }
        };

        new Thread(runnable).start();

        /**
         * Using java 8
         * lambda syntax () -> {} ;
         */
        Runnable runnableLambda = () -> {System.out.println("Inside lambda runnable!"); };
        new Thread(runnableLambda).start();

        /**
         * Simple lambda implementation
         */
        Runnable runnableLambda1 = () -> System.out.println("Inside lambda runnable simple!");
        new Thread(runnableLambda1).start();
    }
}
