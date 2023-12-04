package World;
import static World.Tile.*;

public class Map {
    private String Name; public void setName(String s){Name = s;} public String getName(){return Name;}
    private Tile[][] Tiles;

    public Map(String Name, Tile[][] Tiles){
    this.Name = Name;
    this.Tiles = Tiles;
    }

    public static Map World = new Map("World Map", new Tile[][]{
    /*Y=0*/     {SCWall, SCWall, SCWall, SCWall, SCWall, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, PLWall, PLWall, PLWall, PLWall, PLWall, PLWall, PLWall, PLWall},
    /*Y=1*/     {SCWall, Coliseum, Coliseum, Coliseum, SCWall, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, Prison, Prison, Prison, Prison, Prison, Prison, Prison, PLWall},
    /*Y=2*/     {SCWall, Coliseum, Coliseum, Coliseum, SCWall, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, Prison, Prison, Prison, Prison, Prison, Prison, Prison, PLWall},
    /*Y=3*/     {SCWall, Coliseum, Coliseum, Coliseum, SCWall, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, Prison, Prison, Prison, Prison, Prison, Prison, Prison, PLWall},
    /*Y=4*/     {SCWall, SCWall, SCWall, SCWall, SCWall, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, Prison, Prison, Prison, Prison, Prison, Prison, Prison, PLWall},
    /*Y=5*/     {Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, Prison, Prison, Prison, Prison, Prison, Prison, Prison, PLWall},
    /*Y=6*/     {Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, Prison, Prison, Prison, Prison, Prison, Prison, Prison, PLWall},
    /*Y=7*/     {Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, Prison, Prison, Prison, Prison, Prison, Prison, Prison, PLWall},
    /*Y=8*/     {Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, Prison, Prison, Prison, Prison, Prison, Prison, Prison, PLWall},
    /*Y=9*/     {Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, Prison, Prison, Prison, Prison, Prison, Prison, Prison, PLWall},
    /*Y=10*/    {Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, Prison, Prison, Prison, Prison, Prison, Prison, Prison, PLWall},
    /*Y=11*/    {Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, Prison, Prison, Prison, Prison, Prison, Prison, Prison, PLWall},
    /*Y=12*/    {Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, PLWall, PLWall, PLWall, PLWall, PLWall, PLWall, PLWall, PLWall, PLWall},
    /*Y=13*/    {Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Path, Path, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=14*/    {Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Mountain, Mountain, Path, Path, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=15*/    {Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Path, Path, Path, Path, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=16*/    {Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=17*/    {Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=18*/    {Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=19*/    {Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=20*/    {Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Mountain, Home, Path, Path, Path, Path, Path, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=21*/    {Path, Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=22*/    {Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=23*/    {Path, Path, Path, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=24*/    {Path, Path, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=25*/    {Path, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=26*/    {Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=27*/    {Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=28*/    {Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, PWWall, PWWall, PWWall, PWWall, PWWall, PWWall, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=29*/    {Mountain, PWWall, PWWall, PWWall, PWWall, PWWall, PWWall, Palace, Palace, Palace, Palace, PWWall, PWWall, Mountain, Mountain, Path, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=30*/    {Mountain, PWWall, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, PWWall, PWWall, PWWall, Path, Path, Mountain, Mountain, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=31*/    {Mountain, PWWall, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, PWWall, Path, Path, Path, Path, Path, Path, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=32*/    {Mountain, PWWall, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Path, Path, Path, Path, Path, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=33*/    {PWWall, PWWall, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, PWWall, PWWall, PWWall, Path, Path, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path},
    /*Y=34*/    {PWWall, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, PWWall, Mountain, Mountain, Path, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, CGWALL, CGWALL, CGWALL, CGWALL, CGWALL, CGWALL, CGWALL},
    /*Y=35*/    {PWWall, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, PWWall, PWWall, PWWall, PWWall, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, CGWALL, Centralis, Centralis, Centralis, Centralis, Centralis, CGWALL},
    /*Y=36*/    {PWWall, Palace, Palace, Palace, Palace, Palace, Palace, Palace, Palace, PWWall, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, CGWALL, Centralis, Centralis, Centralis, Centralis, Centralis, CGWALL},
    /*Y=37*/    {PWWall, PWWall, Palace, Palace, Palace, Palace, Palace, Palace, Palace, PWWall, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Centralis, Centralis, Centralis, Centralis, Centralis, Centralis, CGWALL},
    /*Y=38*/    {Mountain, PWWall, PWWall, Palace, Palace, Palace, Palace, Palace, Palace, PWWall, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, CGWALL, Centralis, Centralis, Centralis, Centralis, Centralis, CGWALL},
    /*Y=39*/    {Mountain, Mountain, PWWall, PWWall, Palace, Palace, Palace, Palace, Palace, PWWall, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, CGWALL, Centralis, Centralis, Centralis, Centralis, Centralis, CGWALL,},
    /*Y=40*/    {Mountain, Mountain, PWWall, PWWall, PWWall, PWWall, PWWall, PWWall, PWWall, PWWall, Mountain, Mountain, Mountain, Mountain, Mountain, Mountain, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, Path, CGWALL, CGWALL, CGWALL, CGWALL, CGWALL, CGWALL, CGWALL},
    });
    
    public String toString(){
        String s = "";
        for(int i = 0; i < Tiles.length; i++){
            System.out.println("Y=" + i + " Length: " + Tiles[i].length);
            for(int j = 0; j < Tiles[i].length; j++){
                s += Tiles[i][j].toString() + " ";
                if(Tiles[i][j].getLetter().length() == 1){
                    s += " ";
                }
            }
            s += "\n";
        }
        return s;
    }
}