package exercicios.exercicioDesafio;

public class Usuario {
    private String nome;
    private int matricula;

    public void cadastrar(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void exibirUsuario(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println();
    }
}