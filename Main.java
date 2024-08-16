// Classe Principal (Exemplo)
public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoConcreto(new PayPal());
        pagamento.processarPagamento(100.0); 
    }
}
