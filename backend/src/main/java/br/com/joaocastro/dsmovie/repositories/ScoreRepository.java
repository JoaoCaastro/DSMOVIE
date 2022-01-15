package br.com.joaocastro.dsmovie.repositories;

import br.com.joaocastro.dsmovie.entities.ScorePK;
import br.com.joaocastro.dsmovie.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
