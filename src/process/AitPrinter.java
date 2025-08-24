package process;

import dao.AgenteDao;
import dao.BairroDao;
import dao.CidadeDao;
import dao.InfracaoDao;
import model.Agente;
import model.Ait;
import model.Bairro;
import model.Cidade;
import model.Infracao;

public class AitPrinter {
    public static void imprimir(
            Ait ait,
            AgenteDao agenteDao,
            InfracaoDao infracaoDao,
            CidadeDao cidadeDao,
            BairroDao bairroDao) {

        Agente agente = agenteDao.buscar(ait.getCdAgente());
        Infracao infracao = infracaoDao.buscar(ait.getCdInfracao());
        Cidade cidade = cidadeDao.buscar(ait.getCdCidade());
        Bairro bairro = bairroDao.buscar(ait.getCdBairro());

        System.out.println("=========================================================\n");
        System.out.println("=== AIT nº " + ait.getNrAit() + " ===");
        System.out.println("Data infração : " + ait.getDtInfracao());
        System.out.println("Local         : " + ait.getDsLocalInfracao());
        System.out.println("Multa         : R$ " + ait.getVlMulta());
        System.out.println("Prazo defesa  : " + ait.getDtPrazoDefesa());
        System.out.println("Proprietário  : " + ait.getNmProprietario() + " | CPF/CNPJ " + ait.getNrCpfCnpjProprietario());
        System.out.println("Endereço      : " + ait.getDsEnderecoProprietario() + ", nº " + ait.getNrEnderecoProprietario());
        System.out.println("CEP           : " + ait.getNrCepProprietario());
        System.out.println("Bairro        : " + bairro.getNmBairro());
        System.out.println("Cidade        : " + cidade.getNmCidade());

        System.out.println("Placa         : " + ait.getNrPlaca());
        System.out.println("Marca/Modelo  : " + ait.getNmMarcaModelo());
        System.out.println("Ano Fabricação: " + ait.getAnoFabricacao());
        System.out.println("Ano Modelo    : " + ait.getAnoModelo());
        System.out.println("Renavan       : " + ait.getNrRenavan());

        System.out.println("Agente        : " + agente.getNmAgente() + " (Matrícula: " + agente.getNrMatricula() + ")");
        System.out.println("Infração      : " + infracao.getDsInfracao()
                + " | " + infracao.getNrArtigo()
                + " | Pontos: " + infracao.getNrPontuacao());
        System.out.println("=========================================================\n");
    }
}
