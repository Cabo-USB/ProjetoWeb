package projetoweb.projetoweb.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import projetoweb.projetoweb.Model.Torneio;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TorneioDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;

    private String nome;


    public TorneioDTO(Torneio obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
    }
}
