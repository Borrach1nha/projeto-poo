package main;

import model.Encomenda;
import model.Veiculo;
import model.Rota;
import model.Funcionario;
import model.Endereco;

// Samuel Asafe - RGA 202321901040

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
        // CRIANDO VEÍCULOS
        // =========================
 
        Veiculo veiculo1 = new Veiculo(
            "Fiat Ducato",
            "ABC-1234",
            1500.0,
            "disponivel"
        );
 
        Veiculo veiculo2 = new Veiculo(
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
        // CRIANDO FUNCIONÁRIOS
        // =========================
 
        Funcionario funcionario1 = new Funcionario(
            "Carlos Silva",
            "123.456.789-00",
            "ABC12345",
            "Motorista",
            3500.00
        );
 
        Funcionario funcionario2 = new Funcionario(
            "Fernanda Lima",
            "987.654.321-00",
            "DEF67890",
            "Entregador",
            2800.00
        );
 
        System.out.println("=== FUNCIONÁRIOS ===");
        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println();
 
        // =========================
        // OPERAÇÕES
        // =========================
 
        System.out.println("=== OPERAÇÕES ===");
 
        // Funcionário atribui veículo e registra entregas
        funcionario1.atribuirVeiculo(veiculo1);
        funcionario1.registrarEntrega(encomenda1);
        funcionario2.atribuirVeiculo(veiculo2);
        funcionario2.registrarEntrega(encomenda2);
 
        System.out.println();
 
        // Verificar endereços
        System.out.println("Endereço 1 válido? " + endereco1.validarCEP());
        System.out.println("Etiqueta:\n" + endereco1.formatarParaEtiqueta());
        System.out.println();
        System.out.println("Endereço 2 válido? " + endereco2.validarCEP());
        System.out.println("Etiqueta:\n" + endereco2.formatarParaEtiqueta());
 
    }
 
}
 