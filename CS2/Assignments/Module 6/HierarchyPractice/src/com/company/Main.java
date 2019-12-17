package com.company;

public class Main {

    public static void main(String[] args) {

        Forward taylorHall = new Forward("Taylor", "Hall", "left",
                "Arizona Coyotes", "LW", 16, 19);
        // !canFight

        Forward tomSestito = new Forward("Tom", "Sestito", "right",
                "Heater's Allstars", "RW", 4,3);
        // canFight

        taylorHall.fight(tomSestito); // won't be successful (points)
        tomSestito.fight(taylorHall); // will be successful (points)

        Defense samiSalo = new Defense("Sami", "Salo", "right",
                "Team Slovakia", 40,3, 65);
        samiSalo.fight(tomSestito); //overridden method for hits allows sami to fight

        Goalie robertoLuongo = new Goalie("Roberto", "Luongo", "left",
                "Vancouver Canucks", "left", "butterfly", 0, 10,
                0.917, 2.08);
        robertoLuongo.stackPads();
        robertoLuongo.fight(taylorHall);
        System.out.println(robertoLuongo.getName() + "has this to say, ref: " + robertoLuongo.complainToRef("you're softer than 10 ply bud"));

        BackupGoalie ronLaflamme = new BackupGoalie("Ron", "Laflamme", "right",
                "Sudbury Coronas", "right", "standup", 0, 0,
                0.867, 5.08, true);
        ronLaflamme.fetchWater();
    }
}
