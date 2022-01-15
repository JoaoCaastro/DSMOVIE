package br.com.joaocastro.dsmovie.controllers;

import br.com.joaocastro.dsmovie.dto.MovieDTO;
import br.com.joaocastro.dsmovie.dto.ScoreDTO;
import br.com.joaocastro.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {

        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }
}


