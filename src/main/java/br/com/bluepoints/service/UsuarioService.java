package br.com.bluepoints.service;

//import br.com.bluepoints.exception.ReciclagemNaoEncontradaException;
import br.com.bluepoints.model.Usuario;
import br.com.bluepoints.repository.UsuarioRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario gravar(Usuario usuario){

        String encondedPassword = new BCryptPasswordEncoder().encode(usuario.getPassword());
        usuario.setSenha(encondedPassword);

        return usuarioRepository.save(usuario);
    }

    /*public UsuarioExibirDto buscarPorId(Long id){

        Usuario usuario = usuarioRepository.findById(usuarioId);

        if(usuario.isPresent()){
            return new UsuarioExibirDto(usuarioOptional.get());
        } else {
            throw new UsuarioNaoEncontradoException("Usuário não encontrado!");
        }
    }

    /*public UsuarioExibirDto buscarPorUsuario(Long usuario){

        Optional<Reciclagem> reciclagemOptional = reciclagemRepository.findByUsuario(usuario);

        if(reciclagemOptional.isPresent()){
            return new ReciclagemExibirDto(reciclagemOptional.get());
        } else {
            throw new UsuarioSemReciclagemException("Usuário sem reciclagens!");
        }
    }

    public List<Usuario> listarTodosUsuarios(){
        return usuarioRepository.findAll();
    }

    public void excluir(Long id) {

        Optional<Usuario> reciclagemOptional = usuarioRepository.findById(usuarioId);

        if(reciclagemOptional.isPresent()){
            usuarioRepository.delete(usuarioOptional.get());
        } else {
            throw new UsuarioNaoEncontradoException("Usuário não encontrado para exclusão!");
        }
    }

    public Usuario atualizar(Usuario usuario){

        Optional<Usuario> usuarioOptional = usuarioRepository.findById(usuario.getId());

        if(usuarioOptional.isPresent()){
            return usuarioRepository.save(usuario);
        } else {
            throw new UsuarioNaoEncontradoException("Usuário não encontrado para atualizar!");
        }
    }
*/
}
