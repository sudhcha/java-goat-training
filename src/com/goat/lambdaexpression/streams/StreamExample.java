package com.goat.lambdaexpression.streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> threats = Arrays.asList("Menon", "Clone", "Sunil", "Jeevan");


        threats.stream()
                .filter(threat -> threat.equals("Clone") || threat.equals("Jeevan"))
                .forEach(threat -> System.out.println("Active threat: " + threat));
    }
}

