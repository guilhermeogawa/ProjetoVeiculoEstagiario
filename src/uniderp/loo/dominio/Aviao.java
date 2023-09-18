package uniderp.loo.dominio;

public class Aviao 
extends BasePassageiros implements IPesagem{

    private int qtdeMotores;

    public int getQtdeMotores() {
        return qtdeMotores;
    }

    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }

    public Aviao(int codigo, String tipoCombustivel, String tipoVeiculo, String modelo, int anoModelo,
            int anoFabricacao, double pesoLiquido, String fabricante, String nomeProPrietario, int rodas, int assentos,
            int qtdeOcupantes, int qtdeMotores) {
        super(codigo, tipoCombustivel, tipoVeiculo, modelo, anoModelo, anoFabricacao, pesoLiquido, fabricante,
                nomeProPrietario, rodas, assentos, qtdeOcupantes);
        this.qtdeMotores = qtdeMotores;
    }

    @Override
    public void Pesar() {
        
    }

    

    
    
    
    
}
