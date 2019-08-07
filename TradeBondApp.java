
import java.util.Scanner; 
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileNotFoundException; 
import javax.swing.*;


 

public class TradeBondApp {

   public static void main(String[] args) throws FileNotFoundException {
      ReadInFile model = new ReadInFile();
       //ScatterPlotView view = new ScatterPlotView(model); 
       //SPlotController controller = new SPlotController(model, view); 
      createAndShowGUI newFrame = new createAndShowGUI(model); 
      // 
      // String bondTrades = ""; 
      // double yield = 0; 
      // int amount = 0; 
      // int days = 0; 
      // String[] lineVector; 
      // ArrayList<TradeBond> allBonds = new ArrayList<TradeBond>();
   // 
   //  
      // FileReader newFile = new FileReader("bondData100reals.csv");
      // Scanner scan = new Scanner(newFile); 
      // String fieldNames = scan.nextLine();
   //    
   //    
      // while (scan.hasNextLine()) {
         // TradeBond newTradeBond = new TradeBond(scan.next(), scan.nextInt(), scan.nextInt());
         // allBonds.add(newTradeBond);
      // }
   //    
   //    
   //    
   //    while (scan.hasNextLine()) {
   //       bondTrades += scan.nextLine() + ",";
   //    } 
   //    
   //    
   //    lineVector = bondTrades.split(","); //need to split on 'n
   //    int length = lineVector.length; 
   //    
   //    for(int i =0; i < lineVector.length; i+=3) {
   //       yield = Double.parseDouble(lineVector[i]);  
   //       days = Integer.parseInt(lineVector[i+1]); 
   //       amount = Integer.parseInt(lineVector[i+2]); 
   //       TradeBond tb = new TradeBond(yield, days, amount);
   //       allBonds.add(tb);  
   //    }
   //    
   //    
   //    //Open File 
      // JFileChooser fo = new JFileChooser(); 
      // fo.setCurrentDirectory(new java.io.File(" "));
      
   
            //   
   }
}
   

        
 
