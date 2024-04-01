import java.util.*;
public class Star_Pattern_twenty {
public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		int space = n/2;
		int star = 1;
		
		for(int i=1; i<=n; i++){
		    
		    
		    for(int j=1; j<=space; j++){
		        System.out.print(" " + " ");
		        
		    }
		    
		    for(int j=1; j<=star; j++)
		    
		    { 
		        if(j==1 || j==star) {
		            System.out.print("*"+ " ");
		        
		    } else{
		        System.out.print(" " + " ");
		    }
		        
		    }
		    
		        
		     if(i<=n/2){ 
		         space--;
		         star+=2;   
		         
		     } else{
		         space++;
		         star-=2;
		     }   
    	   
		    System.out.println();
		    
		}
	}
}