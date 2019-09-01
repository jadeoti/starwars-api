package io.github.jadeoti.starwars.service;

import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author adedeji.adeoti on 9/1/2019
 * @project starwars-api
 */
public class ApiClient<T, S> {
    protected HttpHeaders headers;
    private RestTemplate restTemplate;
    private Class<T> returnedResponseClass;

    public ApiClient(RestTemplate restTemplate, Class<T> responseClass) {
        this.headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Accept", "application/json");
        this.restTemplate = restTemplate;
        this.returnedResponseClass = responseClass;
    }

    public void setHeader(String key, String value) {
        this.headers.set(key, value);
    }

    public List<String> getHeader(String key) {
        return this.headers.get(key);
    }

    public ResponseEntity<T> send(S requestObject, String serviceUrl, HttpMethod method) {
        HttpEntity<S> request = new HttpEntity<S>(requestObject, headers);
        return this.restTemplate.exchange(serviceUrl, method, request, returnedResponseClass);
    }
}
