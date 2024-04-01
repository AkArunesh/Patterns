import java.util.*;
public class Star_Pattern_twenty_seven {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int star= 1;
	    int space= n-1;
	    
	    
	    for(int i=1; i<=n; i++){
	        int a =1;
	        for(int j=1; j<=space; j++){
	            System.out.print(" " + "  ");
	            
	        }
	        for(int j=1; j<=star; j++){
	            System.out.print( a + "  " );
	            if(j<=star/2){
	                a++;
	            } else{
	                a--;
	            }
	        }
	        
	        
	        star+=2;
	        space--;
	        System.out.println();
	    }
	}
}
