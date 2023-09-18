package uniderp.loo.dominio;


public abstract class BaseIdentificador {

    protected int codigo;
    protected String tipoCombustivel;
    protected String tipoVeiculo;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    
    public BaseIdentificador(int codigo, String tipoCombustivel, String tipoVeiculo) {
        this.codigo = codigo;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoVeiculo = tipoVeiculo;
    }
    

    
}