package com.goat.objectClass;

import java.util.Arrays;
import java.util.List;

// Abstract Class
abstract class Operative {
    protected String name;
    protected String role;
    protected List<String> skills;

    public Operative(String name, String role, List<String> skills) {
        this.name = name;
        this.role = role;
        this.skills = skills;
    }

    public abstract void executeTask();

    public void killGoodPeople(){

    }
}

// Concrete Class: Strategist
class Strategist extends Operative {
    public Strategist(String name, List<String> skills) {
        super(name, "Strategist", skills);
    }

    private void leadMission() {
        System.out.println(name + " is leading the mission.");
    }

    private void interrogate() {
        System.out.println(name + " is interrogating a suspect.");
    }

    @Override
    public void executeTask() {
        System.out.println(name + " is planning and executing the mission.");
        leadMission();
        interrogate();
    }
}

// Concrete Class: Saboteur
class Saboteur extends Operative {
    private String alias;
    private String loyalty;

    public Saboteur(String name, String alias, String loyalty, List<String> skills) {
        super(name, "Saboteur", skills);
        this.alias = alias;
        this.loyalty = loyalty;
    }

    private void planRevenge() {
        System.out.println(name + " (aka " + alias + ") is planning revenge for " + loyalty + ".");
    }

    private void detonateBomb() {
        System.out.println(name + " is detonating a bomb.");
    }

    @Override
    public void executeTask() {
        System.out.println(name + " is sabotaging the target.");
        planRevenge();
        detonateBomb();
    }
}

// Concrete Class: Manipulator
class Manipulator extends Operative {
    private String motivations;

    public Manipulator(String name, String motivations, List<String> skills) {
        super(name, "Manipulator", skills);
        this.motivations = motivations;
    }

    private void manipulate() {
        System.out.println(name + " is manipulating others using " + motivations + ".");
    }

    private void kidnap() {
        System.out.println(name + " is kidnapping a key individual.");
    }

    @Override
    public void executeTask() {
        System.out.println(name + " is executing manipulative actions.");
        manipulate();
        kidnap();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Instantiate Gandhi (Strategist)
        Operative gandhi = new Strategist(
                "Gandhi",
                Arrays.asList("Martial Arts", "Stealth", "Leadership")
        );
        gandhi.executeTask();
        gandhi.killGoodPeople();

        System.out.println();

        // Instantiate Jeevan (Saboteur)
        Operative jeevan = new Saboteur(
                "Jeevan",
                "Sanjay",
                "Menon",
                Arrays.asList("Explosives", "Combat", "Sabotage")
        );
        jeevan.executeTask();

        System.out.println();

        // Instantiate Menon (Manipulator)
        Operative menon = new Manipulator(
                "Menon",
                "Revenge for family tragedy",
                Arrays.asList("Psychology", "Deception", "Kidnapping")
        );
        menon.executeTask();
    }
}
