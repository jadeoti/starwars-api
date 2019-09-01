package io.github.jadeoti.starwars.service;

import io.github.jadeoti.starwars.StarWarsApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author adedeji.adeoti on 9/1/2019
 * @project starwars-api
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StarWarsApplication.class)
@TestPropertySource(locations = {"classpath:application.properties"})
public class SwapiRemoteServiceTests {

    @Autowired
    SwapiRemoteService swapiRemoteService;

    @Test
    public void check_that_app_can_call_swapi_service_successfully(){
        swapiRemoteService.fetchMovie();

    }
}
