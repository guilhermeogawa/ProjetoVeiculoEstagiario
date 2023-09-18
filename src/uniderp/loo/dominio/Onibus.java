package uniderp.loo.dominio;

public class Onibus extends BasePortas implements IPesagem{

    private String viacao;

    public String getViacao() {
        return viacao;
    }

    public void setViacao(String viacao) {
        this.viacao = viacao;
    }

    public Onibus(int codigo, String tipoCombustivel, String tipoVeiculo, String modelo, int anoModelo,
            int anoFabricacao, double pesoLiquido, String fabricante, String nomeProPrietario, int rodas, String cor,
            String chassi, String placa, double potencia, String codigoRenavam, String estado, String cidade,
            int portas, String viacao) {
        super(codigo, tipoCombustivel, tipoVeiculo, modelo, anoModelo, anoFabricacao, pesoLiquido, fabricante,
                nomeProPrietario, rodas, cor, chassi, placa, potencia, codigoRenavam, estado, cidade, portas);
        this.viacao = viacao;
    }

    @Override
    public void Pesar() {
        
    }

    

    

    
    
}
