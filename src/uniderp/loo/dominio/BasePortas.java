package uniderp.loo.dominio;

public abstract class BasePortas extends BaseVeiculo {
    
    protected int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public BasePortas(int codigo, String tipoCombustivel, String tipoVeiculo, String modelo, int anoModelo,
            int anoFabricacao, double pesoLiquido, String fabricante, String nomeProPrietario, int rodas, String cor,
            String chassi, String placa, double potencia, String codigoRenavam, String estado, String cidade,
            int portas) {
        super(codigo, tipoCombustivel, tipoVeiculo, modelo, anoModelo, anoFabricacao, pesoLiquido, fabricante,
                nomeProPrietario, rodas, cor, chassi, placa, potencia, codigoRenavam, estado, cidade);
        this.portas = portas;
    }
    
    
    
}
