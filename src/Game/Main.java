package Game;

import java.awt.Cursor;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
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
    public static JFrame frame = new JFrame();
    public static JLabel log = new JLabel();
    public static JTextField response = new JTextField();

    public static Player player = new Player();
    static final String Save = "Save";
        
    public static void main(String[] args) throws IOException{
        // LS();
        // act();
        BufferedImage icon = ImageIO.read(new File("src/icon.png"));
        JLabel title = new JLabel("UNNAMED MEGAMI BETA");
        JButton load = new JButton("Load");
        JButton start = new JButton("New");
        JButton settings = new JButton("Settings");
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setFocusable(true);
        frame.setAutoRequestFocus(true);
        frame.setTitle("UNNAMED-MEGAMI (NOT FINISHED) [DO NOT DISTRIBUTE]");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setIconImage(icon);
        frame.setLayout(null);
        frame.add(title);
        frame.add(load);
        frame.add(start);
        frame.add(settings);
        frame.add(log);
        frame.add(response);
        title.setBounds(700, 100, 200, 10);
        load.setBounds(680, 200, 200, 50);
        start.setBounds(680, 250, 200, 50);
        settings.setBounds(680, 300, 200, 50);
        log.setBounds(1, 0, frame.getWidth(), 20);
        response.setBounds(680, 500, 200, 20);

        response.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadGame();
            }

        });
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newGame();
            }
        });
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                player.settings();
            }
        });
        frame.addMouseMotionListener((MouseMotionListener) new MouseMotionListener() {
            @Override
            public void mouseMoved(MouseEvent e) {
            }

            @Override
            public void mouseDragged(MouseEvent e) {
            }
        });
    }

    public static void act(){
        player.act();
    }
    
    public static void newGame(){
        player = new Player(MafLib.askString("Initializing new save.\nWhat is your first name? ", false), MafLib.askString("What is this your last name? ", false));
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
            log.setText("Save loaded.");
        } catch (IOException | ClassNotFoundException e) {
            player = new Player(MafLib.askString("Error. Corrupted/non-existent save. Initializing new save.\nWhat is your first name? ", false), MafLib.askString("What is this your last name? ", false));
        }
    }
}