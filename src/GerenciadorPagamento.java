import java.lang.invoke.StringConcatFactory;

public class GerenciadorPagamento {

    public void realizarPagamento(ProcessadorPagamento processador, double valor){
        boolean sucesso = processador.processarPagamento(valor);

        processador.exibietDetalhes();

        if (sucesso){
            System.out.println("Transação finalizada: SUCESSO." );
        }else{

            System.out.println("Transação finalizada: FALHA." );

        }

    }

    public void realizarPagamento(ProcessadorPagamento processador, double valor, String descricaoPedido){
        System.out.println("Processando pedido..." + descricaoPedido);

    }


}// Fim da classe GerenciadorPagamento;
