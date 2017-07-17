/**
 * Created by kuwu on 2017/07/17.
 */
public class Warrior extends GameCharacter{

  private String weaponType;


  public Warrior(String name, int strength, int intelligence, String weaponType) {
    super( name, strength, intelligence );
    this.weaponType = weaponType;
  }

  public String getWeaponType() {
    return weaponType;
  }

  public void setWeaponType(String weaponType) {
    this.weaponType = weaponType;
  }

  @Override
  public void Play() {
    super.Play();
    System.out.println("Weapon Type: "+weaponType+"\n");
  }
}


