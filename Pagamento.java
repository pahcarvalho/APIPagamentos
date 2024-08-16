//Abstração

interface Pagamento {
    void processarPagamento(double valor);
    void solicitarReembolso(String idTransacao);
}