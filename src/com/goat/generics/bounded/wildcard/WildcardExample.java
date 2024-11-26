package com.goat.generics.bounded.wildcard;

import com.goat.generics.bounded.Fighter;
import com.goat.generics.bounded.SpecialForces;

import java.util.ArrayList;
import java.util.List;

class MissionUtil {
    public static void executeAll(List<? extends Fighter> fighters) {
        for (Fighter fighter : fighters) {
            fighter.fight();
        }
    }
}

public class WildcardExample {
    public static void main(String[] args) {
        List<Fighter> generalFighters = new ArrayList<>();
        generalFighters.add(new Fighter());

        List<SpecialForces> specialFighters = new ArrayList<>();
        specialFighters.add(new SpecialForces());

        // Can pass both lists to executeAll
        MissionUtil.executeAll(generalFighters);
        MissionUtil.executeAll(specialFighters);
    }
}

