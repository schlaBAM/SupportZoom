package outfit;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OutfitGenerator {

    protected enum Season {SPRING, SUMMER, FALL, WINTER}
    protected enum Style {FORMAL, CASUAL}

    public void runGenerator(){

        Scanner scan = new Scanner(System.in);

        // intro + get season
        System.out.println("\n----- Welcome to the Outfit Generator! -----\n\n" +
                "Before suggesting an outfit we'll ask a few questions:\n\n" +
                "For what season is this outfit for?\n"
                + getSeasons());

        // get season input
        String season = checkInput(scan.nextLine(), "season");


        // ask to select available style for season
        System.out.println("\nWhat style are you wanting to wear?\n" + getStyles());

        // get style input
        String style = checkInput(scan.nextLine(), "style");

        // ask gender - 3 options (male, female, skip - will provide only unisex outfits)
        System.out.println("\nWhat is your gender? \n" +
                "Male\nFemale\nSkip (choosing this will only provide unisex options)\n ");

        // get gender input
        String gender = checkInput(scan.nextLine(), "gender");

        //generate outfit from closet with above params
        System.out.println(createOutfit(season, style, gender));
    }

    private String checkInput(String input, String paramToCheck){

        input = input.toLowerCase();

        switch(paramToCheck){
            case "season":
                String[] seasons = new String[]{"spring", "summer", "fall", "winter"};
                if(input.equals(seasons[0]) || input.equals(seasons[1]) || input.equals(seasons[2]) || input.equals(seasons[3])){
                    return input;
                } else {
                    Random rand = new Random();
                    return seasons[rand.nextInt(seasons.length)];
                }
            case "style":
                String[] styles = new String[]{"casual", "formal"};
                if(input.equals(styles[0]) || input.equals(styles[1])){
                    return input;
                } else {
                    Random rand = new Random();
                    return styles[rand.nextInt(styles.length)];
                }
            case "gender":
                String[] genders = new String[]{"male", "female", "skip"};
                if(input.equals(genders[0]) || input.equals(genders[1]) || input.equals(genders[2])){
                    return input;
                } else {
                    Random rand = new Random();
                    return genders[rand.nextInt(genders.length)];
                }
            default:
                System.out.println("Not sure how you got here. Well done.");
                return "";
        }
    }

    // tried making a single func for next two functions but became far too complex.
    private String getSeasons(){

        String result = "";
        for(Season season : Season.values()){
            String seasonString = season.toString();
            result += seasonString.substring(0,1) + seasonString.substring(1).toLowerCase() + "\n";
        }
        return result;
    }

    private String getStyles(){
        String result = "";
        for(Style style : Style.values()){
            String styleString = style.toString();
            result += styleString.substring(0,1) + styleString.substring(1).toLowerCase() + "\n";
        }
        return result;
    }

    private String createOutfit(String season, String style, String gender){

        ArrayList<ArrayList<ArticleOfClothing>> closet = Closet.generateCloset();
        Outfit outfit = new Outfit();
        Random rand = new Random();
        boolean foundOutfit = false;
        int count = 0;

        while(!foundOutfit) {
            count++;
            for (ArrayList<ArticleOfClothing> list : closet) {
                int index = rand.nextInt(list.size());
                outfit.clothes.add(list.get(index)); // add random article of clothing from each list to outfit
            }

        // does checks on articles of clothing + ensures correct params
            foundOutfit = outfit.isGoodOutfit(season, style, gender);
            if(!foundOutfit) {outfit.clothes.clear();}
        }

        String result = "\nAfter " + count + " attempts, we have found your perfect outfit!" +
                "\nYou requested " + style + " clothes for " + season + ". Here's what you'll be wearing:\n";

        for(ArticleOfClothing c : outfit.clothes){
            result += "\t" + c.toString() + "\n";
        }

        result += "Enjoy! You look great.";

        return result;
    }
}
