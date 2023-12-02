package Item;

public class Armor extends Equipment{
    private int StrengthMod = 0; public int getStrengthMod(){return StrengthMod;}
    private int MagicMod = 0; public int getMagicMod(){return MagicMod;}
    private int EnduranceMod = 0; public int getEnduranceMod(){return EnduranceMod;}
    private int AgilityMod = 0; public int getAgilityMod(){return AgilityMod;}
    private int LuckMod = 0; public int getLuckMod(){return LuckMod;}
    
    public Armor(String Name, double Value, int StrengthMod, int MagicMod, int EnduranceMod, int AgilityMod, int LuckMod) {
        super(Name, Value);
        this.StrengthMod = StrengthMod;
        this.MagicMod = MagicMod;
        this.EnduranceMod = EnduranceMod;
        this.AgilityMod = AgilityMod;
        this.LuckMod = LuckMod;
    }

    Armor Clothes = new Armor("The clothes you got into after waking up.", 35.0, 0, 0, 5, 0, 0);
}
