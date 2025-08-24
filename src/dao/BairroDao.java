package dao;

import model.Bairro;
import java.util.HashMap;
import java.util.Map;

public class BairroDao {
    private static Map<Integer, Bairro> bairros = new HashMap<>();

    public void salvar(Bairro bairro) {
        bairros.put(bairro.getCdBairro(), bairro);
    }

    public Bairro buscar(int cdBairro) {
        return bairros.get(cdBairro);
    }
}
