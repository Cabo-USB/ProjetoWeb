package projetoweb.projetoweb.Service;

import com.auth0.jwt.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetoweb.projetoweb.Model.Categoria;
import projetoweb.projetoweb.Model.Inscricao;
import projetoweb.projetoweb.Model.Usuario;
import projetoweb.projetoweb.Repository.CategoriaRepository;
import projetoweb.projetoweb.Repository.InscricaoRepository;
import projetoweb.projetoweb.Repository.UsuarioRepository;


@Service
public class InscricaoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Inscricao criar(int categoriaid, String token, Usuario usuario) {
        Categoria categoria = categoriaRepository.findById(categoriaid).get();

        var js = JWT.decode(token.replace("Bearer ", "")).getSubject();

        Usuario usuario1 = usuarioRepository.findByLogin(js).get();
        Inscricao inscricao = new Inscricao(categoria, usuario1, usuario);
        return inscricaoRepository.save(inscricao);
    }

}