import java.util.*;

public class questao07
{
   public static Scanner in = new Scanner (System.in);
   
   public static void main ( String [] args )
   {
   //definicao das variaveis
      double a = 0;
      int    b = 0;
      int    p = 0;
   
      double resp = 0;
   
      System.out.println("Digite o valor de A: ");
      a = in.nextDouble();
   
      System.out.println("Digite o valor de B: ");
      b = in.nextInt();
      
      if ( b < 0 )
      {
         System.out.println("Valor de B deve ser maior que 0");
         System.exit(0);
      }
      else
      {
         p = b;
      
         while ( b > 0 )
         {
            resp = a + resp;
            b--;
         }
         System.out.println(""+a+" X "+p+" = "+resp);
      }
   }
}