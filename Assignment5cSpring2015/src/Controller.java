import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.LinkedList;

import javax.swing.JOptionPane;


public class Controller {
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		public static void main (String[] args) throws IOException
		{   // create a main linked list 
			LinkedLists list = new LinkedLists(); 
	        String input = "false";
	        
	        // create a Jpane and show my message to the users
	          JOptionPane jPane = new JOptionPane();
		      jPane.setBackground(Color.blue);
		      
		      JOptionPane.showMessageDialog(null, " Welcome to my World! \n"
                      +"Please type in the console as many names you want! \n"
                      + "When you done type in over");   
		    	
	        // getting input from user, will stop when user has entered over 
		   while(!input.equals("over"))
		   {
		    	input = br.readLine();
	            list.add(input); 
	           // System.out.println("Here is the list so far:");
	            list.print(list.getHead().getNext());
	            System.out.println("\n");
	            
		   }
		      
	        
	        if(list.size() == 1) {
	        	
	            System.out.println("You have entered only one name.");
	        }else {
	        	
	            System.out.println("Enter the name(s) would like to remove: ");
	            
	            
	                String toRemove = br.readLine();
	                list.remove(toRemove);
	                
	       
	                }
	         
	       System.out.println("The final list are: ");
	        list.print(list.getHead().getNext());
	    }
}
