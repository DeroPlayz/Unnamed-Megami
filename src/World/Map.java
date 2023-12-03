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
    /*Y=23*/
    /*Y=24*/
    /*Y=25*/
    /*Y=26*/
    /*Y=27*/
    /*Y=28*/
    /*Y=29*/
    /*Y=30*/
    /*Y=31*/
    /*Y=32*/
    /*Y=33*/
    /*Y=34*/
    /*Y=35*/
    /*Y=36*/
    /*Y=37*/
    /*Y=38*/
    /*Y=39*/
    /*Y=40*/
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