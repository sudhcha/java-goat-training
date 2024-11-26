package com.goat.encapsulation;

public class SatsTeam {
    private String mission; // Restricted access to mission details

    public String getMission(String role) {
        if (role.equals("Leader") || role.equals("Member")) {
            return "Mission Details: " + mission;
        } else {
            return "Access Denied: Unauthorized Role";
        }
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public static void main(String[] args) {
        SatsTeam team = new SatsTeam();
        team.setMission("Retrieve Uranium from Menon");

        // SATS Members
        System.out.println(team.getMission("Leader")); // Gandhi
        System.out.println(team.getMission("Member")); // Sunil

        // Non-SATS Members
        System.out.println(team.getMission("Villain")); // Jeevan
        System.out.println(team.getMission("Saboteur")); // Menon
    }
}

