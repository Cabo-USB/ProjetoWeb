package projetoweb.projetoweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetoweb.projetoweb.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer > {
}
