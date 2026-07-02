package exercicios.exercicio05;

public class livro {

    private String titulo;
    private String autor;
    private boolean disponivel;

    public void cadastrar(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            this.disponivel = false;
            System.out.println("Livro " + this.titulo + " emprestado.");
            System.out.println("");
        } else {
            System.out.println("Livro " + this.titulo + " indisponível");
            System.out.println("");
        }
    }

    public void devolver() {
        this.disponivel = true;
        System.out.println("Livro " + this.titulo + " devolvido");
        System.out.println("");
    }

    public void exibirInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponível: " + disponivel);
        System.out.println("");
    }
}
