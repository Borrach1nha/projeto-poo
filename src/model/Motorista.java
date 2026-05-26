package model;
 
public class Motorista extends Funcionario {
 
    public String categoriaHabilitacao;
 
    public Motorista(String nome, String cpf, String cnh, double salario, String categoriaHabilitacao) {
        super(nome, cpf, cnh, "Motorista", salario);
        this.categoriaHabilitacao = categoriaHabilitacao;
    }
 
    @Override
    public void realizarTarefa() {
        System.out.println("Motorista " + nome + " (CNH categoria " + categoriaHabilitacao + ") está conduzindo o veículo na rota.");
    }
}