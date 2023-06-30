package projetoweb.projetoweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetoweb.projetoweb.Model.Inscricao;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, Integer> {

}