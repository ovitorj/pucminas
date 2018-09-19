public class Questao10{
   
   public static void imprimeCLista(CLista c){
      CLista aux = new CLista();
      int quebra = 1;
      int qtde = c.quantidade();
      Object x = null;
      System.out.println("");
      
      for(int i=0;i<qtde;i++){
         x = c.removeRetornaComeco();
         if(quebra%10==0){
            System.out.println(x);
         }
         else{
            System.out.print(x+"|");
         }
         aux.insereFim(x);
         quebra++;
      }
      //for para voltar com os valores para C
      for (int i=0; i<qtde; i++){
         c.insereComeco(aux.removeRetornaComeco());
      }   
   }
   
   public static void imprimeCFila(CFila f){
      CFila aux = new CFila();
      int quebra = 1;
      int qtde = f.quantidade();
      Object x = null;
      System.out.println("");
      
      for(int i=0;i<qtde;i++){
         x = f.desenfileira();
         if(quebra%10==0){
            System.out.println(x);
         }
         else{
            System.out.print(x+"|");
         }
         aux.enfileira(x);
         quebra++;
      }
      //for para voltar com os valores para C
      for (int i=0; i<qtde; i++){
         f.enfileira(aux.desenfileira());
      }
   }
   
   public static void imprimeCPilha(CPilha p){
      CPilha aux = new CPilha();
      int quebra = 1;
      int qtde = p.quantidade();
      Object x = null;
      System.out.println("");
      
      for(int i=0;i<qtde;i++){
         x = p.desempilha();
         if(quebra%10==0){
            System.out.println(x);
         }
         else{
            System.out.print(x+"|");
         }
         aux.empilha(x);
         quebra++;
      }
      
     //for para voltar com os valores para p
      for (int i=0; i<qtde; i++){
         p.empilha(aux.desempilha());
      }
   }
   
   public static void preencheLista(CLista c){
      int a=0;
      for(int i=0;i<25;i++){
         c.insereFim(++a);
      }
   }
   
   public static void preencheFila(CFila f){
      int a=0;
      for(int i=0;i<25;i++){
         f.enfileira(++a);
      }
   }
   
   public static void preenchePilha(CPilha p){
      int a=0;
      for(int i=0;i<25;i++){
         p.empilha(++a);
      }
   }
   
   public static void main(String []args){
      CLista c = new CLista();
      preencheLista(c);
      imprimeCLista(c);
      
      CFila f = new CFila();
      preencheFila(f);
      imprimeCFila(f);
      
      CPilha p = new CPilha();
      preenchePilha(p);
      imprimeCPilha(p);
      System.out.println(p.peek());
   } 
}