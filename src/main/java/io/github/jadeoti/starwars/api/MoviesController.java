package io.github.jadeoti.starwars.api;

import io.github.jadeoti.starwars.service.SwapiRemoteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private SwapiRemoteService swapiRemoteService;

    @ApiOperation(value = "Get Movie")
    @GetMapping(value = "")
    ResponseEntity<String> getMovies(){

        //List<Movie> movies = swapiRemoteService.fetchMovie();


//        Movie names in the movie list endpoint should be sorted by release date
//        from earliest to newest and each movie should be listed along with #
//        opening crawls and count of comments



        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
