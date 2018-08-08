import java.util.*;
import java.io.*;



public class Questao00 {
   
   public static Scanner in = new Scanner (System.in);  
   
   public void isLetter ()
   {
      boolean a = false;
      
      if ( x >= a && x <= z || x >= A && x <=Z)
      {
       a = true;
      } 
     return a;
      
   }
   
   public static void main  ( String [] args )throws IOException
   {
   
   // Definição das variáveis
      String nome = "";
      int idade   = 0;
      float  altura  = 0;
      float  peso = 0;
      char   sexo = 'f';
      int    cont1 = 0; 
      int    cont2 = 0;
      int    quantidade = 0;
      double imc = 0.0;
   
      System.out.println("Quantidade de pessoas: ");
      quantidade = in.nextInt();
   
      // Repetição para ler enquanto a quantidade for maior que zero
      while ( quantidade > 0 )
      {
      
         System.out.println("Nome: ");
         nome   = in.next();
      
         
         System.out.println("Idade: ");
         idade  = in.nextInt();
         if ( isLetter(idade)= true)
         {
            System.out.println("Idade: ");    
         }// end if
         
      
         System.out.println("Altura: ");
         altura = in.nextFloat();
         
        
         System.out.println("Peso: ");
         peso   = in.nextFloat();
      
         System.out.println("Sexo: ");
         sexo = (char)System.in.read();
        
            
         while ( sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f' || sexo == 'M')
         {
            if ( sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f' || sexo == 'M')
            {
               cont1++;
            }
            else
            {
               cont2++;
            }         
         
         }// end while  
        
      
         quantidade--;
      
      }// end while
   }// end main
   

}// end class
