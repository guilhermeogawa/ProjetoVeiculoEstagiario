import uniderp.loo.dominio.Carro;

public class App {
    public static void main(String[] args) throws Exception {

        Carro C1 = new Carro(0, null, null, null, 0, 0, 0, null, null, 0, null, null, null, 0, null, null, null, 0, null);

        C1.setAnoFabricacao(2012);
        C1.setAnoModelo(2012);
        C1.setChassi("123412341234");
        C1.setCidade("Campo Grande");
        C1.setCodigo(01);
        C1.setCodigoRenavam("123412341234");
        C1.setCor("Prata");
        C1.setEstado("Mato Grosso do Sul");
        C1.setFabricante("Chevrolet");
        C1.setModelo("2012");
        C1.setNome("Cruze");
        C1.setNomeProPrietario("Guilherme");
        C1.setPesoLiquido(1800);
        C1.setPlaca("abc1234");
        C1.setPortas(5);
        C1.setPotencia(147);
        C1.setRodas(4);
        C1.setTipoCombustivel("Gasolina");
        C1.setTipoVeiculo("Carro");

    }
}
