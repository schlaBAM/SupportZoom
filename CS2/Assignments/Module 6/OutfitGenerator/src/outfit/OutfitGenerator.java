package outfit;

import java.util.Random;
import java.util.Scanner;

public class OutfitGenerator {

//    public OutfitGenerator(){
//
//    }

    public void runGenerator(){

        //TODO - check input, select random default if they choose an nonexistent option.

        Scanner scan = new Scanner(System.in);

        // intro + get season
        System.out.println("\n----- Welcome to the Outfit Generator! -----\n\n" +
                "Before suggesting an outfit we'll ask a few questions:\n\n" +
                "For what season is this outfit for?\n"
                + Outfit.getSeasons());

        // get season input
        String season = checkInput(scan.nextLine(), "season");


        // ask to select available style for season
        System.out.println("\nWhat style are you wanting to wear?\n" + Outfit.getStyles()+ "\n ");

        // get style input
        String style = checkInput(scan.nextLine(), "style");

        // ask gender - 3 options (male, female, skip - will provide only unisex outfits)
        System.out.println("\nWhat is your gender? \n" +
                "Male\nFemale\nSkip (choosing this will only provide unisex options)\n ");

        // get gender input
        String gender = checkInput(scan.nextLine(), "gender");

        //generate outfit from closet with above params
        Outfit outfit = new Outfit(season, style, "null", gender); //color request not necessary - initialize to null
        System.out.println(outfit.createOutfit());

    }

    private String checkInput(String input, String paramToCheck){

        input = input.toLowerCase();

        switch(paramToCheck){
            case "season":
                String[] seasons = new String[]{"spring", "summer", "fall", "winter"};
                if(input == seasons[0] || input == seasons[1] || input == seasons[2] || input == seasons[3]){
                    return input;
                } else {
                    Random rand = new Random();
                    return seasons[rand.nextInt(seasons.length)];
                }
            case "style":
                String[] styles = new String[]{"casual", "formal"};
                if(input == styles[0] || input == styles[1]){
                    return input;
                } else {
                    Random rand = new Random();
                    return styles[rand.nextInt(styles.length)];
                }
            case "gender":
                String[] genders = new String[]{"male", "female", "skip"};
                if(input == genders[0] || input == genders[1] || input == genders[2]){
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
}
