package uniderp.loo.dominio;

public abstract class BaseDadosComuns extends BaseIdentificador {

    protected String modelo;
    protected int anoModelo;
    protected int anoFabricacao;
    protected double pesoLiquido;
    protected String fabricante;
    protected String nomeProPrietario;
    protected int rodas;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getNomeProPrietario() {
        return nomeProPrietario;
    }
    public void setNomeProPrietario(String nomeProPrietario) {
        this.nomeProPrietario = nomeProPrietario;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    
    public BaseDadosComuns(int codigo, String tipoCombustivel, String tipoVeiculo, String modelo, int anoModelo,
            int anoFabricacao, double pesoLiquido, String fabricante, String nomeProPrietario, int rodas) {
        super(codigo, tipoCombustivel, tipoVeiculo);
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.pesoLiquido = pesoLiquido;
        this.fabricante = fabricante;
        this.nomeProPrietario = nomeProPrietario;
        this.rodas = rodas;
    }
    

    


    
}
