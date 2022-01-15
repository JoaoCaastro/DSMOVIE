package br.com.joaocastro.dsmovie.repositories;

import br.com.joaocastro.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
