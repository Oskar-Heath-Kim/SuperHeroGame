public class Main {

  public static void main(String[] args) {
    Superhero spiderman1 = new Superhero("Spiderman", "Red suit", "Super Web");
    System.out.println(spiderman1);
    Superhero batman1 = new Superhero("Batman", "Batsuit", "Super Strength");
    spiderman1.loseLife();
    System.out.println(batman1);

  }

}
