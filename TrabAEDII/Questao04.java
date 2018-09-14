import java.util.*;

public class Questao04{
   
   public static CListaDup concatenaLD(CListaDup l1, CListaDup l2){
   
      CListaDup aux1 = new CListaDup();
      CListaDup aux2 = new CListaDup();
      CListaDup c    = new CListaDup(); 
      
      aux1 = l1;
      aux2 = l2;
      
      int qtde1 = l1.quantidade();
      int qtde2 = l2.quantidade();
      
      for (int i=0; i<qtde1; i++){
         c.insereFim(aux1.removeRetornaComeco()); 
      }
      
      for (int i=0; i<qtde2; i++){
         c.insereFim(aux2.removeRetornaComeco());
      }
         
      return c;
   
   } 
   
   /*
      Metodo para preencher a CFilaDup com inteiros de 1 a 10
   */
   public static void preenche (CListaDup l){
      int qtde = 10;
      int a = 0;
      for(int i=0; i<qtde; i++){
         l.insereFim(++a);
      }
   }
   
   public static void main (String [] args){
      CListaDup l1 = new CListaDup();
      CListaDup l2 = new CListaDup();
      CListaDup c = new CListaDup();
   
       preenche(l1);
       preenche(l2);
      
       c = concatenaLD(l1,l2); 
       c.imprime();
   }
}