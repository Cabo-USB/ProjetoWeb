package projetoweb.projetoweb.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import projetoweb.projetoweb.Model.Usuario;
import projetoweb.projetoweb.Repository.UsuarioRepository;

import java.util.Optional;

@Component
public class UsuarioDetalhesService implements UserDetailsService {

    private final UsuarioRepository repository;

    public UsuarioDetalhesService(UsuarioRepository repository) {
        this.repository = repository;
    }
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<Usuario> usuario = repository.findByLogin(login);
        if (usuario.isEmpty()) {
            throw new UsernameNotFoundException("Usuário [" + login + "] não encontrado");
        }
        return usuario.get();
    }
}
