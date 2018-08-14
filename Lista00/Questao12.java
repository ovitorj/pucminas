import java.util.*;

public class Questao12{
   
   public static void armazena ( int [] x ){
      
      int aux = 5;
      
      for (int i = 0; i < x.length; i++){
         x[i] = aux;
         aux  = aux+5; 
      }//end for
   }//end armazenda
   
   public static void imprimir ( int [] x ){
      
      for ( int i = 0; i < x.length; i++){
         System.out.println(i+" ["+x[i]+"] ");         
      }// end for 
   }// end imprimir
   
   public static void main (String [] args){
   
      // definicao dos dados
      int [] x = new int [100];
      
      // execucao dos procedimentos
      armazena(x);
      imprimir(x);
     
   }//end main

}//endQuestao12