package process;

import builder.AitBuilder;
import dao.AgenteDao;
import dao.AitDao;
import dao.BairroDao;
import dao.CidadeDao;
import dao.InfracaoDao;
import model.Agente;
import model.Ait;
import model.Bairro;
import model.Cidade;
import model.Infracao;

public class DadosIniciaisLoader {
	public static void carregar(
            AgenteDao agenteDao,
            InfracaoDao infracaoDao,
            CidadeDao cidadeDao,
            BairroDao bairroDao,
            AitDao aitDao) {

        agenteDao.salvar(new Agente(1, "João Silva", "12345"));
        infracaoDao.salvar(new Infracao(101, "Excesso de velocidade", "Art. 218", 7, 293.47));
        cidadeDao.salvar(new Cidade(10, "São Paulo"));
        bairroDao.salvar(new Bairro(100, "Centro"));

        Ait ait1 = new AitBuilder()
                .addCdAit(1)
                .addNrAit("A012025")
                .addDtInfracao("2025-08-24")
                .addVlMulta(293.47)
                .addDsLocalInfracao("Av. Paulista - nº 1000")
                .addDtPrazoDefesa("2025-11-10")
                .addNrCpfCnpjProprietario("12345678901")
                .addNrCepProprietario("01311000")
                .addDsEnderecoProprietario("Av. das Flores")
                .addNrEnderecoProprietario("200")
                .addCdAgente(1)
                .addCdCidade(10)
                .addCdInfracao(101)
                .addCdBairro(100)
                .addNrPlaca("ABC1D23")
                .addNmMarcaModelo("Toyota Corolla")
                .addAnoFabricacao(2020)
                .addAnoModelo(2021)
                .addNrRenavan("98765432100")
                .addNmProprietario("José Almeida")
                .build();

        aitDao.salvar(ait1);
    }
}
