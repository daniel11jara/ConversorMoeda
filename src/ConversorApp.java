import java.util.Scanner;

public class ConversorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		MoedaService moedaService = new MoedaService();
		
		int opcao = 0;
		
		do {
			
			System.out.println("=== Conversor de Moedas ===");
			System.out.println("1) Dollar --> Peso Argentino");
			System.out.println("2) Peso Argentino --> Dollar");
			System.out.println("3) Dollar --> Real");
			System.out.println("4) Real --> Dollar");
			System.out.println("5) Dollar --> Peso Colombiano");
			System.out.println("6) Peso Colombiano --> Dollar");
			System.out.println("7) Sair");
			System.out.print("\nEscolha uma opção válida: ");
			
			opcao = scanner.nextInt();
			
			if(opcao >= 1 && opcao <= 6) {
				System.out.print("Digite um valor para converter: ");
				double valor = scanner.nextDouble();
				
				Convesao conversao = new Convesao();
				conversao.setValor(valor);
				
				switch(opcao) {
				case 1:
					conversao.setMoedaOrigem("USD");
					conversao.setMoedaDestino("ARS");
					break;
				case 2:
					conversao.setMoedaOrigem("ARS");
					conversao.setMoedaDestino("USD");
					break;
				case 3:
					conversao.setMoedaOrigem("USD");
					conversao.setMoedaDestino("BRL");
					break;
				case 4:
					conversao.setMoedaOrigem("BRL");
					conversao.setMoedaDestino("USD");
					break;
				case 5:
					conversao.setMoedaOrigem("USD");
					conversao.setMoedaDestino("COP");
					break;
				case 6:
					conversao.setMoedaOrigem("COP");
					conversao.setMoedaDestino("USD");
					break;
				}
				
				double taxa = moedaService.buscarTaxaCambio(conversao.getMoedaOrigem(), conversao.getMoedaDestino());
				
				if (taxa != -1) {
					double resultado = conversao.getValor() * taxa;
					System.out.printf("Valor da Conversão: %.2f%s \n\n", resultado, conversao.getMoedaDestino());
				} else {
					System.out.println("Não foi possível obter a taxa de cambio. \n");
				}
				
			} else if (opcao == 7) {
				System.out.println("Saindo...");
			} else {
				System.out.println("Opção inválida. Tente novamente. \n");
			}
			
	} while (opcao != 7);
		
		scanner.close();

}
}
