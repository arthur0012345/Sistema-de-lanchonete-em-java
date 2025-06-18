import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String nomeDoCliente;
		String pedidoDoCliente;
		int nota;
		int opcao;
		
		System.out.println("*** Seja bem-vindo a lanchonete pobre food ! ***");
		System.out.println("Digite seu nome!");
		nomeDoCliente= input.nextLine();

		do {
			System.out.println("*** Menu da lanchonete ! ***");
			System.out.println(" 1 pedir Hamburguer ");
			System.out.println(" 2 pedir Batata Frita ");
			System.out.println(" 3 pedir Milkshhake ");
			System.out.println(" 4 pedir Refrigerante ");
			System.out.println(" 5 pedir Combo ");
			System.out.println(" 6 Encerrar ");


			
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				pedidoDoCliente = "Hamburguer";
				System.out.println("Você pedio " + pedidoDoCliente );
				break;
			case 2:
				pedidoDoCliente = "Batata Frita";
				System.out.println("Você* pedio " + pedidoDoCliente );
				break;
			case 3:
				pedidoDoCliente = "Milkshhake";
				System.out.println("Você* pedio " + pedidoDoCliente );
				break;
			case 4:
				pedidoDoCliente = "Refrigerante";
				System.out.println("Você* pedio " + pedidoDoCliente );
				break;
			case 5:
				pedidoDoCliente = "Combo";
				System.out.println("Você* pedio " + pedidoDoCliente );
				break;
			case 6:
				System.out.println("obrigado pela preferencia");
				break;
			default:
				System.out.println("Opcao invalida.");

			}
		} while (opcao != 6);
		System.out.println("Analise nosso atentimento de 1 a 5 e o quanto que você* recomenda");
		nota = input.nextInt();
		if(nota == 5) {
			System.out.println("Muito obrigado, você* achou meu atentimento exelente !");
		}
		if (nota == 5) {
			System.out.println("obrigado pela preferencia, isso ajuda no nosso atentimento!");
		}
		if(nota == 3) {
			System.out.println("certo.obrigado pela preferencia, isso ajuda no nosso atentimento!");
		}
		if(nota == 2) {
			System.out.println("obrigado, vamos melhorar o nosso atentimento");
		}
		if (nota == 1) {
			System.out.println("vamos melhorar o nosso atentimento");
		}
	}
}













