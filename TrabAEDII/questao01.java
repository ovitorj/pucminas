import java.util.*;

public class questao01{
   
   /*
      Metodo que preenche a lista com elementos de 1 a 10
   */   
   public static void preencheLista(CLista l){
      int a = 0;
      for(int i=0; i<10; i++){
         l.insereComeco(++a);
      }
   }
   
   public static void main (String [] args){
      CLista l = new CLista();
      preencheLista(l);
   }
}