public class OrdenacaoDecrescente {
  public static int[] execute(int[] entrada) {
    int tamVetor = entrada.length;
    int[] saida =  entrada.clone();

    boolean trocou = true;
    for (int i = 0; i < tamVetor - 1; i++) {
      trocou = false;
      for(int j = 0; j  < tamVetor -1; j++) {
        if (saida[j] < saida[j+1]) {
          int temp = saida[j];
          saida[j] = saida[j+1];
          saida[j+1] = temp;
          trocou = true;
        }
      }

      if (!trocou) break;
    }

    return saida;
  }
}
