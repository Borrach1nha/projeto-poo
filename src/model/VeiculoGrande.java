package model;
 
public class VeiculoGrande extends Veiculo {
 
    public VeiculoGrande(String modelo, String placa, double capacidadeDeCarga, String status) {
        super(modelo, placa, capacidadeDeCarga, status);
    }
 
    @Override
    public double calcularCapacidadeUtil() {
        // Veículos grandes precisam reservar mais espaço para manobra: 70% da capacidade
        double capacidadeUtil = this.capacidadeDeCarga * 0.70;
        System.out.println("Veículo grande " + placa + " - Capacidade útil: " + capacidadeUtil + "kg");
        return capacidadeUtil;
    }
}