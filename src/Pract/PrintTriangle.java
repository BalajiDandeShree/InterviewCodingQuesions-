package Pract;

public class PrintTriangle {

	public static void main(String[] args) {
    
		
	/*	for(int i = 0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// Left angle triangle 
	/*	for(int i = 0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int k = 0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		} */

		int i,j,row=5;
	
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=row-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print("$");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   

		}
	System.out.println("___________________________________________");	
	for (i=0; i<row; i++)   
	{  
		
		for (j=0; j<5-i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		System.out.println(); 
	for (j=i+1; j>0; j--)   
	{  
	//prints space between two stars  
	System.out.print(" ");   
	}   
	//inner loop for columns  
	
	//throws the cursor in a new line after printing each line  
	  

	}
		
		
	}
}
