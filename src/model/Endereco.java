package model;


public class Endereco {
 
    public String estado;
    public String cidade;
    public String cep;
    public int numero;
    public String logradouro;
    public String complemento;
 
    public Endereco(String estado, String cidade, String cep, int numero,
                    String logradouro, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
        this.complemento = complemento;
    }
 
    public String formatarParaEtiqueta() {
        return logradouro + ", " + numero + " - " + complemento + "\n" +
               cidade + " - " + estado + "\n" +
               "CEP: " + cep;
    }
 
    public boolean validarCEP() {
        // CEP válido: apenas dígitos e 8 caracteres (ex: "01001000")
        String cepLimpo = this.cep.replaceAll("[^0-9]", "");
        return cepLimpo.length() == 8;
    }
 
    @Override
    public String toString() {
        return "Endereco{logradouro='" + logradouro + "', numero=" + numero +
               ", complemento='" + complemento + "', cidade='" + cidade +
               "', estado='" + estado + "', cep='" + cep + "'}";
    }
}