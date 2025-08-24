package main;

import java.util.List;

import dao.*;
import model.*;
import process.AitPrinter;
import process.DadosIniciaisLoader;

public class SistemaAitApp {
	public static void main(String[] args) {
        AgenteDao agenteDao = new AgenteDao();
        InfracaoDao infracaoDao = new InfracaoDao();
        CidadeDao cidadeDao = new CidadeDao();
        BairroDao bairroDao = new BairroDao();
        AitDao aitDao = new AitDao();

        DadosIniciaisLoader.carregar(agenteDao, infracaoDao, cidadeDao, bairroDao, aitDao);

        List<Ait> aits = aitDao.listarTodos();
        aits.forEach(ait -> AitPrinter.imprimir(ait, agenteDao, infracaoDao, cidadeDao, bairroDao));
    }
}
