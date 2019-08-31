package io.github.jadeoti.starwars.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author adedeji.adeoti on 8/31/2019
 * @project starwars-api
 */

@RestController()
@RequestMapping("api/v1/star-wars/movies")
public class MoviesController {

    @GetMapping(value = "/test")
    ResponseEntity<String> test(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
