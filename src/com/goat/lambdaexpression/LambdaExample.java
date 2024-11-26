package com.goat.lambdaexpression;

interface Plan {
    String strategy(String approach);
}

public class LambdaExample {
    public static void main(String[] args) {
        Plan plan = (approach) -> "Executing strategy: " + approach;

        System.out.println(plan.strategy("Stealth"));
    }
}

