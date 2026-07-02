package exercicios.exercicioDesafio;

public class Livro {
    private String titulo;
    private String autor;
    private int quantidadeDisponivel;

    public void cadastrar(String titulo, String autor, int quantidade){
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidade;
    }

    public void emprestarLivro(Usuario usuario){
        if(quantidadeDisponivel > 0){
            quantidadeDisponivel--;
            System.out.println("Livro " + titulo + " emprestado para " + usuario.getNome() + ".");
        } else {
            System.out.println("Não há exemplares disponíveis.");
        }
        System.out.println();
    }

    public void devolverLivro(Usuario usuario){
        quantidadeDisponivel++;
        System.out.println("Livro " + titulo + " devolvido por " + usuario.getNome() + ".");
        System.out.println();
    }

    public void exibirLivro(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade disponível: " + quantidadeDisponivel);
        System.out.println();
    }
}