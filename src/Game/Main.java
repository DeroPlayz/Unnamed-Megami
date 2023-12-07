package Game;

import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
import java.util.concurrent.CountDownLatch;
import static lib.MafLib.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import java.util.Properties;
import Item.Item;
import Scenes.Scene;
import lib.MafLib;
import Entity.Actor.Player;
import static Scenes.Scene.*;
import static World.Map.*;

// FileInputStream input = new FileInputStream("src/settings.properties");
// Properties p = new Properties();
// p.load(input);

public class Main implements Serializable{
    public static JFrame frame = new JFrame();
    public static JLabel log = new JLabel();
    public static JLabel title = new JLabel("UNNAMED MEGAMI BETA");
    public static JButton load = new JButton("Load");
    public static JButton start = new JButton("New");
    public static JButton settings = new JButton("Settings");

    public static Player player = new Player();
    static final String Save = "Save";
        
    public static void main(String[] args) throws IOException{
        returnToTitle();
        
    }

    public static void newGame(){
        MafLib.askString("<html>Initializing new save.<br>What is your name?<br>Note: Separate first and last name with a space. (\" \")");
        MafLib.response.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 10){
                    String ans = response.getText();
                    player = new Player(ans);
                    saveGame();
                }
                
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
            }
        
        });
        
    }

    public static void saveGame(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Save))) {
            out.writeObject(player.getFirst());
            //System.out.println(player.getFirst());
            out.writeObject(player.getLast());
            //System.out.println(player.getLast());
            out.writeObject(player.getInventory());
            //System.out.println(player.getInventory());
            out.writeObject(player.getCash());
            //System.out.println(player.getCash());
            log.setText("<html>Saved successfully.<br>" + player);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    public static void loadGame() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(Save))) {
            player.setFirst((String) in.readObject());
            player.setLast((String) in.readObject());
            player.setName(player.getFirst() + " " + player.getLast());
            player.setInventory((Item[]) in.readObject());
            player.setCash((double) in.readObject());
            log.setText("<html>Save loaded.<br>" + player.toString());
        } catch (IOException | ClassNotFoundException e) {
            MafLib.askString("<html>Error. Corrupted/non-existent save. Initializing new save.<br>What is your name?<br>Note: Separate first and last name with a space. (\" \")");
            player = new Player(MafLib.response.getText());
        }
    }

    public static void settings(){
        log.setText("What setting would you like to change?");
        openSettings(Title);
    }

    public static void clearScreen(){
        Component[] components = frame.getContentPane().getComponents();
        for(int i = 0; i < components.length; i++){
            frame.remove(components[i]);
            frame.revalidate();
            frame.repaint();
        }
    }
    public static void returnToTitle(){
        clearScreen();
        frame.add(start);
        frame.add(load);
        frame.add(title);
        frame.add(settings);
        BufferedImage icon;
        try {
            icon = ImageIO.read(new File("src/icon.png"));
            frame.setIconImage(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setFocusable(true);
        frame.setAutoRequestFocus(true);
        frame.setTitle("UNNAMED-MEGAMI (NOT FINISHED) [DO NOT DISTRIBUTE]");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        JPanel panel = new JPanel();
        
        panel.setLayout(new GridBagLayout());
        frame.getContentPane().add(panel);
        frame.add(title, BorderLayout.NORTH);
        frame.add(start, BorderLayout.CENTER);
        frame.add(load, BorderLayout.CENTER);
        frame.add(settings, BorderLayout.CENTER);
        frame.add(log, BorderLayout.WEST);
        
        title.setBounds(frame.getWidth(), 100, frame.getWidth(), 50);
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        
        
        log.setBounds(1, 0, frame.getWidth(), frame.getWidth());
        log.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        log.setVerticalAlignment(SwingConstants.TOP);

        load.setBounds(680, 275, 200, 50);
        
        start.setBounds(680, 200, 200, 50);
        
        settings.setBounds(680, 350, 200, 50);    
        
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
                settings();
            }
        });
    }

    public static void openSettings(Scene s){
        clearScreen();
        JButton back = new JButton("Back");
        JButton deleteSave = new JButton("Delete Current Save File.");
        back.setBounds(680, 400, 200, 50);
        deleteSave.setBounds(680, 500, 200, 50);
        frame.add(back);
        frame.add(deleteSave);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(s.equals(Title)){
                    returnToTitle();
                }
            }
        });
        deleteSave.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                File save = new File("Save");  
                save.delete();
                log.setText("Save deleted.");
                player = new Player();
            }
        });
    }
}