package uniderp.loo.dominio;

public abstract class BasePassageiros extends BaseDadosComuns {

    protected int assentos;
    protected int qtdeOcupantes;
    
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    
    public BasePassageiros(int codigo, String tipoCombustivel, String tipoVeiculo, String modelo, int anoModelo,
            int anoFabricacao, double pesoLiquido, String fabricante, String nomeProPrietario, int rodas, int assentos,
            int qtdeOcupantes) {
        super(codigo, tipoCombustivel, tipoVeiculo, modelo, anoModelo, anoFabricacao, pesoLiquido, fabricante,
                nomeProPrietario, rodas);
        this.assentos = assentos;
        this.qtdeOcupantes = qtdeOcupantes;
    }
    
    
}
