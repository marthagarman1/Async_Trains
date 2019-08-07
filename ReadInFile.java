
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
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
public class ReadInFile {
    //Variables 
   String fieldNames; 
   ArrayList<TradeBond> allBonds = new ArrayList<>();
   String fileName; 
    
   public ReadInFile() throws FileNotFoundException{
      String bondTrades = ""; 
      double yield = 0; 
      int amount = 0; 
      int days = 0; 
      ArrayList<Double> yieldList = new ArrayList<>();
      ArrayList<Integer> daysList = new ArrayList<>();
      ArrayList<Integer> amountList = new ArrayList<>();
      String[] lineVector; 
      
   
      
      
      if(fileName != null) {
         FileReader newFile = new FileReader("bondData100reals.csv"); //"bondData100reals.csv"
         Scanner scan = new Scanner(newFile); 
         fieldNames = scan.nextLine();
         System.out.print(fieldNames); //testing
      
      //TradeBond newTradeBond = new TradeBond(scan.nextDouble(), scan.nextInt(), scan.nextInt());
      
         while (scan.hasNextLine()) {
            bondTrades += scan.nextLine() + ",";
         } 
      
      
         lineVector = bondTrades.split(","); //need to split on 'n
         int length = lineVector.length; 
      
         for(int i =0; i < lineVector.length; i+=3) {
            yieldList.add(Double.parseDouble(lineVector[i]));  
            days = Integer.parseInt(lineVector[i+1]); 
            amount = Integer.parseInt(lineVector[i+2]); 
            TradeBond tb = new TradeBond(yield, days, amount);
            allBonds.add(tb);  
         }
      }
      
   
   }
    
    
    
   public void setFileName(String fileName){
      this.fileName = fileName; 
    
   }
    
   public String getFieldNames() {
      return fieldNames;
   }
    
   public ArrayList<TradeBond> getTradeBonds() {
      return allBonds;  
   }
    
   public void getMaxYield() {
    
        //return maxYield(); 
   }
    
}
