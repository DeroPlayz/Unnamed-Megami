package World;

public class Map {
    private String Name; public void setName(String s){Name = s;} public String getName(){return Name;}
    private int minX; public void setMinX(int minX){this.minX = minX;} public int getMinX(){return minX;}
    private int maxX; public void setMaxX(int maxX){this.maxX = maxX;} public int getMaxX(){return maxX;}
    private int minZ; public void setMinZ(int minZ){this.minZ = minZ;} public int getMinZ(){return minZ;}
    private int maxZ; public void setMaxZ(int maxZ) {this.maxZ = maxZ;} public int getMaxZ() {return maxZ;}

    public Map(String Name, int minX, int maxX, int minZ, int maxZ){
        this.Name = Name;
        
        this.minX = minX;
        this.maxX = maxX;
        
        this.minZ = minZ;
        this.maxZ = maxZ;
    }

    public Map(String Name){
        this.Name = Name; minX = maxX = minZ = maxZ = 0;
    }

    Map World = new Map("World Map", 0, 100, 0, 100);
    Map Home = new Map("Home");
}