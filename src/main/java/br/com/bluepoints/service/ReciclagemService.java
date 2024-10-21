package br.com.bluepoints.service;

import br.com.bluepoints.model.Reciclagem;
import br.com.bluepoints.repository.ReciclagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReciclagemService {

    @Autowired
    private ReciclagemRepository reciclagemRepository;

    public Reciclagem gravar(Reciclagem reciclagem){
        return reciclagemRepository.save(reciclagem);
    }

    public Reciclagem buscarPorId(Long id){

        Optional<Reciclagem> reciclagemOptional = reciclagemRepository.findById(id);

        if(reciclagemOptional.isPresent()){
            return reciclagemOptional.get();
        } else {
            throw new RuntimeException("Reciclagem não encontrada!");
        }
    }

    public List<Reciclagem> listarTodasReciclagens(){
        return reciclagemRepository.findAll();
    }

    public void excluir(Long id) {

        Optional<Reciclagem> reciclagemOptional = reciclagemRepository.findById(id);

        if(reciclagemOptional.isPresent()){
            reciclagemRepository.delete(reciclagemOptional.get());
        } else {
            throw new RuntimeException("Reciclagem não encontrada!");
        }
    }

    public Reciclagem atualizar(Reciclagem reciclagem){

        Optional<Reciclagem> reciclagemOptional = reciclagemRepository.findById(reciclagem.getId());

        if(reciclagemOptional.isPresent()){
            return reciclagemRepository.save(reciclagem);
        } else {
            throw new RuntimeException("Reciclagem não encontrada!");
        }
    }

}
