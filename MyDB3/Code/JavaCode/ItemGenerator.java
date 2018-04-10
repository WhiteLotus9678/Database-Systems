package myDBpackage;

import java.util.Random;
import java.io.*;

public class ItemGenerator {
	public static void main(String [] args) throws FileNotFoundException 	
   {   
	    Random generator = new Random(); //Create Random object
      
		PrintWriter out = new PrintWriter("ItemData.csv");
		
		String[] descNames = {"Videogame","Console","Accessory","Food/Drink","Other"};
            
      for(int i = 1;i<=1000; i++)
      {
    	 int randDollar = generator.nextInt(59)+1; //Random dollar from 1-59.
    	 int randMonth = generator.nextInt(12)+1; //Random day from 1-12.
    	 int randDay = generator.nextInt(27)+1; //Random day from 1-27.
    	 int index = generator.nextInt(descNames.length);//use it to pick descName
    	 String typeName = descNames[index];
    	 
         out.println("I"+i+",Item Name "+i+","+typeName+",2017-"+randMonth+"-"+randDay+","+randDollar+".99");
      }
      out.close();  	
   }
}