//Bridge
class PagamentoConcreto implements Pagamento {
    private ImplementadorPagamento implementador;

    public PagamentoConcreto(ImplementadorPagamento implementador) {
        this.implementador = implementador;
    }

    @Override
    public void processarPagamento(double valor) {
        implementador.processarPagamentoImpl(valor);
    }

    @Override
    public void solicitarReembolso(String idTransacao) {
        implementador.solicitarReembolsoImpl(idTransacao);
    }
}