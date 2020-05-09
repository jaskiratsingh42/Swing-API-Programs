package core;

import java.applet.*;
import java.awt.*;

public class AppletMondrian extends Applet {
    public void init(){
        System.out.println(">>> init <<<");
        setBackground(Color.black);
    }
public void start(){
    System.out.println(">>> start <<<");
}
public void paint(Graphics g) {
    System.out.println(">>> paint <<<");
    
    g.setColor(Color.yellow);
    g.fillRect(0, 0, 90, 90);
    g.fillRect(250, 0, 40, 190);
    g.fillRect(80, 110, 100, 20);
    
    g.setColor(Color.blue);
    g.fillRect(80, 200, 220, 90);
    g.fillRect(100, 10, 90, 80);
    
    g.setColor(Color.lightGray);
    g.fillRect(80, 100 , 110,90);
    
     g.setColor(Color.red);
    g.fillRect(200, 0, 45, 45);
    g.fillRect(0, 100, 90, 80); 
   
    
}
 public void stop() {
     System.out.println(">> stop <<");
 }   
   public void destroy() { 
     System.out.println(">> destroy <<");  
   }
}
