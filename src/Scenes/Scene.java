package Scenes;

public class Scene {
    private String name; public void setName(String name){this.name = name;} public String getName(){return name;}
    public Scene(String name){
        this.name= name;
    }
    public static Scene Title = new Scene("Title");
}
