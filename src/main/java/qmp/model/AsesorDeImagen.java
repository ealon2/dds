package qmp.model;

import qmp.api.WeatherAPI;
import qmp.api.dto.EstadoDelClimaDTO;

import java.util.List;

public class AsesorDeImagen {

  private final WeatherAPI servicioMeteorologico;

  private AsesorDeImagen(WeatherAPI weatherAPI){
    this.servicioMeteorologico = weatherAPI;
  }

  public Atuendo sugerirAtuendo(String direccion, Guardarropas guardarropas) {
    EstadoDelClimaDTO estadoDelClimaDTO = this.servicioMeteorologico.obtenerEstadoDelClima(direccion);
    List<Atuendo> combinaciones = guardarropas.todasLasPosiblesCombinaciones();
    return combinaciones
        .stream()
        .filter(combinacion -> combinacion.aptaParaTemperatura(estadoDelClimaDTO.getTemperatureDTO().getValue()))
        .filter(combinacion -> combinacion.aptaParaHumedad(estadoDelClimaDTO.getTemperatureDTO().getValue()))
        .findFirst()
        .get();
  }
}
