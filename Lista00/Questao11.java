import java.util.*;

public class Questao11{
   
   public static Scanner in = new Scanner (System.in);

   public static void ler ( int [] x ){
    
      for ( int i = 0; i < x.length; i++ ){
         System.out.println("Posicao: "+i);
         x[i] = in.nextInt();
      }// end for 
   }
   
   public static void imprimir ( int [] x ){
      
      for ( int i = 0; i < x.length; i++ ){
         System.out.println(i+" ["+x[i]+"] ");
      }//end for
   }
   
   public static void inverter ( int [] x){
      
      int i = 0;
      int f = x.length-1;
      
      while ( i < f ){
         troca (x, i, f);
         i++;
         f--;   
      }
   }// end inverter
   
   public static void troca ( int[] x, int i, int f){
   
      int aux;
      
      aux  = x[i];
      x[i] = x[f];
      x[f] = aux;
          
   }// end 
   

   public static void main ( String [] args ){
      
      // definicao das variaveis
      int [] x = new int [10];
       
      // execucao dos procedimentos
      ler      (x);  
      imprimir (x);
      inverter (x);
      System.out.println();
      imprimir (x);
      
   }//end main

}//end Questao 11
