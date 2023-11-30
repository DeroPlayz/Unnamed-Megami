

public class Status {
    private String Name;
    private boolean CanAct;
    private int DMG;
    private int Duration;

    public Status(String Name, boolean CanAct, int DMG, int Duration){
        this.Name = Name;
        this.CanAct = CanAct;
        
        /* Percent of target's max health for damage. Example: An entity with 40 max health
         * afflicted with an ailment that has a DMG of 50 will take 20 damage each turn.
        */
            this.DMG = DMG;
    }

    public static Status Normal = new Status("Normal", true, 0);
    public static Status Sleep = new Status("Sleepy", false, 0);
    public static Status Stun = new Status("Stunned", false, 3);
}
