import java.util.*;
public class Star_Pattern_thirty_two{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int star =1;
		int a=1;
		
		for(int i=1; i<=2*n-1; i++){
		    
		    for(int j=1; j<=star; j++){
		        if(j%2==1){
		            System.out.print( a + " ");
		            
		        } else {  
		            System.out.print("*" + " ");
		        }
		        
		        
		        
		    } 
		    
		    if(i<n){
		        star+=2;
		        a++;
		    } else{
		        star-=2;
		        a--;
	       	}
	       	
	       	
	       	System.out.println();
		}
		
	}
}
