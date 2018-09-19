import java.util.*;

public class Questao10{

   public static void imprimeCLista(CLista a){
      CLista aux = new CLista();
      int qtde=a.quantidade();
      int quebra=1;
      int valor;
      
      for(int i=0; i<qtde; i++){
         valor = (int)a.removeRetornaComeco();
         if(quebra%10 == 0){
            System.out.println(valor+"");
         }
         else{
            System.out.print(valor+"|");
         } 
         aux.insereFim(valor);  
         quebra++;
      }
      
      for(int i=0; i<qtde; i++){
         a.insereFim(aux.removeRetornaComeco());
      }
      
   }
   
   public static void preencheLista(CLista a){
      int x = 0;
      for (int i=0; i<25; i++){
         a.insereFim(++x);
      }
   }
   
   public static void imprimeCFila(CFila q){
   }
   
   public static void imprimeCPilha(CPilha a){
   
   }
   
   
   
   public static void main (String []args){
      CLista a = new CLista();
      CFila f = new CFila();
      CPilha p = new CPilha();
      
      preencheLista(a);
      imprimeCLista(a);
      
   
   }

}