public interface IConta {
    // interface é uma classe abstrata com todos os métodos abstratos
    // vai obrigar as classes que a implementam a implementar os métodos
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta contaDestino, double valor);
    void imprimirExtrato();
}
