package exercicios.exercicio02;

public class contaBancaria {

    private int id;
    private String titular;
    private double saldo;

    public void cadastrar(int id, String titular){
        this.id = id;
        this.titular = titular;
        System.out.println("Conta cadastrada");
        System.out.println("");
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(valor + "R$ depositados");
        System.out.println("");
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
            System.out.println("Saldo atual: " + this.saldo);
            System.out.println("");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
        System.out.println("");
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("");
    }
}
