
import java.awt.Graphics;
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
public class ScatterPlot extends JComponent
{
   private ArrayList<Double> yield;
   private ArrayList<Double> day;
   private ArrayList<Double> amount;

   public ScatterPlot(ArrayList<Double> yield, ArrayList<Double> day, ArrayList<Double> amount)
   {
      this.yield = yield; 
      this.amount = amount; 
      this.day = day; 
   }


   public void paintComponent(Graphics g)
   {  
      final int GAP = 5;
      final int BAR_HEIGHT = 10;
   
      int y = GAP;
      for (double value : day)
      {
         int barWidth = (int) (getWidth() * value / 1);
         g.fillRect(0, y, barWidth, BAR_HEIGHT);
         y = y + BAR_HEIGHT + GAP;
      }
   }
}
