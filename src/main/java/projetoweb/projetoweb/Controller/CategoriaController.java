package projetoweb.projetoweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetoweb.projetoweb.DTO.CategoriaDTO;
import projetoweb.projetoweb.Model.Categoria;
import projetoweb.projetoweb.Service.CategoriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/cat")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    //Consultar categoria por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Integer id) {
        Categoria obj = categoriaService.findById(id);
        return ResponseEntity.ok().body(obj);

    }
    //Consulta de todas categorias
    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> findAll() {
        List<Categoria> list = categoriaService.findAll();
        List<CategoriaDTO> listDTO = list.stream().map(obj -> new CategoriaDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
}
