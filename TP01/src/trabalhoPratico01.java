//Trabalho Pr�tico 01
import java.util.Scanner;

public  class trabalhoPratico01 {
	int teste = 5;
	public static void main(String[] args) {  //Fun��o main
		menu();
		
	}

	
	
	public  static void menu() {  //Fun��o menu
		int opcao;
		
		System.out.println("Menu de op��es: ");
		System.out.println("1 - Entrada das temperaturas");
		System.out.println("2 - C�culo da temperatura m�dia");
		System.out.println("3 - C�lculo da temperatura m�nima");
		System.out.println("4 - C�lculo da temperatura m�xima");
		System.out.println("5 - Relat�rio meteorol�gico");
		System.out.print("\n");
		System.out.print("Escolha uma op��o: ");
		Scanner in1 = new Scanner(System.in);
		opcao = in1.nextInt();
		
		switch (opcao) {
			case 1: 
				double[] mediaMesDois = new double[31];
				EntradaTemperaturas(mediaMesDois);
				break;
			case 2:
				//Chama a fun��o
				System.out.print("C�culo da temperatura m�dia");
				break;
			case 3: 
				//Chama a fun��o
				System.out.print("C�lculo da temperatura m�nima");
				break;
			case 4: 
				//Chama a fun��o
				System.out.print("C�lculo da temperatura m�xima");
				break;
			case 5: 
				//Chama a fun��o
				System.out.print("Relat�rio meteorol�gico");
				break;
		}
	}
	
	
	
	public  static double[] EntradaTemperaturas(double[] mediaMes) { //Fun��o 1 - Entrada das Temperaturas
		
		int mesVetorTam = 31; //Marcador de tamanho do vetor para meses n�o fevereiro
		int mesVetorTamFevereiro = 29; //Marcador de tamanho do vetor para meses n�o fevereiro
		int ano, mes; //Respectivamente, guardam o n�mero do ano e do m�s
		double soma = 0, media = 0;
		
		System.out.println("--> Fun��o Entrada de Temperaturas\n"); 
		System.out.print("Digite um ano entre 2011 e 2020: ");
		Scanner in1 = new Scanner(System.in);
		ano = in1.nextInt();
		if (ano > 2020 || ano < 2011) {//Valida��o do ano caso ano seja inv�lido /////////////////////////////////////////////////////////////////////////////////
			do {
				System.out.println("\nAno inv�lido!");
				System.out.print("Digite um ano v�lido: ");
				Scanner in2 = new Scanner(System.in);
				ano = in2.nextInt();
			}while(ano > 2020 || ano < 2011);
		
			System.out.print("Digite o n�mero do m�s: ");
			Scanner in3 = new Scanner(System.in);
			mes = in3.nextInt();
			System.out.println();
				
			if (mes == 2) { //Fevereiro
				for (int i=0; i<mesVetorTamFevereiro; i++) {
					System.out.print("Digite a m�dia da temperatura do dia " + (i+1) + "o. do m�s " + mes + ": ");
					Scanner in4 = new Scanner(System.in);
					mediaMes[i] = in4.nextDouble();
				}
			}else if ((mes >= 1 || mes <=12) && mes != 2){ //Demais meses
				for (int i=0; i<mesVetorTam; i++) {
					System.out.print("Digite a m�dia da temperatura do dia " + (i+1) + "o. do m�s " + mes + ": ");
					Scanner in5 = new Scanner(System.in);
					mediaMes[i] = in5.nextDouble();
				}
			}
			}else if (ano >= 2011 || ano <= 2020) { //Valida��o do ano caso ano seja v�lido /////////////////////////////////////////////////////////////////////////////////
				System.out.print("Digite o n�mero do m�s: ");
				Scanner in3 = new Scanner(System.in);
				mes = in3.nextInt();
				System.out.println();
					
				if (mes == 2) { //Fevereiro
					for (int i=0; i<mesVetorTamFevereiro; i++) {
						System.out.print("Digite a m�dia da temperatura do dia " + (i+1) + "o. do m�s " + mes + ": ");
						Scanner in4 = new Scanner(System.in);
						mediaMes[i] = in4.nextDouble();
					}
				}else if ((mes >= 1 || mes <= 12) && mes != 2){ //Demais meses
					for (int i=0; i<mesVetorTam; i++) {
						System.out.print("Digite a m�dia da temperatura do dia " + (i+1) + "o. do m�s " + mes + ": ");
						Scanner in5 = new Scanner(System.in);
						mediaMes[i] = in5.nextDouble();
					}
				}
			}
		
		System.out.println("\nM�dia das temperaturas: ");
		for (int b=0; b<31; b++) {
			soma += mediaMes[b];
		}
		media = soma / 31;
		System.out.print(media);
	return mediaMes;
	}
}
	
	
	



