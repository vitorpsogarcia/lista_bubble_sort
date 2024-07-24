public class Utils {
  public static void imprimeVetorInt(int[] vetor) {
    StringBuilder sb = new StringBuilder();
    
    sb.append("[ ");
    for (int i = 0; i < vetor.length; i++) {
        if (i == vetor.length - 1) {
            sb.append(vetor[i]);
        } else {
            sb.append(
                String.format("%d, ", vetor[i])
            );
        }
    }
    sb.append(" ]");

    System.out.println(sb.toString());
  }

  public static void imprimeVetorStr(String[] vetor) {
    StringBuilder sb = new StringBuilder();
    
    sb.append("[ ");
    for (int i = 0; i < vetor.length; i++) {
        if (i == vetor.length - 1) {
            sb.append(vetor[i]);
        } else {
            sb.append(
                String.format("%s, ", vetor[i])
            );
        }
    }
    sb.append(" ]");

    System.out.println(sb.toString());
  }

  public static void imprimeMatrizInt(int[][] matriz) {
    StringBuilder sb = new StringBuilder();
    sb.append("[\n");
    for (int i = 0; i < matriz.length; i++) {
        sb.append("\t[ ");
        int[] vetor = matriz[i];
        for( int j = 0; j < vetor.length; j++) {
            if (j == vetor.length-1) {
                sb.append(vetor[j]);
            } else {
                sb.append(
                    String.format("%d, ", vetor[j])
                );
            }
        }
        sb.append(" ]");
    }
    sb.append("\n]");

    System.out.println(sb.toString());
  }

  public static float getMediana(int[] vetor) {
    int[] saida = vetor.clone();
    boolean isOrdenado = VerificaOrdenacao.execute(saida, false);
    if(!isOrdenado) {
      saida = BubleSort.executeForInt(vetor);
    }

    float mediana = 0;

    if(saida.length %2 != 0) {
      int valorMeio = (int)Math.floor(saida.length / 2) + 1;

      mediana = saida[valorMeio-1];
    } else {
      int valorMeio = saida.length / 2;
      mediana = ((float)saida[valorMeio - 1] + (float)saida[valorMeio]) / 2;
    }

    return mediana;
  }

  public static int getMaiorInt(int[] vetor) {
    int maior = vetor[0];

    for( int numero : vetor) {
      if (numero > maior) {
        maior = numero;
      }
    }

    return maior;
  }

  public static void imprimeVetorFilmes(Filme[] filmes) {
    StringBuilder sb = new StringBuilder();

    sb.append("[\n");
    for (Filme filme: filmes) {
      sb.append(
        String.format(
          "\t('%s', %.2f),\n",
          filme.nome,
          filme.media
        )
      );
    }
    sb.append("]");

    System.out.println(sb.toString());
  }
}
