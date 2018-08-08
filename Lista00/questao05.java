import java.util.*;

public class questao05
{

   public static void main ( String [] args )
   {
      float x   = 1;   
      float inc = (float)0.1000000;
      
      for ( x = 1; x < 10 ; x = x+inc)
      {
         System.out.println("Area de circunferencia com raio "+x+" e igual a "+(Math.PI*(x*x)));
      
      }
      
   }//end main

}//end class