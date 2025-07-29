public class PagamentoBoleto implements ProcessadorPagamento{

    private String codigoBarras;
    private String dataVencimento;

    public PagamentoBoleto (String codigoBarras, String dataVencimento){
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Boleto de: R$ " + valor + " com vencimento em " + dataVencimento + " gerado e processado com sucesso." );
        return true;
    }

    @Override
    public  void exibietDetalhes() {
        System.out.println("Método: Boleto bancário - Codigo de barras: " + codigoBarras);
    }
}
