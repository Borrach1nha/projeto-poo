package model;
 
public class Entregador extends Funcionario {
 
    public String setorDeEntrega;
 
    public Entregador(String nome, String cpf, String cnh, double salario, String setorDeEntrega) {
        super(nome, cpf, cnh, "Entregador", salario);
        this.setorDeEntrega = setorDeEntrega;
    }
 
    @Override
    public void realizarTarefa() {
        System.out.println("Entregador " + nome + " está realizando entregas no setor: " + setorDeEntrega + ".");
    }
}
 