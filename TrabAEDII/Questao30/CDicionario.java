class CDicionario
{
   private CCelulaDicionario primeira, ultima;
   
   public CDicionario()
   {
      primeira = new CCelulaDicionario();
      ultima = primeira;
   }
   public boolean vazio()
   {
      return primeira == ultima;
   }
   public void adiciona(Object chave, Object valor)
   {
      ultima.prox = new CCelulaDicionario(chave, valor);
      ultima = ultima.prox;            
   }
     
   public Object recebeValor(Object chave)
   {
      boolean achou = false;
      for (CCelulaDicionario aux = primeira.prox; aux != null && !achou; aux = aux.prox){
         achou = aux.key.equals(chave);
      }
      return aux.valor;
   }
}