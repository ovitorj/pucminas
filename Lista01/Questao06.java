import java.util.*;

public class Questao06{

   public static Scanner in = new Scanner (System.in);
 
   public static void questao06(){
   
   //definicao das variaveis
      CFila f    = new CFila();
      CFila faux = new CFila(); 
      int qtde = 10;
      String nome = "";
   
     //for para recolher o nome das pessoas
      for(int i=0; i<qtde; i++){
         System.out.println("Digite o nome do "+(i+1)+" aluno");
         nome = in.nextLine();
         f.enfileira(nome);
      }
     
     //for para imprimir os nomes passando para faux
      for(int i=0; i<qtde; i++){
         System.out.println(""+(i+1)+" - "+f.peek());
         faux.enfileira(f.desenfileira());
      }
      
      //for para voltar com os elementos para f
      for (int i=0; i<qtde; i++){
         f.enfileira(faux.desenfileira());
      }
      
   }

   public static void main (String [] args){
      questao06();
   }
}