package aplicacoes;

public class ExtraCode {

	public static void main(String[] args) {

		int sequence[] = { 1, 2, 1, 2 };
		// System.out.println(almostIncreasingSequence(sequence) );

	}



	public static boolean almostIncreasingSequence(int[] sequence) {

		boolean resposta = false;
		int contador = 0;
		int maiorNumero = 0;
		int vetor[] = new int[(sequence.length - 1)];

		for (int x = 0; x < sequence.length - 1; x++) {

			if (sequence[x + 1] > maiorNumero) {
				vetor[x] = sequence[x + 1] - sequence[x];
				System.out.println("Vetor" + vetor[x]);
				maiorNumero = sequence[x + 1];
				//System.out.println("//////" + maiorNumero);

			} else {
				vetor[x] = 0;
				//System.out.println(vetor[x]);
			}

		}

		for (int y = 0; y < vetor.length - 1; y++) {
			if (vetor[y] != vetor[y + 1] || vetor[y] <= 0) {
				contador++;
				//System.out.println("*****" + contador);
			}
		}

		if (contador <= 1) {
			resposta = true;
		}

		return resposta;
	}
}
