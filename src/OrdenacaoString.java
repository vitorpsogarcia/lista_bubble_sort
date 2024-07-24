public class OrdenacaoString {
  public static String[] execute(String[] entrada) {
    int tamVetor = entrada.length;
    String[] saida = entrada.clone();

    boolean trocou = true;
    for (int i = 0; i < tamVetor - 1; i++) {
      trocou = false;
      for(int j = i; j < tamVetor -i -1; j++) {
        if (saida[j].compareTo(saida[j+1]) > 0) {
          String temp = saida[j];
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
