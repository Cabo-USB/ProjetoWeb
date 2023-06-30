package projetoweb.projetoweb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetoweb.projetoweb.Exception.ObjectNotFoundException;
import projetoweb.projetoweb.Model.Categoria;
import projetoweb.projetoweb.Repository.CategoriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id" + id + ", Tipo: " + Categoria.class.getName()));
    }
    public List<Categoria> findAll() {
        return repository.findAll();
    }

}
