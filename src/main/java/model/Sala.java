package model;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Sala")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sala {
    @Id
    private Integer codigo;

    @NotBlank
    @Column(length = 50)
    private String nombre;

    private Integer capacidad;

    private Integer idInstituto;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private TipoSala tipoSala;
}
