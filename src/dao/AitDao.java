package dao;

import model.Ait;
import java.util.ArrayList;
import java.util.List;

public class AitDao {
    private static List<Ait> aits = new ArrayList<>();

    public void salvar(Ait ait) {
        aits.add(ait);
    }

    public List<Ait> listarTodos() {
        return aits;
    }
}
