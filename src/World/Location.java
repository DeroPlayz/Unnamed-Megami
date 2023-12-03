package World;

public class Location{
    private String Name;
    private boolean canSave;
    private String letter;

    public Location(String Name, boolean canSave, String Letter){
        this.Name = Name;
        this.canSave = canSave;
    }

    public String toString(){
        return letter;
    }

    public static final Location Home = new Location("Home", true, "H");
    public static final Location Path = new Location("Path", false, "P");
    public static final Location Mountain = new Location("Path", false, "M");
    public static final Location Wall = new Location("Wall", false, "W");
}