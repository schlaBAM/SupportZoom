package com.company;

public class Defense extends HockeyPlayer {

    private int hits; // for the sake of this structure only dmen can hit people

    public Defense(String firstName, String lastName, String shoots, String team, int goals, int assists, int hits) {
        super(firstName, lastName, shoots, team, goals, assists);
        this.hits = hits;
    }

    public void clearCrease(){
        // get those idiots away from your goalie
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }


    protected void fight(HockeyPlayer player){
        if(hits > 15){
            //do fighting stuff
            System.out.println(this.getName() + " currently fighting " + player.getName());
            //pretend there's fighting logic
        } else {
            System.out.println(this.getName() + " cannot fight " + player.getName() + ". You're too valuable and / or weak to fight");
        }
    }


}
