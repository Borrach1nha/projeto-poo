package model;

public class Encomenda {
 
    public String codigoRastreio;
    public double peso;
    public double valor;
 
    public Encomenda(String codigoRastreio, double peso, double valor) {
        this.codigoRastreio = codigoRastreio;
        this.peso = peso;
        this.valor = valor;
    }
 
    public double calcularFrete() {
        // Regra simples: R$5,00 por kg + 1% do valor declarado
        double frete = (this.peso * 5.0) + (this.valor * 0.01);
        return frete;
    }
 
    @Override
    public String toString() {
        return "Encomenda{codigoRastreio='" + codigoRastreio + "', peso=" + peso +
               "kg, valor=R$" + valor + "}";
    }
}
 