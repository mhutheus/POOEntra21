package exercicios.exercicioDesafio;

public class Main {
    public static void main(String[] args) {

        Livro a = new Livro();
        a.cadastrar("O Cortiço", "Aluízio de Azevedo", 3);

        Livro b = new Livro();
        b.cadastrar("Memórias Póstumas de Brás Cubas", "Machado de Assis", 5);

        Usuario joao = new Usuario();
        joao.cadastrar("João", 1);

        Usuario maria = new Usuario();
        maria.cadastrar("Maria", 2);

        a.emprestarLivro(joao);
        b.emprestarLivro(maria);

        a.devolverLivro(joao);
        b.devolverLivro(maria);

        a.exibirLivro();
        b.exibirLivro();
    }
}