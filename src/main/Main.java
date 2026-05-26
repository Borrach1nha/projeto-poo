package main;
 
import model.Endereco;
import model.Encomenda;
import model.Veiculo;
import model.VeiculoPequeno;
import model.VeiculoGrande;
import model.Rota;
import model.Funcionario;
import model.Motorista;
import model.Entregador;
 
public class Main {
 
    public static void main(String[] args) {
 
        // =========================
        // CRIANDO ENDEREÇOS
        // =========================
 
        Endereco endereco1 = new Endereco(
            "SP",
            "São Paulo",
            "01001000",
            100,
            "Praça da Sé",
            "Apto 12"
        );
 
        Endereco endereco2 = new Endereco(
            "RJ",
            "Rio de Janeiro",
            "20040020",
            200,
            "Av. Rio Branco",
            ""
        );
 
        // =========================
        // CRIANDO VEÍCULOS (com polimorfismo)
        // =========================
 
        Veiculo veiculo1 = new VeiculoPequeno(
            "Fiat Ducato",
            "ABC-1234",
            1500.0,
            "disponivel"
        );
 
        Veiculo veiculo2 = new VeiculoGrande(
            "Mercedes Sprinter",
            "XYZ-5678",
            2000.0,
            "em rota"
        );
 
        System.out.println("=== VEÍCULOS ===");
        System.out.println(veiculo1);
        System.out.println(veiculo2);
        System.out.println();
 
        // =========================
        // CRIANDO ROTAS
        // =========================
 
        Rota rota1 = new Rota(
            "São Paulo",
            "Rio de Janeiro",
            430.0,
            5.5
        );
 
        System.out.println("=== ROTAS ===");
        System.out.println(rota1);
        System.out.println();
 
        // =========================
        // CRIANDO ENCOMENDAS
        // =========================
 
        Encomenda encomenda1 = new Encomenda(
            "BR123456789",
            10.0,
            350.00
        );
 
        Encomenda encomenda2 = new Encomenda(
            "BR987654321",
            2.5,
            80.00
        );
 
        System.out.println("=== ENCOMENDAS ===");
        System.out.println(encomenda1);
        System.out.println(encomenda2);
        System.out.println();
 
        // =========================
        // CRIANDO FUNCIONÁRIOS (com polimorfismo)
        // =========================
 
        Funcionario funcionario1 = new Motorista(
            "Carlos Silva",
            "123.456.789-00",
            "ABC12345",
            3500.00,
            "E"
        );
 
        Funcionario funcionario2 = new Entregador(
            "Fernanda Lima",
            "987.654.321-00",
            "DEF67890",
            2800.00,
            "Centro"
        );
 
        System.out.println("=== FUNCIONÁRIOS ===");
        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println();
 
        // =========================
        // POLIMORFISMO EM AÇÃO
        // =========================
 
        System.out.println("=== POLIMORFISMO - FUNCIONÁRIOS ===");
        funcionario1.realizarTarefa();
        funcionario2.realizarTarefa();
        System.out.println();
 
        System.out.println("=== POLIMORFISMO - VEÍCULOS ===");
        veiculo1.calcularCapacidadeUtil();
        veiculo2.calcularCapacidadeUtil();
        System.out.println();
 
        // =========================
        // OPERAÇÕES
        // =========================
 
        System.out.println("=== OPERAÇÕES ===");
 
        funcionario1.atribuirVeiculo(veiculo1);
        funcionario1.registrarEntrega(encomenda1);
        funcionario2.atribuirVeiculo(veiculo2);
        funcionario2.registrarEntrega(encomenda2);
 
        System.out.println();
 
        System.out.println("Endereço 1 válido? " + endereco1.validarCEP());
        System.out.println("Etiqueta:\n" + endereco1.formatarParaEtiqueta());
        System.out.println();
        System.out.println("Endereço 2 válido? " + endereco2.validarCEP());
        System.out.println("Etiqueta:\n" + endereco2.formatarParaEtiqueta());
 
    }
 
}