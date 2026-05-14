package model;

public class Veiculo {
 
    public String modelo;
    public String placa;
    public double capacidadeDeCarga;
    public String status;
 
    public Veiculo(String modelo, String placa, double capacidadeDeCarga, String status) {
        this.modelo = modelo;
        this.placa = placa;
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.status = status;
    }
 
    public boolean verificarDisponibilidade() {
        return this.status.equalsIgnoreCase("disponivel");
    }
 
    public String verificarStatus() {
        return "Status atual do veículo " + this.placa + ": " + this.status;
    }
 
    @Override
    public String toString() {
        return "Veiculo{modelo='" + modelo + "', placa='" + placa +
               "', capacidadeDeCarga=" + capacidadeDeCarga + ", status='" + status + "'}";
    }
}
 
