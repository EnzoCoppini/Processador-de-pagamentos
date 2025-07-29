import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorPagamento gerenciadorPagamento = new GerenciadorPagamento();
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1 - Cartão de crédito");
        System.out.println("2 - Boleto bancário");
        System.out.println("3 - PIX");
        System.out.printf("Sua opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();


        switch (opcao){
            case 1:

                System.out.println(".....Cartão de crédito.....\n");
                System.out.printf("Digite o valor da compra: ");
                double valorCartao = sc.nextDouble();
                sc.nextLine();
                System.out.printf("Digite o número do cartão: ");
                String numeroCartao = sc.nextLine();
                System.out.printf("Digite o nome do titular: ");
                String nomeTitular = sc.nextLine();
                System.out.printf("Digite a validade do cartão: ");
                String validade = sc.nextLine();
                System.out.printf("Digite o CVV do cartão: ");
                int cvv = sc.nextInt();
                sc.nextLine();
                System.out.println("\n");
                PagamentoCartaoCredito pagamentoCartaoCredito = new PagamentoCartaoCredito(numeroCartao, cvv, nomeTitular, validade);
                gerenciadorPagamento.realizarPagamento(pagamentoCartaoCredito,valorCartao);
                break;


            case 2:

                System.out.println(".....Boleto bancário.....\n");
                System.out.printf("Digite o valor da compra: ");
                double valorBoleto = sc.nextDouble();
                sc.nextLine();
                System.out.printf("Digite o código de barras: ");
                String codigoBarras = sc.nextLine();
                System.out.printf("Digite a data de vencimento do boleto: ");
                String dataVencimento = sc.nextLine();
                System.out.println("\n");
                PagamentoBoleto pagamentoBoleto = new PagamentoBoleto(codigoBarras, dataVencimento);
                gerenciadorPagamento.realizarPagamento(pagamentoBoleto, valorBoleto);
                break;


            case 3:

                System.out.println(".....PIX.....\n");
                System.out.printf("Digite o valor da compra: ");
                double valorPix = sc.nextDouble();
                sc.nextLine();
                System.out.println("Selecione o modelo da chave pix");
                System.out.println("1 - CPF");
                System.out.println("2 - Email");
                System.out.println("3 - Telefone");
                System.out.printf("Sua opção: ");
                int opcao2 = sc.nextInt();
                sc.nextLine();

                String tipo = null;
                String chavePix = null;

                if (opcao2 == 1){
                    tipo = "CPF";
                    System.out.printf("Digite a chave " + tipo + ": ");
                    chavePix = sc.nextLine();

                } else if (opcao2 == 2) {
                    tipo = "Email";
                    System.out.printf("Digite a chave " + tipo + ": ");
                    chavePix = sc.nextLine();
                }else{
                    tipo = "Telefone";
                    System.out.printf("Digite a chave " + tipo + ": ");
                    chavePix = sc.nextLine();

                }// Fim if-else;

                PagamentoPix pagamentoPix = new PagamentoPix(chavePix, tipo);
                gerenciadorPagamento.realizarPagamento(pagamentoPix, valorPix);
                break;

        }//Fim switch case;

        sc.close();// Fechamento do scanner;

    }// Fim classe main;
}//Fim clase Main;