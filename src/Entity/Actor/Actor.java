import Arcanum.Arcana;
import Entity.Entity;

public abstract class Actor extends Entity{
    protected Arcana Arcana; public void setArcana(Arcana Arcana){this.Arcana = Arcana;} public Arcana getArcana(){return Arcana;}
    protected int HP; public void setHP(int HP){this.HP = HP;} public int getHP(){return HP;}
    protected int MaxHP; public void setMaxHP(int MaxHP){this.MaxHP = MaxHP;} public int getMaxHP(){return MaxHP;}
    protected int SP; public void setSP(int SP){this.SP = SP;} public int getSP(){return SP;}
    protected int MaxSP; public void setMaxSP(int MaxSP){this.MaxSP = MaxSP;} public int getMaxSP(){return MaxSP;}
    protected int Strength; public void setStrength(int Strength){this.Strength = Strength;} public int getStrength(){return Strength;}
    protected int Magic; public void setMagic(int Magic){this.Magic = Magic;} public int getMagic(){return Magic;}
    protected int Endurance; public void setEndurance(int Endurance){this.Endurance = Endurance;} public int getEndurance(){return Endurance;}
    protected int Agility; public void setAgility(int Agility){this.Agility = Agility;} public int getAgility(){return Agility;}
    protected int Luck; public void setLuck(int Luck){this.Luck = Luck;} public int getLuck(){return Luck;}
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
    private double[] Affinities;
    private static final double Weak = 1.5;
    private static final double None = 1;
    private static final double Resist = 0.5;
    private static final double Block = 0;
    private static final double Absorb = -1;

    public Actor(String Name, Arcana Arcana){
        super(Name);
        this.Arcana = Arcana;
    }

    @Override
    public String toString(){
        return Name + "(" + Arcana + ")";
    }
}