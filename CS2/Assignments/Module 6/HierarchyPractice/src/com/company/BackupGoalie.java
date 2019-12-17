package com.company;

public class BackupGoalie extends Goalie {

    public boolean onTheBench;
    public boolean beerInHand;

    public BackupGoalie(String firstName, String lastName, String shoots, String team, String catches, String stance, int goals, int assists, double savePercentage, double goalsAgainstAverage, boolean onTheBench) {
        super(firstName, lastName, shoots, team, catches, stance, goals, assists, savePercentage, goalsAgainstAverage);
        this.onTheBench = onTheBench;
        beerInHand = onTheBench ? true : false;
    }

    public void openBenchDoor(){
        // get those teammates off before we get a too many men penalty
    }

    public void fetchWater(){
        // fill up the bottles for the boys
    }
}
