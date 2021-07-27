package qmp.service;

import com.sun.jersey.api.client.Client;
import qmp.api.WeatherAPI;
import qmp.api.dto.EstadoDelClimaDTO;

import javax.ws.rs.core.MediaType;

// Adapter de WeatherAPI
public class ClimaService implements WeatherAPI {

    private static final String URL_DOMAIN = "http://dataservice.accuweather.com/";
    private static final String URL_PATH = "currentconditions/v1/";
    private static final Client client = Client.create();


    public EstadoDelClimaDTO obtenerEstadoDelClima(String ciudad){
        return client
            .resource(URL_DOMAIN)
            .path(URL_PATH)
            .queryParam("city",ciudad)
            .accept(MediaType.APPLICATION_JSON)
            .get(EstadoDelClimaDTO.class);
    }
}
