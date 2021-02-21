//Trabalho Prático 01
import java.util.Scanner;

public  class trabalhoPratico01 {
	int teste = 5;
	public static void main(String[] args) {  //Função main
		menu();
		
	}

	
	
	public  static void menu() {  //Função menu
		int opcao;
		
		System.out.println("Menu de opções: ");
		System.out.println("1 - Entrada das temperaturas");
		System.out.println("2 - Cáculo da temperatura média");
		System.out.println("3 - Cálculo da temperatura mínima");
		System.out.println("4 - Cálculo da temperatura máxima");
		System.out.println("5 - Relatório meteorológico");
		System.out.print("\n");
		System.out.print("Escolha uma opção: ");
		Scanner in1 = new Scanner(System.in);
		opcao = in1.nextInt();
		
		switch (opcao) {
			case 1: 
				double[] mediaMesDois = new double[31];
				EntradaTemperaturas(mediaMesDois);
				break;
			case 2:
				//Chama a função
				System.out.print("Cáculo da temperatura média");
				break;
			case 3: 
				//Chama a função
				System.out.print("Cálculo da temperatura mínima");
				break;
			case 4: 
				//Chama a função
				System.out.print("Cálculo da temperatura máxima");
				break;
			case 5: 
				//Chama a função
				System.out.print("Relatório meteorológico");
				break;
		}
	}
	
	
	
	public  static double[] EntradaTemperaturas(double[] mediaMes) { //Função 1 - Entrada das Temperaturas
		
		int mesVetorTam = 31; //Marcador de tamanho do vetor para meses não fevereiro
		int mesVetorTamFevereiro = 29; //Marcador de tamanho do vetor para meses não fevereiro
		int ano, mes; //Respectivamente, guardam o número do ano e do mês
		double soma = 0, media = 0;
		
		System.out.println("--> Função Entrada de Temperaturas\n"); 
		System.out.print("Digite um ano entre 2011 e 2020: ");
		Scanner in1 = new Scanner(System.in);
		ano = in1.nextInt();
		if (ano > 2020 || ano < 2011) {//Validação do ano caso ano seja inválido /////////////////////////////////////////////////////////////////////////////////
			do {
				System.out.println("\nAno inválido!");
				System.out.print("Digite um ano válido: ");
				Scanner in2 = new Scanner(System.in);
				ano = in2.nextInt();
			}while(ano > 2020 || ano < 2011);
		
			System.out.print("Digite o número do mês: ");
			Scanner in3 = new Scanner(System.in);
			mes = in3.nextInt();
			System.out.println();
				
			if (mes == 2) { //Fevereiro
				for (int i=0; i<mesVetorTamFevereiro; i++) {
					System.out.print("Digite a média da temperatura do dia " + (i+1) + "o. do mês " + mes + ": ");
					Scanner in4 = new Scanner(System.in);
					mediaMes[i] = in4.nextDouble();
				}
			}else if ((mes >= 1 || mes <=12) && mes != 2){ //Demais meses
				for (int i=0; i<mesVetorTam; i++) {
					System.out.print("Digite a média da temperatura do dia " + (i+1) + "o. do mês " + mes + ": ");
					Scanner in5 = new Scanner(System.in);
					mediaMes[i] = in5.nextDouble();
				}
			}
			}else if (ano >= 2011 || ano <= 2020) { //Validação do ano caso ano seja válido /////////////////////////////////////////////////////////////////////////////////
				System.out.print("Digite o número do mês: ");
				Scanner in3 = new Scanner(System.in);
				mes = in3.nextInt();
				System.out.println();
					
				if (mes == 2) { //Fevereiro
					for (int i=0; i<mesVetorTamFevereiro; i++) {
						System.out.print("Digite a média da temperatura do dia " + (i+1) + "o. do mês " + mes + ": ");
						Scanner in4 = new Scanner(System.in);
						mediaMes[i] = in4.nextDouble();
					}
				}else if ((mes >= 1 || mes <= 12) && mes != 2){ //Demais meses
					for (int i=0; i<mesVetorTam; i++) {
						System.out.print("Digite a média da temperatura do dia " + (i+1) + "o. do mês " + mes + ": ");
						Scanner in5 = new Scanner(System.in);
						mediaMes[i] = in5.nextDouble();
					}
				}
			}
		
		System.out.println("\nMédia das temperaturas: ");
		for (int b=0; b<31; b++) {
			soma += mediaMes[b];
		}
		media = soma / 31;
		System.out.print(media);
	return mediaMes;
	}
}
	
	
	



