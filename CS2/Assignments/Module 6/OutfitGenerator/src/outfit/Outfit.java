package outfit;

import java.util.ArrayList;

public class Outfit extends OutfitGenerator {

   protected enum Season {SPRING, SUMMER, FALL, WINTER}

    protected enum Style {FORMAL, CASUAL} //TODO

    String season, color, style, gender;
    ArrayList<ArticleOfClothing> clothes = new ArrayList<>();

    public Outfit(String season, String style, String color, String gender){
        this.season = season;
        this.style = style;
        this.color = color;
        this.gender = gender;
    }

    public boolean isColorful(){
        return this.color != "plain";
    }

    public boolean isCasualStyle(){
        return this.style == "casual";
    }

    public boolean isForGender(ArticleOfClothing article){
        return article.getGender() == this.gender || article.getGender() == "both";
    }

    public boolean isEntireOutfitPlain(){
        return false; //TODO
    }

    public boolean canBeWornWith(ArticleOfClothing a, ArticleOfClothing b){
        /*
        A shirt that is not good with dress shoes shouldn’t be worn with dress shoes
A winter jacket shouldn’t be worn with shorts
A tie shouldn’t be worn with jeans
Blue and green together should be avoided
         */
    return false;
    }

    public boolean areComplimentingColors(){
        boolean blueFound = false, greenFound = false, redFound = false, brownFound = false, blackFound = false, purpleFound = false;

        for(ArticleOfClothing a : this.clothes){} //TODO
        return false;
    }
//    public boolean isNotNaked();

    protected int getSize(){
        return 0;
    }

    // tried making a single func for next two functions but became far too complex.
    protected static String getSeasons(){

        String result = "";
        for(Season season : Season.values()){
            String seasonString = season.toString();
            result += seasonString.substring(0,1) + seasonString.substring(1).toLowerCase() + "\n";
        }
        return result;
    }

    protected static String getStyles(){
        String result = "";
        for(Style style : Style.values()){
            String styleString = style.toString();
            result += styleString.substring(0,1) + styleString.substring(1).toLowerCase() + "\n";
        }
        return result;
    }

    protected ArrayList<ArrayList<ArticleOfClothing>> createOutfit(){
        return Closet.generateCloset();
    }

//    @Override
//    public boolean canBeWornWith() {
//        return false;
//    }
//
//    @Override
//    public boolean isGoodCombo() {
//        return false;
//    }
//
//    @Override
//    public boolean areComplimentingColors() {
//        return false;
//    }
//
//    @Override
//    public boolean isNotNaked() {
//        return false;
//    }
}
