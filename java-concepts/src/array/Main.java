package array;

public class Main {
	public static void main(String[] args) {
		declaracaoDeArray();
		tamanhoDeArray();
		arrayMultidimensionais();
	}

	/*
	 * Array de duas dimensões, informações organizadas em linhas e colunas
	 * Declaração de array multidimencionais 
	 * 
	 * numero[indiceA][indiceB] 
	 * indiceA representa a linha  
	 * indiceB representa a coluna
	 */
	private static void arrayMultidimensionais() {
		int[][] matriz1 = {{1, 2}, {2, 2}};
		int[][] matriz2 = { { 1, 2 }, { 3 }, { 4, 5, 6} };
		
		System.out.println("Print matriz1:");
		printMatriz(matriz1);
		
		System.out.println("\nPrint matriz2:");
		printMatriz(matriz2);
	}
	
	private static void printMatriz(int[][] matriz) {
		for (int linha = 0; linha < matriz.length; linha++) {
			StringBuilder result = new StringBuilder();
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				result.append(matriz[linha][coluna] +",");
			}
			System.out.println(result);
		}
	}

	/*
	 * Descobrindo tamanho do array
	 */
	private static void tamanhoDeArray() {
		int[] listNumbers = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
		System.out.println(listNumbers.length);
	}

	/*
	 * Como declarar array
	 */
	private static void declaracaoDeArray() {
		int[] listNumbers = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
		
		for (int number : listNumbers) {
			System.out.println(number);
		}
	}
}
