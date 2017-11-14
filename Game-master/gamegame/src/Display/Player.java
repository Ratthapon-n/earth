
package Display;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;


public class Player extends JPanel implements ActionListener, KeyListener{

    public int velx,vely,x,y;
    private Image dbImage;
    private Graphics dbg;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    public void draw(Graphics dg){
         dg.setColor(Color.RED);
         dg.fillRect(x, y, 250, 250);//150,500
    }
     public void actionPerformed(ActionEvent e){
        x += velx;
        y += vely;
        repaint();
    }
    
    public void keyPressed(KeyEvent e){
        int c = e.getKeyCode();
        if( c == KeyEvent.VK_LEFT){
            velx = -1;
            vely = 0;
        }
        if( c== KeyEvent.VK_UP){
            velx = 0;
            vely = -1;
        }
        if( c== KeyEvent.VK_RIGHT){
            velx = 1;
            vely = 0;
        }
        if(c == KeyEvent.VK_DOWN){
            velx = 0;
            vely = 1;
        }
    }
    
    public void keyTyped(KeyEvent e){
         
    }
    
    public void keyReleased(KeyEvent e){
        velx = 0;
        vely = 0;
    }



}
