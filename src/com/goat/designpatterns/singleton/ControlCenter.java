package com.goat.designpatterns.singleton;

public class ControlCenter {

    // Private constructor to prevent instantiation
    private ControlCenter() {
        System.out.println("ControlCenter instance created.");
    }

    // Static inner class responsible for holding the Singleton instance
    private static class Holder {
        private static final ControlCenter INSTANCE = new ControlCenter();
    }

    // Public method to provide access to the Singleton instance
    public static ControlCenter getInstance() {
        return Holder.INSTANCE;
    }

    // Sample method to simulate ControlCenter functionality
    public void coordinateMission(String mission) {
        System.out.println("Coordinating mission: " + mission);
    }
}

