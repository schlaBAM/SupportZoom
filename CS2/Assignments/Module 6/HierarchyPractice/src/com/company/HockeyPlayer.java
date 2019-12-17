package com.company;

public class HockeyPlayer {

    String firstName, lastName, shoots, team;
    int goals, assists, points;

    public HockeyPlayer(String firstName, String lastName, String shoots, String team, int goals, int assists){
        this.firstName = firstName;
        this.lastName = lastName;
        this.shoots = shoots;
        this.team = team;
        this.goals = goals;
        this.assists = assists;
        points = getPoints();
    }

    private boolean canFight(){
        return getPoints() > 30;
    }

    protected void fight(HockeyPlayer player){
        if(canFight()){
            //do fighting stuff
            System.out.println(this.getName() + " currently fighting " + player.getName());
            //pretend there's fighting logic
        } else {
            System.out.println(this.getName() + " cannot fight " + player.getName() + ". You're too valuable and / or weak to fight");
        }
    }

    protected String complainToRef(String chirp){
        return chirp;
    }

    protected final int getPoints(){
        return goals + assists;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    protected void startShift(){
        // get out there
    }

    protected void endShift(){
        // get off the ice
    }
}
