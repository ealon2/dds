package qmp.model;

import qmp.api.MockAccuWeatherAPI;

import java.util.List;
import java.util.Map;

public class AccuWeather implements Clima {

    private MockAccuWeatherAPI apiClima = new MockAccuWeatherAPI();
    private List<Map<String, Object>> condicionesClimaticas;

    @Override
    public EstadoClima getWeather(String city) {
        condicionesClimaticas = apiClima.getWeather(city);
        return (EstadoClima) condicionesClimaticas.get(0).get("PrecipitationProbability");
    }
}
