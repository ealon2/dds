package qmp.api;

import qmp.api.dto.EstadoDelClimaDTO;

public interface WeatherAPI {
  EstadoDelClimaDTO obtenerEstadoDelClima(String city);
}
