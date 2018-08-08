import java.util.*;
import java.math.*;


public class questao04
{
   public static Scanner in = new Scanner (System.in);
   
   public static void main ( String [] args )
   {
      float x    = 0;
      float y    = 0;
      int incremento = 0;
      
      System.out.println("Informe o valor do incremento");
      incremento = in.nextInt();
      if ( incremento <= 0 )
      { 
         System.out.println("O valor do incremento deve ser >= 0");
      } 
      else
      {
         System.out.println("Informe o limite inferior");
         x = in.nextFloat(); 
      
         if ( x < 0 )
         {
            System.out.println("Area negativa");
            System.exit(0);
         }
         else
         {
            System.out.println("Informe o limite superior");
            y = in.nextFloat();
            if ( x > y )
            {
               System.out.println("Valor deve ser maior que o limite inferior");
               System.exit(0);
            }
            else
            {
               while ( y > x )
               {
                  System.out.println("Area de circunferencia com raio "+x+" e igual a "+(Math.PI*(x*x)));
                  x = x + incremento;
               
               }//end while
            }//end else
         }//end else
      }//end if
            
   }//end main
}//end class
