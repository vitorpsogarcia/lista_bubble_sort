import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n===============   1. Ordenação Decrescente   ===============");
        int[] entradaDsc = { 3, 0, -2, 5, 8};
        int[] saidaDsc = OrdenacaoDecrescente.execute(entradaDsc);
        
        Utils.imprimeVetorInt(entradaDsc);
        Utils.imprimeVetorInt(saidaDsc);


        System.out.println("\n===============   2. Ordenação de Strings   ===============");
        String[] entradaStr = {"bbb", "aaa", "ccc"};
        String[] saidaStr = OrdenacaoString.execute(entradaStr);

        Utils.imprimeVetorStr(entradaStr);
        Utils.imprimeVetorStr(saidaStr);


        System.out.println("\n===============   3. Verifica Ordenação   ===============");
        int[] entrada = { 1, 2, 3, 4, 5};
        boolean ordenado1 = VerificaOrdenacao.execute(entradaDsc, true);
        boolean ordenado2 = VerificaOrdenacao.execute(saidaDsc, true);
        boolean ordenado3 = VerificaOrdenacao.execute(entrada, false);

        System.out.println(String.format("Entrada ordenada? %b", ordenado1));
        System.out.println(String.format("Saida ordenada? %b", ordenado2));
        System.out.println(String.format("Entrada3 ordenada? %b", ordenado3));


        System.out.println("\n===============   4. Ordenação Parcial   ===============");
        int[] entradaParc = { 8, 4, 3, 7, 6, 5, 2 };
        int[] saidaParc = OrdenacaoParcial.execute(entradaParc, 4);

        System.out.print("Entrada: ");
        Utils.imprimeVetorInt(entradaParc);

        System.out.print("Saida: ");
        Utils.imprimeVetorInt(saidaParc);


        System.out.println("\n===============   5. Ordenacao Matriz   ===============");
        int[][] entradaMatriz = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
        int[][] saidaMatriz = BubbleSortMatriz.execute(entradaMatriz);

        System.out.print("Matriz Entrada:");
        Utils.imprimeMatrizInt(entradaMatriz);
        
        System.out.print("Matriz Saída:");
        Utils.imprimeMatrizInt(saidaMatriz);

        System.out.println("\n===============   6. Classificação Notas   ===============");
        int[] notas = { 85, 70, 95, 60, 75, 80 };
        int[] notasOrdenadas = BubleSort.executeForInt(notas);

        System.out.print("Notas ordenadas: ");
        Utils.imprimeVetorInt(notasOrdenadas);

        System.out.println(String.format("Mediana: %.2f", Utils.getMediana(notasOrdenadas)));

        System.out.println("\n===============   7. Ordenação Pontuação Jogos   ===============");
        int[] pontuacaoJogadores = { 250, 300, 150, 400, 350 };
        int[] pontuacaoOrdenada = OrdenacaoDecrescente.execute(pontuacaoJogadores);

        System.out.print("Pontuação Ordenada: ");
        Utils.imprimeVetorInt(pontuacaoOrdenada);

        System.out.println(
            String.format("Maior pontuação: %d", Utils.getMaiorInt(pontuacaoOrdenada))
        );

        System.out.println("\n===============   8. Classificação Filmes   ===============");
        Filme[] filmes = {
            new Filme("Filme A", new Float[]{ 5f, 4f, 3f, 4f, 5f }),
            new Filme("Filme B", new Float[]{ 2f, 3f, 4f, 3f, 2f }),
            new Filme("Filme C", new Float[]{ 4f, 4f, 5f, 5f, 4f }),
        };

        Filme[] filmesOrdenados = ClassificacaoFilme.ordenaPorMedia(filmes);
        Filme filmeMaiorMedia = filmesOrdenados[filmesOrdenados.length - 1];

        Utils.imprimeVetorFilmes(filmesOrdenados);
        System.out.println(
            String.format(
                "O filme '%s' é o que possui a maior média (%.2f)",
                filmeMaiorMedia.nome,
                filmeMaiorMedia.media
            )
        );
        
    }

}
