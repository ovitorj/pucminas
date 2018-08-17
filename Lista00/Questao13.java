import java.util.*;

public class Questao13{

   public static Scanner in = new Scanner (System.in);
   
   public static void ler (int [][] x){
   
      for ( int i = 0; i < x.length ; i++ ){
         for ( int j = 0; j < x[0].length ; j++){
            System.out.println("Digite o elemento da linha "+(i+1)+" da coluna "+(j+1)+": ");
            x[i][j] = in.nextInt();
            System.out.println("");
         }// end for
      }// end for
      
   }// end ler
   
   public static void imprimir (int [][] x){
   
      for ( int i = 0; i < x.length; i++){
         for ( int j = 0; j < x[0].length; j++ ){
            if( i == j ){
               System.out.print("["+x[i][j]+"]");
            }
            System.out.print("\t");
         }
         System.out.println();
      }
   
   }// end imprimir
   
   public static void main ( String args [] ){
      
      //definicao das variaveis
      int [][] x = new int [5][5];
      
      //execucao do comando
      ler(x);
      imprimir(x);
   }

}