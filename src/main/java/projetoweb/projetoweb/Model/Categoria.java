package projetoweb.projetoweb.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cat_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "cat_nr_id")
    private int id;

    @Column(name = "cat_tx_nome", nullable = false, length = 100)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "torneio_id", nullable = false)
    @JsonIgnore
    private Torneio torneio;

}
