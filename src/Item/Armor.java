package Item;

public class Armor extends Equipment{
    private int StrengthMod = 0;
    private int MagicMod = 0;
    private int EnduranceMod = 0;
    private int AgilityMod = 0;
    private int LuckMod = 0;
    
    public Armor(String Name, double Value, int StrengthMod, int MagicMod, int EnduranceMod, int AgilityMod, int LuckMod) {
        super(Name, Value);
        this.StrengthMod = StrengthMod;
        this.MagicMod = MagicMod;
        this.EnduranceMod = EnduranceMod;
        this.AgilityMod = AgilityMod;
        this.LuckMod = LuckMod;
    }
}
