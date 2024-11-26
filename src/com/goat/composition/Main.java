package com.goat.composition;

// Define skills as interfaces
interface Fighter {
    void fight();
}

interface Planner {
    void planMission();
}

interface Saboteur {
    void sabotage();
}

// Composition in classes
class Gandhi {
    private Fighter fighter;
    private Planner planner;

    public Gandhi(Fighter fighter, Planner planner) {
        this.fighter = fighter;
        this.planner = planner;
    }

    public void execute() {
        fighter.fight();
        planner.planMission();
    }
}

class Jeevan {
    private Saboteur saboteur;

    public Jeevan(Saboteur saboteur) {
        this.saboteur = saboteur;
    }

    public void execute() {
        saboteur.sabotage();
    }
}

public class Main {
    public static void main(String[] args) {
        Fighter gandhiFighter = () -> System.out.println("Gandhi fights tactically.");
        Planner gandhiPlanner = () -> System.out.println("Gandhi plans the mission.");

        Saboteur jeevanSaboteur = () -> System.out.println("Jeevan sabotages the mission.");

        Gandhi gandhi = new Gandhi(gandhiFighter, gandhiPlanner);
        gandhi.execute();

        Jeevan jeevan = new Jeevan(jeevanSaboteur);
        jeevan.execute();
    }
}

