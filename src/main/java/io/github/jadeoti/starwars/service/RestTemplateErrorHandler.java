package io.github.jadeoti.starwars.service;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.IOException;

/**
 * @author adedeji.adeoti on 9/1/2019
 * @project starwars-api
 */
public class RestTemplateErrorHandler extends DefaultResponseErrorHandler {
    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        if (response.getRawStatusCode() == 404
                || response.getRawStatusCode() == 502
                || response.getRawStatusCode() == 503
                || response.getRawStatusCode() == 504) {
            return true;
        }
        return false; //we want to be able to parse the error response
    }
}
