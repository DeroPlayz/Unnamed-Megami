package World;
import static World.Location.*;

public class Map {
    private String Name; public void setName(String s){Name = s;} public String getName(){return Name;}
    private Location[][] Places;

    public Map(String Name, Location[][] Places){
        this.Name = Name;
        this.Places = Places;
    }

    public static Map World = new Map("World Map", new Location[][]{{Wall, Wall, Wall, Wall, Wall, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path}});
    
    public String toString(){
        String s = "";
        for(int i = 0; i < Places.length; i++){
            for(int j = 0; j < Places[i].length; j++){
                s += Places[i][j];
            }
            s += "\n";
        }
        return s;
    }
}