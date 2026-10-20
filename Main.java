public class Main {
  static String superheroFight(Superhero superhero1, Superhero superhero2){
    if(superhero1.getWeaponStrength() > superhero2.getWeaponStrength()){
      return superhero1.getName() + " is the winner!";
    }
    else if (superhero2.getWeaponStrength() > superhero1.getWeaponStrength()){
      return superhero2.getName() + " is the winner!";
    }
    else{
      return "draw";
    }
  }

  public static void main(String[] args) {
    Superhero spiderman1 = new Superhero("Spiderman", "Red suit", "Super Web");
    System.out.println(spiderman1);
    Superhero batman1 = new Superhero("Batman", "Batsuit", "Super Strength");
    spiderman1.loseLife();
    System.out.println(batman1);
    System.out.println(superheroFight(spiderman1, batman1));

    Superhero placeholder = new Superhero();
    Superhero batman = new Superhero("Batman", "Batsuit","Batarang");
    Superhero spiderman = new Superhero("Spiderman", "Redsuit","Superweb");
    System.out.println(spiderman.toString());
    System.out.println(batman.toString());
  }

}
