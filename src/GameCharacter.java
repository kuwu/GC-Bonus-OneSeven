import java.util.ArrayList;
import java.util.List;

/**
 * Created by kuwu on 2017/07/17.
 */
public abstract class GameCharacter {

  private String name;
  private int strength;
  private int intelligence;


  public GameCharacter(String name, int strength, int intelligence) {
    this.name = name;
    this.strength = strength;
    this.intelligence = intelligence;
  }

//
//  public static void main(String[] args) {
//
//
//    Warrior one = new Warrior( "Smash", 18, 3, "Sword" );
//    Warrior two = new Warrior( "Shiv", 14, 2, "Dagger" );
//    Wizard three = new Wizard( "Zap", 2, 26, 20, 28 );
//    Wizard four = new Wizard( "Splash", 4, 18, 19, 26 );
//    Wizard five = new Wizard( "Toast", 3, 22, 21, 19 );
//
//    List<GameCharacter> gameCharacters = new ArrayList<GameCharacter>();
//    gameCharacters.add( one );
//    gameCharacters.add( two );
//    gameCharacters.add( three );
//    gameCharacters.add( four );
//    gameCharacters.add( five );
//
//    for (GameCharacter game: gameCharacters) {
//          game.Play();
//    }
//
//  }



  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public void Play() {

    System.out.println("Name: "+name);
    System.out.println("Strength: "+strength);
    System.out.println("Intelligence: "+intelligence);



  }

}


