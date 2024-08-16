// Implementação
interface ImplementadorPagamento {
    void processarPagamentoImpl(double valor);
    void solicitarReembolsoImpl(String idTransacao);
}

// PayPal
class PayPal implements ImplementadorPagamento {
    // ... implementação específica da API PayPal

    @Override
    public void processarPagamentoImpl(double valor) {
        // Lógica de processamento de pagamento via PayPal
        System.out.println("Processando pagamento de R$ " + valor + " via PayPal");
    }

    @Override
    public void solicitarReembolsoImpl(String idTransacao) {
        // Lógica de solicitação de reembolso via PayPal
        System.out.println("Solicitando reembolso para a transação " + idTransacao + " via PayPal");
    }
}

//PagSeguro
class PagSeguro implements ImplementadorPagamento {
    // ... implementação específica da API PagSeguro

    @Override
    public void processarPagamentoImpl(double valor) {
        // Lógica de processamento de pagamento via PagSeguro
        System.out.println("Processando pagamento de R$ " + valor + " via PagSeguro");
    }

    @Override
    public void solicitarReembolsoImpl(String idTransacao) {
        // Lógica de solicitação de reembolso via PagSeguro
        System.out.println("Solicitando reembolso para a transação " + idTransacao + " via PagSeguro");
    }
}

//Visa
class Visa implements ImplementadorPagamento {
    // ... implementação específica da API Visa

    @Override
    public void processarPagamentoImpl(double valor) {
        // Lógica de processamento de pagamento via Visa
        System.out.println("Processando pagamento de R$ " + valor + " via Visa");
    }

    @Override
    public void solicitarReembolsoImpl(String idTransacao) {
        // Lógica de solicitação de reembolso via Visa
        System.out.println("Solicitando reembolso para a transação " + idTransacao + " via Visa");
    }
}