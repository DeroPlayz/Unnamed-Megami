package Entity;

public class Ally extends Entity{

    public Ally(String Name, int Level, int MaxHP, int MaxSP, Arcanum.Arcana Arcana){
        super(Name, Arcana);
        this.Level = Level;
        this.MaxHP = MaxHP;     HP = MaxHP;
        this.MaxSP = MaxSP;     SP = MaxSP;
        this.Arcana = Arcana;
    }

    @Override
    public String toString() {
        String s = "Name: " + Name + " | Level " + Level + " (" + Arcana + ")\n";
        s += "Health: " + HP + "/" + MaxHP + "\nSP: " + SP + MaxSP;
        s += "\nStrength: " + Strength + "\nMagic: " + Magic + "\nEndurance: " + Endurance + "\nAgility: " + Agility + "\nLuck: " + Luck;
        return s; 
    }
    
}
