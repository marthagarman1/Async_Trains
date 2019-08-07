
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.InputMismatchException;    
import java.io.FileReader;
import java.io.FileNotFoundException; 
import javax.swing.JFrame;  
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
//import java.awt.FlowLayout; 
import java.awt.Container;
import java.awt.Dimension;
  
public class createFrame { 

   public createFrame(Container pane) {
   
   }

   public void addComponentsToPane(Container pane)  {
      JButton button;
      JTextField text;
      JFileChooser fc; 
         
      //*************  Panel 1  ********************* 
      fc = new JFileChooser(); 
      fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      JPanel subPanel1 = new JPanel();
      button = new JButton("Open");
      button.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "button is working");
            }
         });
      
      subPanel1.add(button);
      
      
      text = new JTextField("<Name of File>");
      subPanel1.add(text);
      
      
      button = new JButton("Quit");
      subPanel1.add(button);
      pane.add(subPanel1, BorderLayout.NORTH); 
      
      //add last
      //*************  Panel 2  ********************* 
      JPanel subPanel2 = new JPanel(); 
      ScatterPlot sp = new ScatterPlot(); 
      subPanel2.add(sp);
      pane.add(sp, BorderLayout.CENTER); 
      
      //*************  Panel 3  ********************* 
      JPanel subPanel3 = new JPanel(); 
      button = new JButton("x"); 
      subPanel3.add(button);
      button = new JButton("y");
      subPanel3.add(button);
      text = new JTextField("<Detail of a selected trade>");
      subPanel3.add(text, BorderLayout.PAGE_END); 
      pane.add(subPanel3, BorderLayout.SOUTH);
   
   }
     
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
   private static void createAndShowGUI() {
         
        //Create and set up the window.
      JFrame frame = new JFrame("Scatterplot");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
      addComponentsToPane(frame.getContentPane());
        //Use the content pane's default BorderLayout. No need for
        //setLayout(new BorderLayout());
        //Display the window.
      frame.pack();
       
      frame.setVisible(true);
   }
}