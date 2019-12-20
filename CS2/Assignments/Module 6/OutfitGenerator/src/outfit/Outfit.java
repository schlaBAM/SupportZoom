package outfit;

import java.util.ArrayList;

public class Outfit {

    protected ArrayList<ArticleOfClothing> clothes = new ArrayList<>();

    public Outfit(){}

    public Outfit(ArrayList<ArticleOfClothing> clothes){
        this.clothes = clothes;
    }

    private boolean isEntireOutfitPlain() {
        for (ArticleOfClothing a : clothes) {
            if (a.isColorful()) {
                 return false;
            }
        }
        return true;
    }

    private boolean isOutfitForGender(String gender) {
        if (gender.equals("skip")) {
            return true; // all clothes will work
        } else {
            for (ArticleOfClothing a : clothes) {
                if (!a.getGender().equals(gender) && !a.getGender().equals("both")) {
                    return false;
                }
            }
        }
        return true; // returns true if conditional is never met
    }

    private boolean outfitMatchesSeason(String season) {
        for (ArticleOfClothing a : clothes) {
            if (!a.getSeason().equals(season) && !a.getGender().equals("all")) {
                return false;
            }
        }
        return true;
    }

    private boolean outfitMatchesStyle(String style){
        for (ArticleOfClothing a : clothes) {
            if (!a.getSeason().equals(style)) {
                return false;
            }
        }
        return true;
    }

    public boolean canBeWornWith(ArticleOfClothing a, ArticleOfClothing b){
        /*
        //TODO
        A shirt that is not good with dress shoes shouldn’t be worn with dress shoes (tshirt, tubetop, sleeveless)
        A winter jacket shouldn’t be worn with shorts (match on seasons)
        A tie shouldn’t be worn with jeans
        Blue and green together should be avoided
        Gucci Overcoat must be worn with necklace or rolex
         */
    return false;
    }

    public boolean isGoodOutfit(String season, String style, String gender){

        if(isEntireOutfitPlain()) return false;

        if(!isOutfitForGender(gender)) return false;

        if(!outfitMatchesSeason(season)) return false;

        if(!outfitMatchesStyle(style)) return false;

        return true;
    }

    public boolean areComplimentingColors(ArticleOfClothing a, ArticleOfClothing b){
        boolean blueFound = false, greenFound = false, redFound = false, brownFound = false, blackFound = false, purpleFound = false;

        for(ArticleOfClothing article : this.clothes){} //TODO
        return false;
    }

}
