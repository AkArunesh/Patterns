import java.util.*;
public class Star_Pattern_thirty_three {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int space = n-1;
		int star =1;
		
		for(int i=n; i>=1; i--){
		    int a=i;
		    for(int j=1; j<=space; j++){
		        System.out.print(" "+ " ");
		    }
		    for(int j=1; j<=star; j++){
		        if(a==n){
		            System.out.print(0+ " ");
		           
		        } else{
		            System.out.print( a + " ");
		        }
		        
		        if(j<=star/2){
		            a++;
		        } else { 
		            a--;
		        }
		            
		    }
		        
		         
		    space--;
		    star+=2;
		    System.out.println();
		}
	}
}
