package model;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TipoSala")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoSala {
    @Id
    private Integer idTipo;

    @Column(length = 30)
    private String nombre;
}
