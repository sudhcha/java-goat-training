package com.goat.inheritance;

class Operative {
    public void fight() {
        System.out.println("Fighting in the mission.");
    }
}

class Strategist extends Operative {
    public void planMission() {
        System.out.println("Planning the mission.");
    }
}

class Saboteur extends Operative {
    public void sabotage() {
        System.out.println("Sabotaging the target.");
    }
}

public class Main {
    public static void main(String[] args) {
        Strategist gandhi = new Strategist();
        gandhi.fight();        // Inherited behavior
        gandhi.planMission();  // Relevant behavior

        Saboteur jeevan = new Saboteur();
        jeevan.fight();        // Irrelevant for sabotage-only roles
        jeevan.sabotage();
    }
}

