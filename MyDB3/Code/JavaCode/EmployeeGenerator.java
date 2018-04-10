package myDBpackage;
import java.io.*;

public class EmployeeGenerator {
	public static void main(String [] args) throws FileNotFoundException 	
   {   
      
		PrintWriter out = new PrintWriter("EmployeeData.csv");
            
      for(int i = 1;i<=1000; i++)
      {
         out.println("E"+i+",Name "+i);
      }
      out.close();  	
   }
}