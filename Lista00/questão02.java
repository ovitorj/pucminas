import java.util.*;

public class questão02
{
   public static void main ( String [] args )
   {
      
      for ( int x = 1; x < 10; x++ )
      {
         System.out.println();
         System.out.println("Taboada do "+x);
         for ( int y = 1; y <= 10; y++)
         {
            System.out.println(x+" x "+ y+" = "+x*y);
         }//end for
      }//end for
         
   }
}// fim da classe