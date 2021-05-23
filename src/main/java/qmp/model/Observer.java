package qmp.model;

import java.util.List;

public interface Observer {
    //Escucho sugerencias
    void update(List<Prenda> sugerencia);
}
