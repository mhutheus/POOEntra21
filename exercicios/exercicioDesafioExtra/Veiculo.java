package exercicios.exercicioDesafioExtra;

public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private boolean disponivel;

    public void cadastrar(String placa, String modelo, int ano){
        if(ano < 2027){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.disponivel = true;
        }
        else{
            System.out.println("Ano inválido");
            System.out.println("");
        }
    }

    public void alugar(){
        if(this.disponivel){
            this.disponivel = false;
            System.out.println("Carro de placa " + this.placa + " foi alugado");
            System.out.println("");
        }
        else{
            System.out.println("Carro de placa " + this.placa + " já estava alugado");
            System.out.println("");
        }
    }
    public void devolver(){
        if(!this.disponivel){
            this.disponivel = true;
            System.out.println("Carro de placa " + this.placa + " devolvido");
            System.out.println("");
        }
        else{
            System.out.println("Carro de placa " + this.placa + " já estava devolvido");
            System.out.println("");
        }
    }
    public void exibirCarro(){
        System.out.println("Placa: "+ placa);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: "+ ano);
        if(this.disponivel){
            System.out.println("Status: Disponível");
            System.out.println("");
        }
        else{
            System.out.println("Status: Não disponível");
            System.out.println("");
        }
    }
}
