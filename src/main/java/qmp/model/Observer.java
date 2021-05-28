package qmp.model;

import java.util.List;

public interface Observer {
    //Escucho sugerencias
    void escucharSugerencias(SugerenciaCommand sugerencia);
}
