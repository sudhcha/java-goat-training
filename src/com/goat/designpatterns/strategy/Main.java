package com.goat.designpatterns.strategy;

interface Strategy {
    void execute();
}

class StealthStrategy implements Strategy {
    public void execute() { System.out.println("Executing stealth strategy!"); }
}

class CombatStrategy implements Strategy {
    public void execute() { System.out.println("Executing combat strategy!"); }
}

class Gandhi {
    private Strategy strategy;
    public void setStrategy(Strategy strategy) { this.strategy = strategy; }
    public void performStrategy() { strategy.execute(); }
}

public class Main {
    public static void main(String[] args) {
        Gandhi gandhi = new Gandhi();
        gandhi.setStrategy(new StealthStrategy());
        gandhi.performStrategy();
    }

}
