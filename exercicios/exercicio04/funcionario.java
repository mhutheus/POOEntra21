package exercicios.exercicio04;

public class funcionario {
    private String  nome;
    private double salario;

    public void cadastrar(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public void aumentarSalario(double percentual){
        System.out.println("Salário do/a aumentado por " + percentual + "%");
        percentual = percentual/100;
        this.salario += salario*percentual;
        System.out.println("Salário atual: " + this.salario);
        System.out.println("");
    }
    public void calcularSalarioAnual(){
        System.out.println("Salário anual: " + (salario*13) + "R$");
        System.out.println("");

    }
    public void exibirDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Salário: " + salario + "R$");
        System.out.println("Salario anual: " + (salario*13) + "R$");
        System.out.println("");
    }
}
