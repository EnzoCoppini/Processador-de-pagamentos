public class PagamentoCartaoCredito implements ProcessadorPagamento {

    private String numeroCartao;
    private String nomeTitular;
    private String validade;
    private int cvv;

    public PagamentoCartaoCredito(String numeroCartao, int cvv, String nomeTitular, String validade) {
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
    }

    @Override
    public boolean processarPagamento(double valor) {
        String numeroCartaoMascarado = mascararNumeroCartao();

        if (valor < 1000) {
            System.out.println("Pagamento de: R$ " + valor + " via cartão de crédito " + numeroCartaoMascarado + " processado com sucesso.");
            return true;
        } else {
            System.out.println("Pagamento de: R$ " + valor + " via cartão de crédito " + numeroCartaoMascarado + " processado com falha.");
            return false;
        }
    }

    private String mascararNumeroCartao() {
        if (numeroCartao.length() < 4) {
            return "****"; // fallback seguro
        }
        return "*".repeat(numeroCartao.length() - 4) + numeroCartao.substring(numeroCartao.length() - 4);
    }

    public  void exibietDetalhes(){

        System.out.println("Método: Cartão de crédito - Titular: " + nomeTitular);
    }
}
