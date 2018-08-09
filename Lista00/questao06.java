import java.util.*;

public class questao06
{
   public static Scanner in = new Scanner (System.in);
   
   public static void main (String [] args)
   {
      float x1, y1;
      float x2, y2;
      float inc = 0;
      
      System.out.println("Informe o valor do incremento");
      inc = in.nextFloat();
      
      if ( inc <= 0 )
      {
         System.out.println("O valor do incremento deve ser positivo");
         System.exit(0);
      }
      else
      {
         System.out.println("Informe o limite inferior da base");
         x1 = in.nextFloat();
         
         if( x1 <=0 )
         {
            System.out.println("Limites devem ser positivos");
            System.exit(0);
         }      
         else
         {
            System.out.println("Informe o limite superior da base");
            y1 = in.nextFloat();
            
            if ( y1 <= x1 )
            {
               System.out.println("Limite superior deve ser maior que limite inferior");
               System.exit(0);
            }
            else
            {
               System.out.println("Informe o limite inferior da altura");
               x2 = in.nextFloat();
               if ( x2 <= 0 )
               {
                  System.out.println("Limites devem ser positivos");
                  System.exit(0);
               }
               else
               {
                  System.out.println("Informe o limite superior da altura");
                  y2 = in.nextFloat();
                  if ( y2 <= x2 )
                  {
                     System.out.println("Limite superior deve ser maior que limite inferior");
                     System.exit(0);
                  }
                  else
                  {
                     while ( x1 <= y1 && x2 <= y2 )
                     {
                        System.out.println();
                        System.out.println("Retangulo de base "+x1+" e altura "+x2);
                        System.out.println("Area     : "+x1*x2);
                        System.out.println("Perimetro: "+(x1*2+x2*2));
                        System.out.println();
                        
                        x1 = x1 + inc;
                        x2 = x2 + inc;
                     }
                  
                  }// end else
               }//end else
            }//end else
            
         }//end else
         
      }// end else
       
             
   }// end main
   
}// end class