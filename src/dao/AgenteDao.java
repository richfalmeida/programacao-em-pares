package dao;

import model.Agente;
import java.util.HashMap;
import java.util.Map;

public class AgenteDao {
    private static Map<Integer, Agente> agentes = new HashMap<>();

    public void salvar(Agente agente) {
        agentes.put(agente.getCdAgente(), agente);
    }

    public Agente buscar(int cdAgente) {
        return agentes.get(cdAgente);
    }
}
