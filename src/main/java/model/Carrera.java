package model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Carrera")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carrera {
    @Id
    @Column(length = 10)
    @NotBlank
    private String codigo;

    private String nombre;
}
