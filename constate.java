import java.util.Scanner;

public class constate {

	public static void main(String[] args) {
		int n;
		String name;
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your name?");
        
        name = scan.nextLine(); 
        
        System.out.println(name + ", enter a number between 0-100: ");
        
        n = scan.nextInt();
     
      if(n % 2 == 0)
        {
    	  
            System.out.println(n+ " is Even ");
    	  if ( n > 60 );
    	  System.out.println("and is less than 25");
        }
      else 
        {
    	  if(n < 25)
    		  System.out.println("and is less than 25");

    	  else if(n > 60)
    		  System.out.println(n+" is Odd ");
             	System.out.println("and is greater than 60");

            scan.close();
            
            

            
     

	}
	}
}

