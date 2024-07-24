public class OrdenacaoParcial {
  public static int[] execute(int[] entrada, int n) {
    int tamVetor = entrada.length;
    if (n > tamVetor) {
      n = tamVetor;
    } else if (n < 0) {
      n = 0;
    }
    
    int[] saida =  entrada.clone();

    for (int i=0; i < n - 1; ++i){
      for (int j=i; j < n - 1; ++j){
          if (saida[i]>saida[j]){
              int aux = saida[i];
              saida[i] = saida[j];
              saida[j] = aux;
          }
      }
  }

    return saida;
  }
}
