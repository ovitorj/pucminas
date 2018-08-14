import java.util.*;

public class Questao10{

   public static Scanner in = new Scanner (System.in);

   public static void main ( String [] args ){
      
      int    a = 0; 
      int [] x = new int [10];
      int [] y = new int [10];
   
      for ( int i = 0; i < x.length; ++i){
         System.out.println("Posicao "+i);
         x [i] = in.nextInt();
      }//end for 
      
      for ( int j = x.length-1; j >= 0; j--){
         y[a] = x[j];
         a++;    
      }//end for 
       
      for( int k = 0; k < y.length; k++){
         System.out.println("Posicao "+k);
         System.out.println("Vetor Inicial "+y[k]+" Vetor Invertido "+x[k]);
      }
   
   }//end main
}//end class