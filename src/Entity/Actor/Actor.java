import Entity.Entity;

public abstract class Actor extends Entity{
    private Arcana Arcana; public Arcana getArcana(){return Arcana;} public void setArcana(Arcana Arcana){this.Arcana = Arcana;}
    private int HP;
    private int MaxHP;
    private int SP;
    private int MaxSP;
    private int Strength;
    private int Magic;
    private int Endurance;
    private int Agility;
    private int Luck;
    private Item.Weapon Weapon;
    
    /**
     * 01st. Physical<p>
     * 02nd. Fire (Also dictates affinity to Burn.)<p>
     * 03rd. Ice (Also dictates affinity to Freeze.)<p>
     * 04th. Electric (Also dictates affinity to Stun.)<p>
     * 05th. Wind<p>
     * 06th. Bless<p>
     * 07th. Curse<p>
     * 08th. Poison<p>
     * 09th. Sleep<p>
     * 10th. Dizzy<p>
     */
    private int[] Affinities;

    public Actor(String Name, Arcana Arcana){
        super(Name);
    }

    @Override
    public String toString(){
        return Name + "(" + Arcana + ")";
    }
}