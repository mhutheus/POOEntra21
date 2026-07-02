package exercicios.exercicio07;

public class lampada {
    private boolean estado;

    public void cadastrar(){
        this.estado = false;
    }
    public void ligar(){
        if(!estado){
        this.estado = true;
        System.out.println("Lâmpada ligada.");
        System.out.println("");
        }
        else{
            System.out.println("Lâmpada já estava ligada.");
            System.out.println("");
        }
    }
    public void desligar(){
        if(estado){
            this.estado = false;
            System.out.println("Lâmpada desligada.");
            System.out.println("");
        }
        else{
            System.out.println("Lâmpada já estava desligada.");
            System.out.println("");
        }
    }
    public void mostrarEstado(){
        if(estado){
            System.out.println("Estado: Ligada");
            System.out.println("");
        }
        else{
            System.out.println("Estado: Desligada");
            System.out.println("");
        }
    }
}
