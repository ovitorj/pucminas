import java.util.*;

public class Questao09{

   public static Scanner in = new Scanner (System.in);
   
   public static void main ( String [] args ){
      // definicao das variaveis
      int a = 0;
       
      // definicao dos arrays
      int [] x = new int [10];
      int [] z = new int [5];
      
      
      for ( int y = 0; y < x.length; y++ ){
         System.out.println("Posicao: "+y);
         x [y] = in.nextInt();
      }//end for  
      
      
      for ( int t = 0; t < x.length; t++ ){
         if( a < x.length ) 
         {
            z [t] = x [a];
            System.out.println("Segundo vetor: "+z[t]);
            a = a + 2;   
         }
      }
   
   }//end main

}//end class
