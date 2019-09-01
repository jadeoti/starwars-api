package io.github.jadeoti.starwars.service;

import io.github.jadeoti.starwars.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import
import org.springframework.web.client.RestTemplate;

/**
 * @author adedeji.adeoti on 9/1/2019
 * @project starwars-api
 */
public class SwapiRemoteService {

    @Autowired
    public RestTemplate restTemplate;

    @Value("${swapi.url}")
    String apiUrl;

    public ResponseEntity<Response> fetchMovie() {

        String url = apiUrl + "films";
        HttpHeaders headers = new HttpHeaders();
        //headers.setContentType(MediaType.APPLICATION_JSON);
        //headers.set("Accept", "application/json");
        //HttpEntity request = new HttpEntity(null, headers);
        return getRestTemplate().exchange(url, HttpMethod.GET, null, Response.class);

    }


    public RestTemplate getRestTemplate() {
        return restTemplate;
    }


}
