package uniderp.loo.dominio;

public class Caminhao extends BasePortas implements IPesagem{

    private int eixos;

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public Caminhao(int codigo, String tipoCombustivel, String tipoVeiculo, String modelo, int anoModelo,
            int anoFabricacao, double pesoLiquido, String fabricante, String nomeProPrietario, int rodas, String cor,
            String chassi, String placa, double potencia, String codigoRenavam, String estado, String cidade,
            int portas, int eixos) {
        super(codigo, tipoCombustivel, tipoVeiculo, modelo, anoModelo, anoFabricacao, pesoLiquido, fabricante,
                nomeProPrietario, rodas, cor, chassi, placa, potencia, codigoRenavam, estado, cidade, portas);
        this.eixos = eixos;
    }

    @Override
    public void Pesar() {
        
    }

    

    

    
    
}
