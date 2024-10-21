package br.com.bluepoints.controller;

import br.com.bluepoints.model.Reciclagem;
import br.com.bluepoints.service.ReciclagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReciclagemController {

    @Autowired
    private ReciclagemService service;

    @PostMapping("/reciclagem")
    @ResponseStatus(HttpStatus.CREATED)
    public Reciclagem gravar(@RequestBody Reciclagem reciclagem){
        return service.gravar(reciclagem);
    }

    @GetMapping("/reciclagem")
    @ResponseStatus(HttpStatus.OK)
    public List<Reciclagem> listarTodasReciclagens(){
        return service.listarTodasReciclagens();
    }

    @DeleteMapping("/reciclagem/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void excluir(@PathVariable Long id){
        service.excluir(id);
    }

    @PutMapping("/reciclagem/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Reciclagem atualizar(@RequestBody Reciclagem reciclagem){
        return service.atualizar(reciclagem);
    }

}
