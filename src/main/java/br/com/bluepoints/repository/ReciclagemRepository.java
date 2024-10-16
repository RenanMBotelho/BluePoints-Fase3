package br.com.bluepoints.repository;

import br.com.bluepoints.model.Reciclagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReciclagemRepository extends JpaRepository<Reciclagem, Long> {

    //@Query("SELECT r FROM T_HIST_RECICLAGEM r WHERE r.id = :id")
    public Reciclagem findById(String id); // VERIFICAR SE NÃO DARÁ ERRO POR CONTA DO STRING

}
