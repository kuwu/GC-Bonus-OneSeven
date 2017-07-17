/**
 * Created by kuwu on 2017/07/17.
 */
public class Wizard extends MagicUsingClass{

  private int spellNumber;

  public Wizard(String name, int strength, int intelligence, int spellNumber, int magicalEnergy) {
    super( name, strength, intelligence, magicalEnergy);
    this.spellNumber = spellNumber;
  }


  public int getSpellNumber() {
    return spellNumber;
  }

  public void setSpellNumber(int spellNumber) {
    this.spellNumber = spellNumber;
  }

  @Override
  public void Play() {
    super.Play();
    System.out.println("SpellNumber: "+spellNumber+"\n");
  }
}
