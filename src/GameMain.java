import java.util.ArrayList;
import java.util.List;

/**
 * Created by kuwu on 2017/07/17.
 */
public class GameMain {


  public static void main(String[] args) {


    Warrior one = new Warrior( "Smash", 18, 3, "Sword" );
    Warrior two = new Warrior( "Shiv", 14, 2, "Dagger" );
    Wizard three = new Wizard( "Zap", 2, 26, 20, 28 );
    Wizard four = new Wizard( "Splash", 4, 18, 19, 26 );
    Wizard five = new Wizard( "Toast", 3, 22, 21, 19 );

    List<GameCharacter> gameCharacters = new ArrayList<GameCharacter>();
    gameCharacters.add( one );
    gameCharacters.add( two );
    gameCharacters.add( three );
    gameCharacters.add( four );
    gameCharacters.add( five );

    for (GameCharacter game: gameCharacters) {
      game.Play();
    }

  }

}
