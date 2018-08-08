import java.util.*;

public class questao03
{
   public static Scanner in = new Scanner (System.in);
       
   public static void main ( String [] args)
   {
      
      int quantidade = 0;
      float base     = 0;
      float altura   = 0;
      float area     = 0;
      float total    = 0;
      
      System.out.println("Informe a quantidade retangulos a serem calculados");
      quantidade = in.nextInt();
       
      while ( quantidade > 0 )
      {
         System.out.println();
         System.out.println("Informacoes do Retangulo");
         System.out.println("Digite a base: ");
         base = in.nextFloat();
         
         if ( base < 0 )
         {
            System.out.println("Base Negativa!");
            System.exit(0);
         }
         else
         {
            System.out.println("Digite a altura: ");
            altura = in.nextFloat();
            
            if ( altura < 0 )
            {
               System.out.println("Altura Negativa!");
               System.exit(0);
            }
            else
            {
               System.out.println("O perimetro e igua a: "+(base*2+altura*2));
               area = base * altura;
               System.out.println("A area e igual a: "+area);
            }
         }//end else
         total = area + total;
         quantidade--; 
      }//end while    
      
      System.out.println("A soma das areas dos retangulos e: "+total); 
   }
   
}