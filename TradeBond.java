import java.util.ArrayList;




public class TradeBond {
//private variables 
   double yield; 
   int money; 
   int days;
   ArrayList<Double> yieldList = new ArrayList<>();
   ArrayList<Integer> daysList = new ArrayList<>();
   ArrayList<Integer> amountList = new ArrayList<>();
   
   ArrayList<Integer> tradeBondArray = new ArrayList<Integer>();
   private int  maxValue = 0; 
   private int  selected = 0; 



/** 
 * Constructor to take in points to graph
 */
   public TradeBond(double yield, int days, int money) {
      this.yield = yield; 
      this.money = money; 
      this.days = days; 
   
   }

  
   /**
      Constructs an empty chart.
   */
   public void ChartComponent()
   {
      maxValue = 1;
      selected = 0;
   } 


   public String toString() {
      String output = yield + 
         " " + money +
         " " + days + " "; 
      
   
      return output;
   
   }
}



