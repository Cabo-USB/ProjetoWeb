package projetoweb.projetoweb.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import projetoweb.projetoweb.Model.Categoria;
import projetoweb.projetoweb.Model.Usuario;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InscricaoDTO {

    private int id;

    private Categoria categoria;

    private Usuario usuario1;

    private Usuario usuario2;


}
