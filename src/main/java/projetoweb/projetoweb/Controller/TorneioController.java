package projetoweb.projetoweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoweb.projetoweb.Model.Categoria;
import projetoweb.projetoweb.Model.Torneio;
import projetoweb.projetoweb.Service.CategoriaService;
import projetoweb.projetoweb.Service.TorneioService;

import java.util.List;


@RestController
@RequestMapping(value = "/torneios")
@CrossOrigin(origins ="http://localhost:4200")
public class TorneioController {
    @Autowired
    private TorneioService service;

    @Autowired
    private CategoriaService categoriaService;
    //Consultar todas as categorias de um torneio
    @GetMapping()
    public ResponseEntity<List<Torneio>> findAll() {
        List<Torneio> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    //Consultar por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Torneio> findById(@PathVariable Integer id) {
        Torneio obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @GetMapping(value = "/{id}/categorias")
    public ResponseEntity<List<Categoria>> findAllCategoriaByTorneio(@PathVariable Integer id) {
        var obj = service.findById(id).getCategorias();
        return ResponseEntity.ok().body(obj);

    }

}
