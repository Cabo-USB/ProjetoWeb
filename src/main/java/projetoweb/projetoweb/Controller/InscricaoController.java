package projetoweb.projetoweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoweb.projetoweb.Repository.UsuarioRepository;
import projetoweb.projetoweb.Service.InscricaoService;


@RestController
@RequestMapping("/api/inscricao")
public class InscricaoController{

    @Autowired
    private InscricaoService inscricaoService;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/{idCategoria}/incricao")
    public ResponseEntity<?> criar(@PathVariable("idCategoria") int Categoriaid, @RequestHeader("Authorization") String token,
                                   @RequestParam String login) {

        var usuario = usuarioRepository.findByLogin(login);
        if (usuario.isPresent()) {
            var incricao = inscricaoService.criar(Categoriaid, token, usuario.get());
            return ResponseEntity.status(HttpStatus.CREATED).body(incricao);
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha na inscrição");

        }

    }

}