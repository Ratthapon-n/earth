
package Display;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;





public class Game extends JPanel implements ActionListener, KeyListener{
    int x,y,velx,vely,x2,y2,velx2,vely2;
    
    boolean UP1,R1,L1,D1;  // for Player 1
    boolean UP2,R2,L2,D2;
    Timer t = new Timer(1,this);
    
    public Game(){
      
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        x= 100;
        y= 260;
        
        x2 = 300;
        y2=260;
    }
    
    public void paintComponent(Graphics dg){
        super.paintComponent(dg);
        dg.setColor(Color.RED);
        dg.fillRect(x, y, 50, 50);  // player 1
        dg.setColor(Color.BLUE);
        dg.fillRect(x2,y2,50,50);   // player 2
        dg.setColor(Color.GREEN);
        dg.fillRect(0,310,650,40); // Ground
        t.start();
    }

    
    public void actionPerformed(ActionEvent e){
        //Player 1 
        //RIGHT 1 -->
        if(x>=590){
                if(L1){
                    x += velx;
                    L1 = false; 
                }
                else{velx=0;}
            }
        //LEFT 1 <--
        if(x <= 0){
            if(R1){
                x += velx;
                R1 = false;}
                else{velx=0;}
            }
        
        // TOP 1 ^
        if(y <= 0){
            if(D1){
                y += vely;
                D1 = false;
            }
            else{vely = 0;}
        }
        // BOTTOM 1 v
        if(y >= 260){
            if(UP1){
                y += vely;
                UP1 = false;
            }
            else{
                vely = 0;
            }
        }
        
        //Player 2
        //RIGHT 2 -->
        if(x2 >= 590){
            if(L2){
                x2 += velx2;
                L2 = false;
            }
            else{velx2=0;}
        }
        // LEFT <--
        if(x2 <= 0){
            if(R2){
                x2 += velx2;
                R2 = false;
            }
            else{velx2=0;}
        }
        // TOP 2 ^
        if(y2 <= 0){
            if(D2){
                y2 += vely2;
                D2 = false;
            }
            else{vely2 = 0;}
        }
        // BOTTOM 2 v
        if(y2 >= 260){
            if(UP2){
                y2 += vely2;
                UP2 = false;
            }
            else{
                vely2 = 0;
            }
        }


        x += velx;
        y += vely;
        x2 += velx2;
        y2 += vely2;


        repaint();
    }


    
    public void keyPressed(KeyEvent e){
        int c = e.getKeyCode();
        // Player 1
        if( c == KeyEvent.VK_J){
            L1 = true;
            velx = -1;
            vely = 0;
        }
        if( c== KeyEvent.VK_I){
            UP1 = true;
            velx = 0;
            vely = -1;
        }
        if( c== KeyEvent.VK_L){
            R1 = true;
            velx = 1;
            vely = 0;
        }
        if(c == KeyEvent.VK_K){
            D1 = true;
            velx = 0;
            vely = 1;
        }
        //Player 2
        if( c == KeyEvent.VK_A){
            L2 = true;
            velx2 = -1;
            vely2 = 0;
        }
        if( c== KeyEvent.VK_W){
            UP2 = true;
            velx2 = 0;
            vely2= -1;
        }
        if( c== KeyEvent.VK_D){
            R2 = true;
            velx2 = 1;
            vely2 = 0;
        }
        if( c == KeyEvent.VK_S){
            D2 = true;
            velx2 = 0;
            vely2 = 1;
        }
    }
    
    public void keyTyped(KeyEvent e){
     
    }
    
    public void keyReleased(KeyEvent e){
        velx = 0;
        vely = 0;
        velx2 = 0;
        vely2 = 0;
    }
   
      
}    



    

