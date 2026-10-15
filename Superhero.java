public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  public Superhero(String name, String costume, String weapon){
    this.name = name;
    this.costume = costume;
    this.weapon = weapon;
    this.life = true;
    this.weaponStrength = (int)(Math.random() * 10) + 1;
  }

  public Superhero(String name, String costume, String weapon, int weaponStrength){
    this.name = name;
    this.costume = costume;
    this.weapon = weapon;
    this.life = true;
    this.weaponStrength = weaponStrength;
  }

  void loseLife(){
    life = false;
  }

  public String toString(){
    String superHeroDetails = "Superhero details \n" + "name: " + name + "\ncostume: " + costume + "\nweapon: " + weapon + "\nlife: " + life + "\nweapon strength: " + weaponStrength + "\n";
    return superHeroDetails;
  }

  public String getWeapon(){
    return this.weapon;
  }



}
