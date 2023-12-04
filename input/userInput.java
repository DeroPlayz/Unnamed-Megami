package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class userInput implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {
            System.out.print("");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyCode());    
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
        }
    }
