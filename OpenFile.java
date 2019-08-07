import java.util.InputMismatchException;    
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;  
/**
 * Program to Open File Name and
 * read contents of program. 
 * 
 * Author: Martha Garman 
 * Version: 12/12/2018
 */ 
public class OpenFile{
/** String variable for fileName */
   private String fileName; 
   
 /** String variable to intake */
   private double yield = 0; 
   private int days = 0; 
   private double money = 0; 


/**
 * Constructor
 * @param fileName of type String
 */   
   public OpenFile(String fileName) {
      this.fileName = fileName; 
   }


/**
 *
 * 
 */ 
   public void ReadConent() throws FileNotFoundException {
      FileReader newFile = new FileReader(fileName);  //should we add csv. to file name? 
      Scanner scan = new Scanner(newFile); 
      
      //Assigns Heading Names in Document // Uncertainity - Will document always have headers 
      String fieldNames = scan.nextLine();
      
      //Read in 1st Column, 2nd Col and 3rd Colm of document
      while (scan.hasNextLine()) {
         
         yield += scan.nextDouble();
         if(scan.next() == ",") {
            days += scan.nextInt();
            if(scan.next() == ",") {
               money += scan.nextDouble(); 
            }  
         } 
         
         
      }
      
   
   
   }
}