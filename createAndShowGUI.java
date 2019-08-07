
import javax.swing.JFrame;  
import javax.swing.*;
import java.awt.BorderLayout; 
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marthakaitlingarman
 */
public class createAndShowGUI {
   public static String fileName = ""; 
   public static JTextField text = null;
   
   public createAndShowGUI(ReadInFile model){}
   /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
   public static void addComponentsToPane(Container pane)  {
      JButton button1;
      JButton button2;
      JButton button3;
      JButton button4;
   
      //*************  Panel 1  ********************* 
      JPanel subPanel1 = new JPanel();
      
      button1 = new JButton("Open");
      button1.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            
               JFileChooser fileChooser = new JFileChooser();
               fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
               int result = fileChooser.showOpenDialog(subPanel1);
               if (result == JFileChooser.APPROVE_OPTION) {
                  File selectedFile = fileChooser.getSelectedFile();
                  fileName = selectedFile.getAbsolutePath();
                  System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                  text.setText(fileName);
                  try { 
                     ReadInFile newFile = new ReadInFile();
                  } catch (FileNotFoundException ex) {
                     Logger.getLogger(createAndShowGUI.class.getName()).log(Level.SEVERE, null, ex);
                  }
               }              
            }
         });
      subPanel1.add(button1);
      
      //Adds the text button 
      text = new JTextField("<Name of file>");
      subPanel1.add(text);
      //Adds the Quit button 
      button2 = new JButton("Quit");
      button2.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
         });
      subPanel1.add(button2);
      pane.add(subPanel1, BorderLayout.NORTH); 
      
      //add last
      //*************  Panel 2  ********************* 
      
      JPanel subPanel2 = new JPanel(); 
      tJComponent test = new tJComponent(); 
      //test.add
      //ScatterPlot sp = new ScatterPlot(); 
      subPanel2.add(test);
      
      
      pane.add(test, BorderLayout.CENTER); 
      
      
      //*************  Panel 3  ********************* 
      JPanel subPanel3 = new JPanel(); 
      button3 = new JButton("x"); 
      subPanel3.add(button3);
      button4 = new JButton("y");
      subPanel3.add(button4);
      JTextField text2 = new JTextField("<Detail of a selected trade>");
      subPanel3.add(text2, BorderLayout.PAGE_END); 
      pane.add(subPanel3, BorderLayout.SOUTH);
   
   }
     
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
   public createAndShowGUI() { 
      //Create and set up the window.
      JFrame frame = new JFrame("Scatterplot");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
      
      addComponentsToPane(frame.getContentPane());
      frame.pack();
      frame.setSize(450, 500);
      frame.setVisible(true);
      
      
   }
   
   
   /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
   public String getFileName() {
      return fileName; 
   }
}

  

