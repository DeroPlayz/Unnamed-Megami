package World;

import java.util.HashMap;

public class Map {
    private String Name; public void setName(String s){Name = s;} public String getName(){return Name;}
    private int X1;
    private int X2;
    private int Z1;
    private int Z2;
    HashMap<Location, int[]> Places = new HashMap<>();

    public void add(Location L, int[] xz){
        Places.put(L, xz);
    }

    public Map(String Name, int X1, int X2, int Z1, int Z2){
        this.Name = Name;
        this.X1 = X1;
        this.X2 = X2;
        this.Z1 = Z1;
        this.Z2 = Z2;
    }
    
    public static Map World = new Map("World Map", 0, 150, 0, 150);
    {{
        World.add(Location.Home, new int[] {72, 77});
    }}
    // public static Map SpiritColiseum = new Map("The Spirit Coliseum", 50, )
}