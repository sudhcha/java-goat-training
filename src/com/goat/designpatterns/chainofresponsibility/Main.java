package com.goat.designpatterns.chainofresponsibility;

// Common interface for all handlers
interface MissionHandler {
    void setNextHandler(MissionHandler nextHandler);
    void handleRequest(String missionType);
}

// Concrete handler for intelligence missions
class IntelligenceHandler implements MissionHandler {
    private MissionHandler nextHandler;

    @Override
    public void setNextHandler(MissionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String missionType) {
        if (missionType.equals("Intelligence")) {
            System.out.println("IntelligenceHandler: Handling intelligence mission.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(missionType);
        } else {
            System.out.println("No handler available for mission type: " + missionType);
        }
    }
}

// Concrete handler for tactical missions
class TacticalHandler implements MissionHandler {
    private MissionHandler nextHandler;

    @Override
    public void setNextHandler(MissionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String missionType) {
        if (missionType.equals("Tactical")) {
            System.out.println("TacticalHandler: Handling tactical mission.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(missionType);
        } else {
            System.out.println("No handler available for mission type: " + missionType);
        }
    }
}

// Concrete handler for combat missions
class CombatHandler implements MissionHandler {
    private MissionHandler nextHandler;

    @Override
    public void setNextHandler(MissionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String missionType) {
        if (missionType.equals("Combat")) {
            System.out.println("CombatHandler: Handling combat mission.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(missionType);
        } else {
            System.out.println("No handler available for mission type: " + missionType);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create handlers
        MissionHandler intelligence = new IntelligenceHandler();
        MissionHandler tactical = new TacticalHandler();
        MissionHandler combat = new CombatHandler();

        // Set up chain of responsibility
        intelligence.setNextHandler(tactical);
        tactical.setNextHandler(combat);

        // Make requests
        System.out.println("Request: Intelligence Mission");
        intelligence.handleRequest("Intelligence");

        System.out.println("\nRequest: Tactical Mission");
        intelligence.handleRequest("Tactical");

        System.out.println("\nRequest: Combat Mission");
        intelligence.handleRequest("Combat");

        System.out.println("\nRequest: Unknown Mission");
        intelligence.handleRequest("Stealth");
    }
}
