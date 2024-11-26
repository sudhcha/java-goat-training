package com.goat.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        // Access the Singleton instance
        ControlCenter control1 = ControlCenter.getInstance();
        ControlCenter control2 = ControlCenter.getInstance();

        // Verify Singleton behavior
        System.out.println(control1 == control2);

        // Use the Singleton instance
        control1.coordinateMission("Retrieve Uranium from Menon");
    }
}

