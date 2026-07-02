package exercicios.exercicio06;

public class carro {

    private String modelo;
    private String marca;
    private int velocidadeAtual;

    public void cadastrar(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int velocidade) {
        if (velocidade > 0) {
            this.velocidadeAtual += velocidade;
            System.out.println("Nova velocidade: " + this.velocidadeAtual);
            System.out.println("");
        } else {
            System.out.println("Velocidade inválida");
            System.out.println("");
        }
    }

    public void frear(int velocidade) {
        if (velocidade <= velocidadeAtual) {
            if (velocidade > 0) {
                this.velocidadeAtual -= velocidade;
                System.out.println("Nova velocidade: " + this.velocidadeAtual);
                System.out.println("");
            } else {
                System.out.println("Velocidade inválida");
                System.out.println("");
            }
        } else {
            System.out.println("Velocidade inválida");
            System.out.println("");
        }
    }

    public void exibirDados() {
        System.out.println("Modelo: "+ modelo);
        System.out.println("Marca: "+ marca);
        System.out.println("Velocidade: "+ velocidadeAtual);
        System.out.println("");
    }

}
