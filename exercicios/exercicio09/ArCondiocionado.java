package exercicios.exercicio09;

public class ArCondiocionado {

    private double temperaturaAtual;
    double temperatura;

    public void cadastrar(double temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperaturaAtual = temperatura;
            System.out.println("Temperatura atual: "+ this.temperaturaAtual);
            System.out.println("");
        } else {
            System.out.println("Temperatura inválida");
            System.out.println("");
        }
    }

    public void aumentarTemperatura(double mudanca) {
        if (mudanca > 0) {
            temperatura = (this.temperaturaAtual + mudanca);
            if (temperatura >= 16 && temperatura <= 30) {
                this.temperaturaAtual = temperatura;
                System.out.println("Temperatura atual: "+ this.temperaturaAtual);
                System.out.println("");
            } else {
                System.out.println("Mudanca inválida");
                System.out.println("");
            }
        } else {
            System.out.println("Mudanca inválida");
            System.out.println("");
        }
    }

    public void diminuirTemperatura(double mudanca) {
        if (mudanca > 0) {
            temperatura = (this.temperaturaAtual - mudanca);
            if (temperatura >= 16 && temperatura <= 30) {
                this.temperaturaAtual = temperatura;
                System.out.println("Temperatura atual: "+ this.temperaturaAtual);
                System.out.println("");
            } else {
                System.out.println("Mudanca inválida");
                System.out.println("");
            }
        } else {
            System.out.println("Mudanca inválida");
            System.out.println("");
        }
    }
}
