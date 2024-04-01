import java.util.*;
public class Star_Pattern_twenty_four
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int space= n-1;
		int star=1;
		int  a =1;
		
		for(int i=1; i<=n; i++){
		    
		    for(int j=1; j<=space; j++){
		        System.out.print(" "+ " ");
		        
		    }
		    for(int j=1; j<=star;j++){
		        System.out.print( a +" ");
		    }
		    
		    space--;
		    star+=2;
		    a++;
		    System.out.println();
		}
	}
}
