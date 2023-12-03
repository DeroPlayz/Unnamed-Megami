package World;

public class Location{
    private String Name;
    private boolean canSave;

    public Location(String Name, boolean canSave){
        this.Name = Name;
        this.canSave = canSave;
    }

    public static final Location Home = new Location("Home", true);
    public static final Location Path = new Location("Path", false);
    public static final Location Mountain = new Location("Path", false);
}
