package com.company;

public class Goalie extends HockeyPlayer {

    private boolean isPulled;
    private String catches, stance;
    private double savePercentage, goalsAgainstAverage;

    public Goalie(String firstName, String lastName, String shoots, String team, String catches, String stance, int goals, int assists, double savePercentage, double goalsAgainstAverage) {
        super(firstName, lastName, shoots, team, goals, assists);
        this.catches = catches;
        this.stance = stance;
        this.goalsAgainstAverage = goalsAgainstAverage;
        this.savePercentage = savePercentage;
        isPulled = false; // goalie always starts in net
    }

    protected void stackPads(){
        //make a killer save maybe
        System.out.println("GREAT SAAAAAVE " + lastName.toUpperCase());
    }

    protected void gloveSave(){
        //flash the leather
    }

    protected boolean pullGoalie(){
        return !isPulled;
    }

    protected boolean isPulled() {
        return isPulled;
    }

    protected void setPulled(boolean pulled) {
        isPulled = pulled;
    }

    protected String getCatches() {
        return catches;
    }

    protected void setCatches(String catches) {
        this.catches = catches;
    }

    protected String getStance() {
        return stance;
    }

    protected void setStance(String stance) {
        this.stance = stance;
    }

    public double getSavePercentage() {
        return savePercentage;
    }

    public void setSavePercentage(double savePercentage) {
        this.savePercentage = savePercentage;
    }


    public double getGoalsAgainstAverage() {
        return goalsAgainstAverage;
    }

    public void setGoalsAgainstAverage(double goalsAgainstAverage) {
        this.goalsAgainstAverage = goalsAgainstAverage;
    }
}
