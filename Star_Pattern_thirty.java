import java.util.*;
public class Star_Pattern_thirty {

    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;

        for(int i=1; i<=n; i++){

            int a= n;
            for(int j=1; j<=star; j++){
                System.out.print( a + " ");
                a--;
            }

        System.out.println();
            
        }
    }
}