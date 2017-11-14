
package Display;



import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;





public class MainClass extends JFrame {
     
    public static void main(String[] args) {
        JFrame s =  new JFrame();
        s.setTitle("KUY");
        s.add(new Game());
        s.setSize(650,380);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setResizable(false); //ขยายหน้าจอไม่ได้นะ
        s.setLocationRelativeTo(null);
        s.setVisible(true);
        

        
    }
   

}
