package br.com.joaocastro.dsmovie.services;

import br.com.joaocastro.dsmovie.dto.MovieDTO;
import br.com.joaocastro.dsmovie.entities.Movie;
import br.com.joaocastro.dsmovie.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return page;
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Movie result = repository.findById(id).get();
        MovieDTO dto = new MovieDTO(result);
        return dto;
    }

}
