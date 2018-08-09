import java.util.*;

public class questao08
{
   public static Scanner in = new Scanner (System.in);
   
   public static void fatorial (int x)
   {
      //definicao da variavel
      int resp = 1;
      int j;
      j = x;
      
      while ( j > 0 )
      {
         resp = resp * j;
         j--;
      }  
    
     System.out.println(""+x+"! = "+resp);
   }//end fatorial
    
   public static void main ( String [] args )
   {
      //definicao das variaveis
      int n = 0;
      
      System.out.println("Digite o valor de n: ");
      n = in.nextInt();
      
      fatorial(n);
      
   }//end main

}// end class