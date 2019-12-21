package outfit;

import java.util.ArrayList;

public class Outfit {

    protected ArrayList<ArticleOfClothing> clothes = new ArrayList<>();

    public Outfit(){}

    public Outfit(ArrayList<ArticleOfClothing> clothes){
        this.clothes = clothes;
    }

    private boolean isWearingJersey(){
        for (ArticleOfClothing a : clothes) {
            if (a.getClass().getSimpleName().equals("Jersey")) {
                return true;
            }
        }
        return false;
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
                if (!a.isForGender(gender)) {
                    return false;
                }
            }
        }
        return true; // returns true if conditional is never met
    }

    private boolean outfitMatchesSeason(String season) {
        for (ArticleOfClothing a : clothes) {
            if (!a.getSeason().equals(season) && !a.getSeason().equals("all")) {
                return false;
            }
        }
        return true;
    }

    private boolean outfitMatchesStyle(String style){
        for (ArticleOfClothing a : clothes) {
            if (!a.getStyle().equals(style)) {
                return false;
            }
        }
        return true;
    }

    private boolean isOutfitClashing(){
        boolean blueArticle = false, greenArticle = false, brownArticle = false, purpleArticle = false, redArticle = false;

        for (ArticleOfClothing a : clothes) {
            switch(a.getColor()){
                case "green":
                    greenArticle = true;
                    break;
                case "blue":
                    blueArticle = true;
                    break;
                case "brown":
                    brownArticle = true;
                    break;
                case "purple":
                    purpleArticle = true;
                    break;
                case "red":
                    redArticle = true;
                    break;
                default:
                    break;
            }
        }
        return ((blueArticle && greenArticle) || (brownArticle && purpleArticle) || (redArticle && brownArticle));
    }

    private boolean followsExtraRules(){
        for (ArticleOfClothing a : clothes) {
            if(!a.canBeWornWith(clothes)){
                return false;
            }
        }
        return true;
    }

    public boolean isGoodOutfit(String season, String style, String gender){

        //if(isWearingJersey()) return true; // no matter what they're wearing a jersey is an override

        if(isEntireOutfitPlain()) return false;

        if(!isOutfitForGender(gender)) return false;

        if(!outfitMatchesSeason(season)) return false;

        if(!outfitMatchesStyle(style)) return false;

        if(isOutfitClashing()) return false;

        if(!followsExtraRules()) return false;

        return true;
    }

}
