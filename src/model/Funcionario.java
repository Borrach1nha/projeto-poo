package model;
 
public class Funcionario {
 
    public String nome;
    public String cpf;
    public String cnh;
    public String cargo;
    public double salario;
 
    public Funcionario(String nome, String cpf, String cnh, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.cargo = cargo;
        this.salario = salario;
    }
 
    public void realizarTarefa() {
        System.out.println(nome + " está realizando uma tarefa geral.");
    }
 
    public void atribuirVeiculo(Veiculo veiculo) {
        System.out.println("Veículo " + veiculo.placa + " atribuído ao funcionário " + this.nome + ".");
    }
 
    public void registrarEntrega(Encomenda encomenda) {
        System.out.println("Entrega da encomenda " + encomenda.codigoRastreio +
                           " registrada pelo funcionário " + this.nome + ".");
    }
 
    @Override
    public String toString() {
        return "Funcionario{nome='" + nome + "', cpf='" + cpf + "', cnh='" + cnh +
               "', cargo='" + cargo + "', salario=R$" + salario + "}";
    }
}
 