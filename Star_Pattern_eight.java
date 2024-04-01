import java.util.*;
public class Star_Pattern_seven{

public static void main(String args []){

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int star =n;
        
        

        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=star; j++){
                if(i==j || i+j==n+1){
                    
                    System.out.print("*" + " ");
                } else{
                    System.out.print(" " + " ");
                }
                
            }
            
            System.out.println();
        }

    }

    
}