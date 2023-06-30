package projetoweb.projetoweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetoweb.projetoweb.Model.Torneio;

@Repository
public interface TorneioRepository extends JpaRepository<Torneio, Integer> {
}
