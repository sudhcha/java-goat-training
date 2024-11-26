package com.goat.lambdaexpression.functionalinterface;

@FunctionalInterface
interface Mission {
    void execute(String task);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Mission mission = (task) -> System.out.println("Executing mission: " + task);
        mission.execute("Retrieve Uranium");
    }
}
