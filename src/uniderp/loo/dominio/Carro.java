package uniderp.loo.dominio;

public class Carro extends BasePortas {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro(int codigo, String tipoCombustivel, String tipoVeiculo, String modelo, int anoModelo,
            int anoFabricacao, double pesoLiquido, String fabricante, String nomeProPrietario, int rodas, String cor,
            String chassi, String placa, double potencia, String codigoRenavam, String estado, String cidade,
            int portas, String nome) {
        super(codigo, tipoCombustivel, tipoVeiculo, modelo, anoModelo, anoFabricacao, pesoLiquido, fabricante,
                nomeProPrietario, rodas, cor, chassi, placa, potencia, codigoRenavam, estado, cidade, portas);
        this.nome = nome;
    }

    

    

    

    


    

   

    
    
    
}
