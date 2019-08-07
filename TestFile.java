
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marthakaitlingarman
 */
public class TestFile {
    //Variables 
   
    
   public static void main(String[] args) throws FileNotFoundException {
      String fieldNames = ""; 
      
      //****
      String[] fieldNamesList = new String[2];
      
      ArrayList<TradeBond> allBonds = new ArrayList<>();
      String fileName = "bondData100reals.csv"; 
      String bondTrades = ""; 
      double yield = 0; 
      int amount = 0; 
      int days = 0; 
      ArrayList<Double> yieldList = new ArrayList<>();
      ArrayList<Integer> daysList = new ArrayList<>();
      ArrayList<Integer> amountList = new ArrayList<>();
      String[] lineVector; 
      double MAX_VALUE = 0;
      int MAX_VALUE2 = 0;
      int MAX_VALUE3 = 0;
         
      if(fileName != null) {
         FileReader newFile = new FileReader("bondData100reals.csv"); //"bondData100reals.csv"
         Scanner scan = new Scanner(newFile); 
         
         fieldNames = scan.nextLine();
         fieldNamesList = fieldNames.split(",");
         
         System.out.print(fieldNames); //testing
         
         //TradeBond newTradeBond = new TradeBond(scan.nextDouble(), scan.nextInt(), scan.nextInt());
         
         while (scan.hasNextLine()) {
            bondTrades += scan.nextLine() + ",";
         } 
         
         
         lineVector = bondTrades.split(","); //need to split on 'n
         int length = lineVector.length; 
         
         for(int i =0; i < lineVector.length; i+=3) {
            //variable for first element 
            double x = Double.parseDouble(lineVector[i]);
            int y = Integer.parseInt(lineVector[i+1]);
            int z = Integer.parseInt(lineVector[i+2]); 
            
            yield = x;
            yieldList.add(x);  
            
            days =  y; 
            daysList.add(y); 
            amount = z; 
            amountList.add(z); 
            
            TradeBond tb = new TradeBond(yield, days, amount);
            allBonds.add(tb);  
            
         
            
         }
         
         System.out.println(MAX_VALUE =  Collections.max(yieldList)); 
         System.out.println(MAX_VALUE2 =  Collections.max(daysList)); 
         System.out.println(MAX_VALUE3 =  Collections.max(amountList)); 
      }
      
   
      
      
   }

  
      
      
      
      
               
    

}
   

