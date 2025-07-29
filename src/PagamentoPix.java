public class PagamentoPix implements ProcessadorPagamento {

    private String chavePix;
    private String tipoChave;


    public PagamentoPix(String chavePix, String tipoChave){
        this.chavePix = chavePix;
        this.tipoChave = tipoChave;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (chavePix == null || chavePix.isEmpty() || tipoChave == null || tipoChave.isEmpty() ){
            System.out.println("Pagamento falhou. Chave pix ou tipo invalido.");
            return false;
        }else{
            System.out.println("Pagamento feito com sucesso.");
            return true;
        }
    }

    @Override
    public  void exibietDetalhes() {
        System.out.println("Método: PIX - Chave:" + chavePix + " tipo da chave: " + tipoChave);
    }
}
