public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  public Superhero(){
    this.name = "No Name";
    this.costume = "a t-shirt";
    this.weapon = "fist";
    this.life = true;
    this.weaponStrength = 0;
  }

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

  public int specialAttack(int powerLevel){
    return this.weaponStrength + (int)(Math.random() * powerLevel) + 1;
  }

  public void setWeaponStrength(){
    this.weaponStrength = ((int)(Math.random() * 10) + 1);
  }

  public void setWeaponStrength(int weaponStrength){
    this.weaponStrength = weaponStrength;
  }

  public String getWeapon(){
    return this.weapon;
  }

  public int getWeaponStrength(){
    return this.weaponStrength;
  }

  public String getName(){
    return this.name;
  }

}
