package io.github.jadeoti.starwars.config;

import io.github.jadeoti.starwars.service.RestTemplateErrorHandler;
import io.github.jadeoti.starwars.service.SwapiRemoteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author adedeji.adeoti on 9/1/2019
 * @project starwars-api
 */
@Configuration
public class StarWarsApiConfig {
    @Bean("restTemplate")
    public RestTemplate restTemplate() {
        //HttpComponentsClientHttpRequestFactory rf = new HttpComponentsClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate();
        //restTemplate.setErrorHandler(new RestTemplateErrorHandler());
        return restTemplate;
    }


    @Bean("swapiRemoteService")
    public SwapiRemoteService swapiRemoteService() {
        return new SwapiRemoteService();
    }

}
