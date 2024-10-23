package br.com.bluepoints.repository;

import br.com.bluepoints.model.Reciclagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReciclagemRepository extends JpaRepository<Reciclagem, Long> {

    //@Query("SELECT r FROM T_HIST_RECICLAGEM r WHERE r.id = :id")
    public Optional<Reciclagem> findById(Long id);

    public Optional<Reciclagem> findByUsuario(Long usuario);

}
