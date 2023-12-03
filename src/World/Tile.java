package World;

import static lib.MafLib.*;

public class Tile{
    private String Name;
    private boolean canSave;
    private String Letter; public String getLetter(){return Letter;}
    private String Style;

    public Tile(String Name, boolean canSave, String Letter, String Style){
        this.Name = Name;
        this.canSave = canSave;
        this.Letter = Letter;
        this.Style = Style;
    }

    public Tile(String Name, boolean canSave, String Letter){
        this.Name = Name;
        this.canSave = canSave;
        this.Letter = Letter;
        this.Style = RESET;
    }

    public String toString(){
        return Style + Letter + RESET;
    }

    public static final Tile Home = new Tile("Home", true, "H", CYAN);
    public static final Tile Path = new Tile("Path", false, "P", YELLOW);
    public static final Tile Mountain = new Tile("Path", false, "M", BLACK);
    
    
    public static final Tile Coliseum = new Tile("Spirit Coliseum", false, "SC", BLUE);
        public static final Tile SCWall = new Tile("Wall", false, "W", BLUE);
    
    public static final Tile Prison = new Tile("Prison of Lies", false, "PL", RED);
        public static final Tile PLWall = new Tile("Wall", false, "W", RED);
    
    public static final Tile Palace = new Tile("Palace of Wrath", false, MAGENTA);
        public static final Tile PWWall = new Tile("Wall", false, "W", MAGENTA);
    
    public static final Tile Centralis = new Tile("Centralis Genesis", false, "CG", CYAN);
        public static final Tile CGWALL = new Tile("Wall", false, "W", CYAN);
}