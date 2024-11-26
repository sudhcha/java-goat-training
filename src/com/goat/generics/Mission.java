package com.goat.generics;

import java.util.ArrayList;
import java.util.List;

public class Mission<T> {
    private T missionDetails;

    public Mission(T missionDetails) {
        this.missionDetails = missionDetails;
    }

    public T getMissionDetails() {
        return missionDetails;
    }

    public void executeMission() {
        System.out.println("Executing mission: " + missionDetails.toString());
    }

    public static void main(String[] args) {
        Mission<String> rescueMission = new Mission<>("Rescue Operation in Bangkok");
        Mission<Integer> missionPriority = new Mission<>(1); // Priority level

        rescueMission.executeMission();
        System.out.println("Mission Priority: " + missionPriority.getMissionDetails());
    }
}

