package com.goat.generics.bounded;

public class Mission<T extends Fighter> {
    private T member;

    public Mission(T member) {
        this.member = member;
    }

    public void startMission() {
        member.fight();
    }

    public static void main(String[] args) {
        Mission<Fighter> generalMission = new Mission<>(new Fighter());
        Mission<SpecialForces> specialMission = new Mission<>(new SpecialForces());

        generalMission.startMission();
        specialMission.startMission();
    }
}

