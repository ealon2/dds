package qmp.api;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import javax.ws.rs.core.MediaType;

public final class AccuWeatherAPI implements WeatherAPI {

    private static final String URL_DOMAIN = "http://dataservice.accuweather.com/";
    private static final String URL_PATH = "currentconditions/v1/";
    private static final Client client = Client.create();

    @Override
    public final ClientResponse getWeather(String ciudad){
        return client
            .resource(URL_DOMAIN)
            .path(URL_PATH)
            .queryParam("city",ciudad)
            .accept(MediaType.APPLICATION_JSON)
            .get(ClientResponse.class);
    }

}
