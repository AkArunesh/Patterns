import java.util.*;
public class Star_Pattern_twenty_eight {
    public static void main(String args [] ){

   
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int space = n-1;
    int star = 1;
    
    for (int i=1; i<=n; i++) {
    int a= i;
        

        for(int j=1; j<=space; j++){
            System.out.print(" " + " ");
        }

        for(int j=1; j<=star; j++){
            System.out.print( a + " ");

            if(j<=star/2){
                a++;
            }   else {
                a--;
            }

        
        }
            a++;
            star+=2;
            space--;
            System.out.println();
    }


    }
}



