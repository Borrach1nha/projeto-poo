package model;
 
public class VeiculoPequeno extends Veiculo {
 
    public VeiculoPequeno(String modelo, String placa, double capacidadeDeCarga, String status) {
        super(modelo, placa, capacidadeDeCarga, status);
    }
 
    @Override
    public double calcularCapacidadeUtil() {
        // Veículos pequenos têm menos espaço de manobra: 90% da capacidade
        double capacidadeUtil = this.capacidadeDeCarga * 0.90;
        System.out.println("Veículo pequeno " + placa + " - Capacidade útil: " + capacidadeUtil + "kg");
        return capacidadeUtil;
    }
}