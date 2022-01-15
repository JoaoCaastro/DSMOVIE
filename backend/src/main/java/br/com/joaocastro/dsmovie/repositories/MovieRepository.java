package br.com.joaocastro.dsmovie.repositories;

import br.com.joaocastro.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {


}
