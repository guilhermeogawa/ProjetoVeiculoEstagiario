package uniderp.loo.dominio;

public class Motocicletas extends BaseVeiculo {

    private double cilindradas;

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Motocicletas(int codigo, String tipoCombustivel, String tipoVeiculo, String modelo, int anoModelo,
            int anoFabricacao, double pesoLiquido, String fabricante, String nomeProPrietario, int rodas, String cor,
            String chassi, String placa, double potencia, String codigoRenavam, String estado, String cidade,
            double cilindradas) {
        super(codigo, tipoCombustivel, tipoVeiculo, modelo, anoModelo, anoFabricacao, pesoLiquido, fabricante,
                nomeProPrietario, rodas, cor, chassi, placa, potencia, codigoRenavam, estado, cidade);
        this.cilindradas = cilindradas;
    }

    
    


    
}
