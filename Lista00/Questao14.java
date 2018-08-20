import java.util.*;

public class Questao14{

   public static Scanner in = new Scanner (System.in);

   public static void ler ( int [][] x ){
   
      for(int i = 0; i < x.length; i++){
         for(int j = 0; j < x[0].length; j++){
            System.out.println("Ente com os valores da matriz: " + "[" + i + "]" +"x"+ "[" + j + "] :");
            x[i][j] = in.nextInt();
            System.out.println("");
         }
      
      }
   
   }// endLer
   
   public static void imprimir (int [][] x){
   
      for ( int i = 0; i < x.length; i++){
         for ( int j = 0; j < x[0].length; j++ ){
            System.out.print("[" + x[i][j] + "]");
         } //end second for
         System.out.println();
      } //end first for
   
   }// end imprimir
   
   
   public static void somar ( int [][] x ){
      
      int soma = 0;
      
      for (int i = 0; i < x.length; i++){
         for (int j = 0; j <x[0].length; j++){
            if ( i < j ){
               soma = soma + x[i][j];
            }
         }
      }
      System.out.println("Soma = "+soma);
   }
  
   public static void main (String [] args){
   
      // definicao das variaveis
      int [][] x = new int [5][5];
      
      // execucao dos comandos
      ler(x);
      imprimir(x);
      somar(x);
      
   }

}// endLista14