package projetoweb.projetoweb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetoweb.projetoweb.Exception.ObjectNotFoundException;
import projetoweb.projetoweb.Model.Torneio;
import projetoweb.projetoweb.Repository.TorneioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TorneioService {

    @Autowired
    private TorneioRepository repository;

    @Autowired
    private CategoriaService service;

    public Torneio findById(Integer id) {
        Optional<Torneio> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id" + id + ", Tipo: " + Torneio.class.getName()));

    }
    public List<Torneio> findAll() {
        return repository.findAll();
    }

}
