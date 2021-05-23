package qmp.model;

import qmp.api.AccuWeatherAPI;

import java.util.List;
import java.util.Map;

public class AccuWeather implements Clima {

    private AccuWeatherAPI apiClima = new AccuWeatherAPI();
    private List<Map<String, Object>> condicionesClimaticas;

    @Override
    public EstadoClima getWeather(String city) {
        condicionesClimaticas = apiClima.getWeather(city);
        return (EstadoClima) condicionesClimaticas.get(0).get("PrecipitationProbability"); //Devuelve un número del 0 al 1
    }
}
