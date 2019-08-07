
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marthakaitlingarman
 */
public class tJComponent extends JComponent {
    
  //@Override
   public void paintComponent(Graphics g) {
      //Graphics2D g2 = new Graphics2D();
      Graphics2D gd2 = (Graphics2D) g;
      /** Size of circle. */
      int c = 10; 
      /** Coordinates of start. */
      int q = 30;
      /** Size of graph box. */
      int s = 300;
      
      int x = 0; 
      int y = 0;
      
      Double[] yield = new Double[]{34.0, 7.266, 7.266, 7.428, 6.169, 5.926};
      Integer[] days = new Integer[]{50, 6, 89, 106, 98, 10};
      
      gd2.drawRect(q, q, s, s);
      //gd2.drawLine(q+5, q-10, q+10, q+5); 
      gd2.setColor(Color.blue);
    //g.fillOval(q+5, q+c, 10, 10);
    //g.fillOval(0, 290, 10, 10);
      gd2.fillOval(q, s+q-c, c, c);
      
      for (int e = 0; e < days.length; e++) {
          //g.fillOval(yield[e], days[e], s, s);
         Ellipse2D.Double point = new Ellipse2D.Double(days[e]+q, s-days[e], c ,c);
         gd2.fill(point);
      }
    
    //g.fillOval(0, 4, 10, 10);
    
    
    
    
    
   }
}
    

    
    
    
    
    
    

