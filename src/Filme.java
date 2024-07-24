public class Filme {
  String nome;
  Float[] avaliacoes;
  Float media;

  public Filme(String nome, Float[] avaliacoes) {
    this.nome = nome;
    this.avaliacoes = avaliacoes;
    this.media = this.calculaMedia();
  }

  private Float calculaMedia() {
    Float soma = 0f;
    for(Float avaliacao : this.avaliacoes) {
      soma += avaliacao;
    }

    return soma / (float)this.avaliacoes.length;
  }
}
