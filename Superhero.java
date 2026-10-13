public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  // TODO #1: Add missing constructors. Note that the life attribute should default to true and the weaponStrength attribute should default to 0.
  life = true;
  weaponStrength = 0;
  // TODO #2: Add missing methods.
  void loseLife(){
    life -= 1;
  }
  // TODO #3: Including a toString() method (see topic 1.15 Strings in the CSAwesome2 textbook) to help with printing out the Superhero details.
  public String toString(){
    System.out.println("Superhero Details");
    System.out.println("name: " + name);
    System.out.println("costume: " + costume);
    System.out.println("weapon: " + weapon);
    System.out.println("life: " + life.toString());
    System.out.println("weaponStrength: " + weaponStrength.toString())
  // all your code below to create a string with details
    String superHeroDetails = "";
    return superHeroDetails;
  }
}
