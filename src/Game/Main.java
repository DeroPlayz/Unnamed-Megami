package Game;

import java.awt.Cursor;
import java.awt.Window.Type;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

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
    
    public static void main(String[] args) throws IOException{
        // LS();
        // act();
        JFrame frame = new JFrame();
        BufferedImage icon = ImageIO.read(new File("src/icon.png"));
        JLabel title = new JLabel("UNNAMED MEGAMI - BETA");
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setFocusable(true);
        frame.setAutoRequestFocus(true);
        frame.setTitle("UNNAMED-MEGAMI (NOT FINISHED) [DO NOT DISTRIBUTE]");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setIconImage(icon);
        frame.add(title);
        frame.setLayout(null);
        title.setBounds(700, 100, 200, 10);
        
        frame.addMouseMotionListener((MouseMotionListener) new MouseMotionListener() {
            @Override
            public void mouseMoved(MouseEvent e) {
            }

            @Override
            public void mouseDragged(MouseEvent e) {
            }
        });
    }
}