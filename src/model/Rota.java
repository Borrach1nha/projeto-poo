package model;

public class Rota {
 
    public String origem;
    public String destino;
    public double distanciaTotal;
    public double tempoEstimado;
 
    public Rota(String origem, String destino, double distanciaTotal, double tempoEstimado) {
        this.origem = origem;
        this.destino = destino;
        this.distanciaTotal = distanciaTotal;
        this.tempoEstimado = tempoEstimado;
    }
 
    public String estimarChegada() {
        return "Tempo estimado de chegada de " + origem + " até " + destino + ": " + tempoEstimado + " horas.";
    }
 
    public void adicionarParada(String parada) {
        System.out.println("Parada adicionada na rota: " + parada);
    }
 
    @Override
    public String toString() {
        return "Rota{origem='" + origem + "', destino='" + destino +
               "', distanciaTotal=" + distanciaTotal + "km, tempoEstimado=" + tempoEstimado + "h}";
    }
}
 