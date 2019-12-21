# Outfit Generator

This application takes user input for some information (season, style, and gender) before attempting to configure an outfit for the user. With this in mind, an OutfitGenerator instance asks for these before generating what is in the Closet and picking something out. 

### Object Hierarchy 

I've set this up to run from a Main class if somebody wanted to run multiple tests back to back - it instantiates an OutfitGenerator object that runs the generator to ask questions that checks the input after every question. If the input wasn't valid, it chooses a random value available in the array to ensure an error-free configuration. 

After obtaining all of the info, the OutfitGenerator creates an Outfit object which generates the Closet and grabs the random ArticleOfClothing objects before calling Outfit.isGoodOutfit(with user season/style/gender inputs) and remains in a while loop until a successful outfit is created. 

There are 5 Abstract classes that inherit the ArticleOfClothing class (which in itself implements the ClothesInterface). The ArticleOfClothing's child classes are:

- Accessory (abstract)
  - Earrings
  - Necklace
  - Ring
  - Rolex
  - Sunglasses
  - Tie
  - Watch
- Outerwear (abstract)
  - Blazer
  - GucciOvercoat
  - Parka
  - SpringCoat
  - TrenchCoat
  - Vest
  - WinterJacket
- Pants (abstract)
  - Capris
  - Jeans
  - Joggers
  - Khakis
  - Shorts
  - Skirt
  - Slacks
- Shirt (abstract)
  - ButtonUpShirt
  - Jersey
  - SleevelessShirt
  - Sweater
  - Tshirt
  - TubeTop
  - Turtleneck
- Shoes (abstract)
  - DressShoes
  - Heels
  - RunningShoes
  - Sandals
  - SnowBoots
  - SteelToedBoots
  - Timberlands
  
Every article of clothing has 4 attributes: the season it's worn in, its color, its style, and which gender the clothing is intended for. Doing this allowed me to keep the code structure simple and resuable for each child class while still being controllable from a higher level.

As mentioned earlier I've got a couple other classes working in the background:

- Main
- OutfitGenerator
- Closet
- Outfit
- ArticleOfClothing (implements ClothesInterface)

### Outfit Rules

Beyond the three requirements given by the user, there are other requirements to ensure a successful generation:

- **isWearingJersey()**
  - No matter what the circumstance, if they're wearing a jersey it's an override to a successful outfit. *Note: this has been commented out as it was too easy to get a jersey, but can be re-enabled on line 102 of Outfit.java to test.*
- **isEntireOutfitPlain()**
  - This checks to see if their entire outfit is plain with an isColorful() function. Unless the outfit has some color, it will return false and the outfit won't generate.
- **isOutfitForGender(gender)**
  - Calls an isForGender function which checks to ensure the gender matches the user's input, or the clothing is unisex.
- **outfitMatchesSeason(season)**
  - I wanted my generator to have a bit more difficulty than basically a yes/no answer (if it's for cold/warm weather), so I did seasons instead. An article of clothing will either be able to be worn for one season (Spring, Summer, Fall, Winter), or every season (all). 
- **outfitMatchesStyle(style)**
  - Clothing that is formal must be worn with formal clothes; there is no "both" category for style, just casual and formal. This means that a Tie(formal) cannot be worn with Jeans(casual).
- **isOutfitClashing()**
  - Some colors just don't work. Outfits that consist of Blue/Green, Brown/Purple, or Brown/Red will not work.
- **canBeWornWith(ArticleOfClothing, ArrayList<ArticleOfClothing>)**
  - Has a couple extra checks for additional rules (noting these can be overridden if a jersey is worn):
    - A GucciOvercoat must be worn with a Necklace or Rolex
    - Heels must be worn with earrings
    - A SleevelessShirt must be worn with Sandals or Shorts
    - Joggers must be worn with RunningShoes and cannot be worn with a TrenchCoat
