public class VerificaOrdenacao {
  public static boolean execute(int[] entrada, boolean decrescente)  {
    boolean ordenado = true;

    for (int i = 1; i < entrada.length - 2; i++) {
      if (decrescente) {
        if (entrada[i] < entrada[i + 1] || entrada[i] > entrada[i - 1]) {
          ordenado = false;
          break;
        }
      } else {
        if (entrada[i] > entrada[i + 1] || entrada[i] < entrada[i - 1]) {
          ordenado = false;
          break;
        }
      }
    }

    return ordenado;
  }
}
