/**
 * Created by kuwu on 2017/07/17.
 */
public class MagicUsingClass extends GameCharacter{

  private int magicalEnergy;

  public MagicUsingClass(String name, int strength, int intelligence, int magicalEnergy) {
    super( name, strength, intelligence );
    this.magicalEnergy = magicalEnergy;
  }


  public int getMagicalEnergy() {
    return magicalEnergy;
  }

  public void setMagicalEnergy(int magicalEnergy) {
    this.magicalEnergy = magicalEnergy;
  }

  @Override
  public void Play() {
    super.Play();
    System.out.println("MagicalNumber: "+magicalEnergy);
  }
}
