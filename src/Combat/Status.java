package Combat;


public class Status {
    private String Name;
    private boolean CanAct;
    private int DMG;
    
    /**
     * @param Name - The name displayed for the status.
     * @param CanAct - Whether or not the status prevents the target from acting in combat.
     * @param DMG - What percent of the target's max health is dealt as damage to them. I.e, on a target with 40 max HP, DMG 50 would makwe
     */
    public Status(String Name, boolean CanAct, int DMG){
        this.Name = Name;
        this.CanAct = CanAct;
        this.DMG = DMG;
    }

    //Existing
    public static Status Alive = new Status("Alive", true, 0);
    public static Status Dead = new Status("Dead", false, 0);

    //Elemental
    public static Status Burn = new Status("Burning", true, 6);
    public static Status Freeze = new Status("Frozen", false, 0);
    public static Status Stun = new Status("Stunned", false, 3);

    //Ailing
    public static Status Sleep = new Status("Sleepy", false, 0);
    public static Status Dizzy = new Status("Dizzy", true, 0);    
}
