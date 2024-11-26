package com.goat.lambdaexpression.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissionProcessor {
    public static void main(String[] args) {
        List<String> tasks = Arrays.asList("Stealth Mission", "Rescue Mission", "Bomb Defusal", "Undercover");

        List<String> priorityTasks = tasks.stream()
                .filter(task -> task.contains("Mission"))
                .map(task -> "Priority: " + task)
                .collect(Collectors.toList());

        priorityTasks.forEach(System.out::println);
    }
}

