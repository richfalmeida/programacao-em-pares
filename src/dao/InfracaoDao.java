package dao;

import model.Infracao;
import java.util.HashMap;
import java.util.Map;

public class InfracaoDao {
    private static Map<Integer, Infracao> infracoes = new HashMap<>();

    public void salvar(Infracao infracao) {
        infracoes.put(infracao.getCdInfracao(), infracao);
    }

    public Infracao buscar(int cdInfracao) {
        return infracoes.get(cdInfracao);
    }
}
