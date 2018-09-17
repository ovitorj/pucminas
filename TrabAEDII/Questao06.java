import java.util.*;

public class Questao06{
   /*
      Metodo que preenche a fila com elementos de 1 a 10
   */   
   public static void preenchePilha(CPilha p){
      int a = 0;
      for(int i=0; i<10; i++){
         p.empilha(++a);
      }
   }
   
   public static CPilha concatenaPilha(CPilha p1, CPilha p2)
   {
      CPilha c = new CPilha();
      CPilha aux = new CPilha();
      CPilha aux1 = new CPilha();
      CPilha aux2 = new CPilha();
     
      aux1 = p1;
      aux2 = p2;
      
      int qtdep1 = aux1.quantidade();
      int qtdep2 = aux2.quantidade();
      
         
      for (int i=0; i<qtdep1; i++){
         aux.empilha(aux1.desempilha());
      }
      for (int i=0; i<qtdep2; i++){
         aux.empilha(aux2.desempilha());
      }
      
      int qtdeaux = aux.quantidade();
      
      //for para deixar a pilha na ordem correta
      for (int i=0; i<qtdeaux; i++){
         c.empilha(aux.desempilha());
      }
      
      return c;
   }
   
   public static void imprimePilha(CPilha p){
      int qtde = p.quantidade();
      CPilha aux = new CPilha ();
      for (int i=0; i<qtde; i++){
         System.out.println("["+p.peek()+"] ");
         aux.empilha(p.desempilha());
      }
      // for para voltar a ordem original
      for (int i=0; i<qtde; i++){
         p.empilha(aux.desempilha());
      }
   }

   public static void main (String [] args){
      CPilha p1 = new CPilha();
      CPilha p2 = new CPilha();
      preenchePilha(p1);
      preenchePilha(p2);
      imprimePilha(concatenaPilha(p1,p2));
      imprimePilha(p1);
   }
}