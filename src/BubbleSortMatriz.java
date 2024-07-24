public class BubbleSortMatriz {
  public static int[][] execute(int[][] matriz) {
    int colunas = matriz.length;
    int[][] saida = matriz.clone();

    for(int i = 0; i < colunas; i++){
      saida[i] = BubleSort.executeForInt(saida[i]);
    }

    return saida;
  }
}
