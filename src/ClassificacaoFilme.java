public class ClassificacaoFilme {
  public static Filme filmeMaiorMedia(Filme[] filmes) {
    Filme filmeMaiorMedia = filmes[0];
    for (int i = 0; i < filmes.length; i++) {
      if(filmes[i].media > filmes[i+1].media) {
        filmeMaiorMedia = filmes[i];
      }
    }

    return filmeMaiorMedia;
  }

  public static Filme[] ordenaPorMedia(Filme[] filmes) {
    Filme[] saida = filmes.clone();

    for (int i = 0; i < saida.length -1; i++) {
      boolean trocou = false;
      for (int j = 0; j < saida.length -i -1; j++) {
        if (saida[j].media > saida[j + 1].media) {
          Filme temp = saida[j];
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
