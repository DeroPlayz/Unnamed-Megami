package Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import static input.userInput.*;
// import java.util.Properties;
import Item.Item;
import lib.MafLib;
import Entity.Actor.Player;

// import static lib.MafLib.*;
import static World.Map.*;

// FileInputStream input = new FileInputStream("src/settings.properties");
// Properties p = new Properties();
// p.load(input);

public class Main implements Serializable{
    public static Player player = new Player();
    static final String Save = "Save";
    public static void act(){
        player.act();
    }
    public static void LS(){
        String response = MafLib.askString("Would you like to load your save, or start a new one?\n1. Load\n2. New", true);
        if(response.equals("1")){
            loadGame();
        }
        else if(response.equals("2")){
            player = new Player(MafLib.askString("Initializing new save.\nWhat is your first name? ", false), MafLib.askString("What is this your last name? ", false));
        }
        else{
            LS();
        }
        
    }
    public static void saveGame(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Save))) {
            out.writeObject(player.getFirst());
            out.writeObject(player.getLast());
            out.writeObject(player.getInventory());
            out.writeObject(player.getCash());
            System.out.println("Saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void loadGame() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(Save))) {
            player.setFirst((String) in.readObject());
            player.setLast((String) in.readObject());
            player.setName(player.getFirst() + " " + player.getLast());
            player.setInventory((Item[]) in.readObject());
            player.setCash((double) in.readObject());
            System.out.println("Loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            player = new Player(MafLib.askString("Error. Corrupted/non-existent save. Initializing new save.\nWhat is your first name? ", false), MafLib.askString("What is this your last name? ", false));
        }
    }
    public static void main(String[] args) throws IOException {
        // LS();
        // saveGame();
        //act();
        System.out.println(World);
        keyPressed(KeyListener);
    }
}