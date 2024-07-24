public class BubleSort {
  public static int[] executeForInt(int[] vetor) {
    int tamVetor = vetor.length;
    int[] saida = vetor.clone();

    for(int i = 0; i < tamVetor -1; i++) {
      boolean trocou = false;
      for(int j = 0; j < tamVetor -i -1; j++){
        if(saida[j] > saida[j +1]) {
          int temp = saida[j];
          saida[j] = saida[j + 1];
          saida[j + 1] = temp;

          trocou = true;
        }
      }
      if (!trocou) break;
    }
    return saida;
  }
}
