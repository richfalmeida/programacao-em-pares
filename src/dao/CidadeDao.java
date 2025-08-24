package dao;

import model.Cidade;
import java.util.HashMap;
import java.util.Map;

public class CidadeDao {
    private static Map<Integer, Cidade> cidades = new HashMap<>();

    public void salvar(Cidade cidade) {
        cidades.put(cidade.getCdCidade(), cidade);
    }

    public Cidade buscar(int cdCidade) {
        return cidades.get(cdCidade);
    }
}
