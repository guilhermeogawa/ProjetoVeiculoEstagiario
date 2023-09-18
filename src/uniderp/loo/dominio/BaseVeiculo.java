package uniderp.loo.dominio;

public abstract class BaseVeiculo extends BaseDadosComuns {

    protected String cor;
    protected String chassi;
    protected String placa;
    protected double potencia;
    protected String codigoRenavam;
    protected String estado;
    protected String cidade;

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public BaseVeiculo(int codigo, String tipoCombustivel, String tipoVeiculo, String modelo, int anoModelo,
            int anoFabricacao, double pesoLiquido, String fabricante, String nomeProPrietario, int rodas, String cor,
            String chassi, String placa, double potencia, String codigoRenavam, String estado, String cidade) {
        super(codigo, tipoCombustivel, tipoVeiculo, modelo, anoModelo, anoFabricacao, pesoLiquido, fabricante,
                nomeProPrietario, rodas);
        this.cor = cor;
        this.chassi = chassi;
        this.placa = placa;
        this.potencia = potencia;
        this.codigoRenavam = codigoRenavam;
        this.estado = estado;
        this.cidade = cidade;
    }
    

    
    
}
